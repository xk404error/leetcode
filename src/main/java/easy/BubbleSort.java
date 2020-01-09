package easy;

//冒泡排序
//时间复杂度是O(n的平方)
//每一次效果是将 最大值找到并移动到数组末尾
public class BubbleSort {

    public static int[] sort(int[] array){
        int length = array.length;
        int i ,j;
        for ( i = 0; i <length ; i++) {
            for (j = 1;  j< length-i; j++) {
                if(array[j-1]>array[j]){
                    //交换位置
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        return array;
    }
}
