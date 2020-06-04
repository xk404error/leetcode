package leetcode;

import java.util.ArrayList;

public class Test1262 {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        Integer zero = null;
        Integer one = null;
        Integer two = null;
        for (int num : nums) {
            sum += num;
            if (num % 3 == 0) {
                if (zero == null) zero = num;
                zero = zero > num ? num : zero;
            }
            if (num % 3 == 1){
                if (one == null) one = num;
                one = one > num ? num : one;
            }
            if (num % 3 == 2) {
                if (two == null) two = num;
                two = two > num ? num : two;
            }
        }
        if (sum % 3 == 0) {
            return sum;
        } else if (sum % 3 == 1) {
            return sum - one;
        } else {
            return sum - two;
        }
    }
}
