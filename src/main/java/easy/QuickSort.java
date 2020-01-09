package easy;

//快速排序
//时间复杂度O(n*logn)
//找一个基准值，通过循环将小于他的数据放在他的左边，大于他的数据放到他的右边(即找到基准值在数组中的正确的位置)
//接下来将 分割的左右数组再次进行上述操作
public class QuickSort {

    public static void sort(int[] array, int low, int high) {
        int start = low;
        int end = high;
        int key = array[low];
        while (start < end) {
            while (start < end && array[end] >= key) {
                end--;
            }
            if (array[end] <= key) {
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
            }

            while (start < end && array[start] <= key) {
                start++;
            }
            if (array[start] >= key) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }

        }
        if (start > low) sort(array, low, start - 1);
        if (end < high) sort(array, end + 1, high);
    }

    public static void sort2(int[] a, int low, int high) {
        int start = low;
        int end = high;

        int key = a[low];
        while (end > start) {
            //从后往前比较
            while (end > start && a[end] >= key)
//如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while (end > start && a[start] <= key)
//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的
            //值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if (start > low) sort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if (end < high) sort(a, end + 1, high);//右边序列。从关键值索引+1 到最后一个
    }
}
