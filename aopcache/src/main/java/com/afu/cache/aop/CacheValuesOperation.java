package com.afu.cache.aop;

import com.afu.cache.cache.CacheableAop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 切面类，用来处理加了缓存的方法的缓存逻辑
 * </p>
 *
 * @author fulei.yang
 * @version 0.0.1
 * @date 2016/11/03
 */
@Aspect
public class CacheValuesOperation {
    @Autowired
    private RedisTemplate<String, Object> aopCacheRedisTemplate;

    /**
     * <p>
     * 有注解标示的方法都会纳入缓存体系中,缓存的key由调用方自己决定，方法不做处理,支持spel表达式
     * </p>
     * <p>环绕通知</p>
     * <p>比较难的地方就是所有的插入操作和修改操作都返回的是影响的行数，而并非结果</p>
     *
     * @param pjp
     * @param cache
     * @return
     * @throws Throwable
     */
    @Around("@annotation(cache)")
    public Object redisCachedAround(final ProceedingJoinPoint pjp, CacheableAop cache) throws Throwable {
        String keyCache = cache.key();
        Method method = getMethod(pjp);
        String key = parseKey(keyCache, method, pjp.getArgs());
        ValueOperations<String, Object> valueOperations = aopCacheRedisTemplate.opsForValue();
        Object value = valueOperations.get(key);
        if (null != value) {
            return value;
        }
        value = pjp.proceed();
        // 如果没有设置过期时间，则永久缓存
        Integer time = cache.expire();
        if (time <= 0) {
            valueOperations.set(key, value);
        } else {
            valueOperations.set(key, value, time, TimeUnit.SECONDS);
        }
        return value;
    }

    /**
     * 更新缓存
     */
    public void main(String[] args) {
//        getMethod();
    }
    /**
     * <p>
     * 获取被拦截方法对象, MethodSignature.getMethod() 获取的是顶层接口或者父类的方法对象 而缓存的注解在实现类的方法上
     * 所以应该使用反射获取当前对象的方法对象
     * </p>
     *
     * @author fulei.yang
     * @date 2016/11/03
     * @version 0.0.1
     */
    private Method getMethod(ProceedingJoinPoint pjp) {
        // 获取参数的类型
        Object[] args = pjp.getArgs();
        Class[] argTypes = new Class[pjp.getArgs().length];
        for (int i = 0; i < args.length; i++) {
            // 做好转换
            argTypes[i] = args[i].getClass();
            /*当参数是接口的时候进行匹配*/
            Type[] genericInterfaces = args[i].getClass().getGenericInterfaces();
            for (Type genericInterface : genericInterfaces) {
                if (genericInterface instanceof ParameterizedTypeImpl) {
                    argTypes[i] = ((ParameterizedTypeImpl) genericInterface).getRawType();
                }
            }
        }
        Method method = null;
        // 自动向上转型
        try {
            method = pjp.getTarget().getClass().getMethod(pjp.getSignature().getName(), argTypes);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        return method;
    }

    /**
     * <p>
     * 获取缓存的key key 定义在注解上，支持SPEL表达式
     * </p>
     *
     * @param args
     * @return key 调用方设置的key
     * @author fulei.yang
     * @date 2016/11/03
     * @version 0.0.1
     */
    private String parseKey(String key, Method method, Object[] args) {
        // 获取被拦截方法参数名列表(使用Spring支持类库)
        LocalVariableTableParameterNameDiscoverer localVariableTableParameterNameDiscoverer = new LocalVariableTableParameterNameDiscoverer();
        String[] paraNameArr = localVariableTableParameterNameDiscoverer.getParameterNames(method);
        // 使用SPEL进行key的解析
        ExpressionParser parser = new SpelExpressionParser();
        // SPEL上下文
        StandardEvaluationContext context = new StandardEvaluationContext();
        // 把方法参数放入SPEL上下文中
        for (int i = 0; i < paraNameArr.length; i++) {
            context.setVariable(paraNameArr[i], args[i]);
        }
        return parser.parseExpression(key).getValue(context, String.class);
    }
}
