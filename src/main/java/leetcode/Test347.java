package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
public class Test347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res=new ArrayList<Integer>(k);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        

        return res;
    }
}
