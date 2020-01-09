package leetcode;

/**
 * @description:
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @author: xk
 * @create: 2018-08-31 14:49
 **/
public class Test1 {

    public static void main(String[] args) {
        int[] nums = {32,2,2, 7, 11, 15,3,6,1};
        int target=4;
        int[] results = twoSum(nums, target);
        if(results!=null){
            for (int i = 0; i < results.length; i++) {
                System.out.println(results[i]);
            }
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] results=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i+1; j < nums.length; j++) {

                    int num1 = nums[j];
                    if(num1==target-num){
                        results[0]=i;
                        results[1]=j;
                        return results;
                    }

            }
        }
        return null;
    }
}

