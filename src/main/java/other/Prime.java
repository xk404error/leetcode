package other;

//找1-n之内的质数

public class Prime {

    public static void main(String[] args) {
        fun1(1000);
        fun2(1000);
    }

    public static void fun1(int num){
        boolean[] resB = new boolean[num+1];
        for (int i = 2; i <resB.length ; i++) {
            resB[i]=true;
        }
        for (int i = 3; i <= num; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    resB[i]=false;
                }
            }
        }
        System.out.println("质数有：");
        for (int i = 2; i < resB.length; i++) {
            if(resB[i]){
                System.out.print(i+" ");
            }
        }
    }

    public static void fun2(int num){
        boolean[] resb = new boolean[num+1];
        for (int i = 2; i <resb.length ; i++) {
            resb[i]=true;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            for (int j = 2; i*j <= num; j++) {
                resb[i*j]=false;
            }
        }

        System.out.println("质数有：");
        for (int i = 2; i < resb.length; i++) {
            if(resb[i]){
                System.out.print(i+" ");
            }
        }
    }


}
