package other;
//股票最大收益问题
//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
public class gupiao {

    public static void main(String[] args) {
        //int[] prices={7,1,5,3,6,4};
        int[] prices={8,11,1,3,0};
        fun1(prices);
        fun2(prices);
    }
    //只允许一次操作（即一次买入一次卖出）
    //时间复杂度O(n的平方)
    public static  void fun1(int[] prices){
        int max=0;
        int ru=-1;
        int chu=-1;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]-prices[i]>max){
                    max=prices[j]-prices[i];
                    ru=i+1;
                    chu=j+1;
                }
            }
        }
        System.out.println("最大收益"+max+"；买入时间"+ru+";卖出时间"+chu);
    }

    public static void fun2(int[] prices){
        int max=0;
        int minprice=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minprice){
                minprice=prices[i];
            }else {
                if(prices[i]-minprice>max){
                    max= prices[i]-minprice;
                }
            }
        }
        System.out.println("最大收益"+max);
    }
}
