package easy;

//插入排序
//时间复杂度O(n的平方)
//插入的数据与左边已经排序好的数据进行对比，从最后一位进行对比，找到自己的位置
public class InSort {

    public static int[] sort(int[] arry){
        int insert;//要插入数据
        int index;//插入数据对比位置

        for (insert=1; insert < arry.length; insert++) {
            index=insert-1;
            int inserval = arry[insert];
            while(index>=0 && inserval <arry[index]){
                arry[index+1]= arry[index];
                index--;
            }
            arry[index+1]=inserval;
        }
        return arry;
    }
}
