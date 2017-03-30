#### 简介
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本项目基于AOP及注解，实现缓存的控制。但是不同于简单缓存的是，项目使用了Spring的EL表达式，可以实现key的自定义。

#### 项目的结构
```
└─src
    └─main
        ├─java
        │  └─com
        │      └─afu
        │          └─cache
        │              ├─aop
        │              ├─cache
        │              └─test
        └─resources
            └─META-INF
                └─spring

```
#### 主要功能
1、AOP拦截实现redis注解

2、可在注解中自定义key

3、可自定义缓存时间
####
未完待续

