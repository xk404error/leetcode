public class Test4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int m1,m2,param=2;

        if(len1%2==1){
            m1=nums1[len1/2];
        }else if(len1%2==0){
            param++;
            m1=nums1[len1/2];
        }
        return 0.0;
    }
}
