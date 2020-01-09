package leetcode;

/**
 * @description: 给定一个字符串，找出不含有重复字符的最长子串的长度
 * @author: xk
 * @create: 2018-09-03 09:57
 **/
public class Test3 {
    public static void main(String[] args) {
        String s = new String("abcabcbb");
        String s1 = new String("bbbbb");
        String s2 = new String("pwwkew");
        String s4 = new String(" ");
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s4));
    }
    public static int lengthOfLongestSubstring(String s) {
        if("".equals(s.trim())||null==s){
            return 0;
        }
        char[] chars = s.toCharArray();
        int result=0;
        int tempStart=0;
        int tempEnd=0;
        for (int i=1; i < chars.length; i++) {
            int tempRes=1;
            for (int j = tempStart; j <i ; j++) {
                if(chars[j]==chars[i]){
                    tempEnd=i;
                    tempRes=tempEnd-tempStart;
                    result=result>tempRes?result:tempRes;
                    tempStart=j+1;
                    break;
                }
                tempRes++;
                result=result>tempRes?result:tempRes;
            }
        }
        return result;
    }

}
