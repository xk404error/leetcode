package other;

//允许多次操作
public class gupiao2 {
    public static void main(String[] args) {
        int[] prices={7,1,9,5,3,6,4};
        fun1(prices);
    }
    public static  void fun1(int[] prices){
        int max=0;
        for (int i = 0; i <prices.length-1 ; i++) {
            if(prices[i]<prices[i+1]){
                max=max+prices[i+1]-prices[i];
            }
        }
        System.out.println(max);
    }
}
