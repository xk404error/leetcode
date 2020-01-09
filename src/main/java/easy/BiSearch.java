package easy;

//要查找的数组是有序的
//二分查找
public class BiSearch {

    public static int biSearch(int[] arry,int dec){
        int lo=0;
        int hi = arry.length;
        int mid=-1;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(arry[mid]==dec){
                return mid;
            }else if (arry[mid]>dec){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return mid;
    }
}
