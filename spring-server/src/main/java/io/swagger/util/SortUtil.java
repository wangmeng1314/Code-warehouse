package io.swagger.util;

/**
 * 排序算法实践
 * 用户：lenovo
 * 日期：4/24/2017
 * 时间：8:24 AM
 */
public class SortUtil {
    public static void main(String[] args) {
        int[] in = new int[10];
        for (int i = 0; i <= 9; i++) {
            in[i] = 9 - i;
        }
        choiceSort(in);
        print(in);
    }

    /**
     * 选择排序,每次找到无序序列中最大的数字，放到序列的末位
     * 选择排序是不稳定的
     * TODO 有问题，排序结果不正确
     */
    private static void choiceSort(int[] in) {
        for (int i = 0; i < in.length; i++) {
            int max = 0;
            int temp = -1;
            /*寻找最大值*/
            for (int j = 0; j < in.length - i; j++) {
                if (max < in[j]) {
                    temp = j;
                }
            }
            if (temp != -1) {
                swap(in[temp], in[in.length - i - 1]);
            }
        }
    }


    /**
     * <p>冒泡排序</p>
     * <p>双层for循环，一层负责比较的次数，一层负责比较并移位</p>
     *
     * @param in
     */
    private static void bubbleSort(int[] in) {
        int length = in.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (in[j] <= in[j + 1]) {
                    continue;
                } else {
                    swap(in[i], in[i + 1]);
                }
            }
        }
    }

    /**
     * 改进版本冒泡
     */
    private static void bubbleSortUp(int[] in) {
        int length = in.length;

        for (int i = 0; i < length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (in[j] <= in[j + 1]) {
                    continue;
                } else {
                    swap(in[i], in[i + 1]);
                    flag = true;
                }
                if (!flag) {
                    break;
                }
            }
        }
    }

    /**
     * 快速排序实现,其是冒泡排序的升级版本
     *
     * @param arr
     * @param low
     * @param high
     */
    public static int[] sort(int arr[], int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];
        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                swap(arr[l], arr[h]);
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                swap(arr[l], arr[h]);
                h--;
            }
        }
//        System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit + "\n");
        if (l > low) sort(arr, low, l - 1);
        if (h < high) sort(arr, l + 1, high);
        return arr;
    }

    private static void swap(int s1, int s2) {
        int temp = 0;
        temp = s2;
        s2 = s1;
        s1 = temp;
    }

    private static void print(int[] in) {
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }

}

