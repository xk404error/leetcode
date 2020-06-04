package leetcode;

public class Test915 {
    public int partitionDisjoint(int[] A) {
        int[] maxLeft=new int[A.length];
        int[] minRight=new int[A.length];
        int max=A[0];
        for (int i = 0; i <A.length ; i++) {
            max=Math.max(max,A[i]);
            maxLeft[i]=max;
        }
        int min=A[A.length-1];
        for (int i = A.length-1; i >=0 ; i--) {
            min=Math.min(min,A[i]);
            minRight[i]=min;
        }

        for (int i = 1; i <A.length ; i++) {
            if(maxLeft[i-1]<minRight[i]){
                return i;
            }
        }
        return 0;
    }
}
