package easy;

import java.util.Arrays;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        /*int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i]= random.nextInt(100);
        }*/
        int[] array={40, 93, 56, 3, 31, 12, 96, 66, 35, 90};
        System.out.println(Arrays.toString(array));

        //QuickSort.sort(array,0,array.length-1);
        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
