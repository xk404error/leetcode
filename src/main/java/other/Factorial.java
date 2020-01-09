package other;

//阶乘
public class Factorial {

    public static void main(String[] args) {
        System.out.println(fun1(5));
    }
    public static int fun1(int num){
        if(num>1){
            return num*fun1(num-1);
        }else if(num==1){
            return 1;
        }else if (num==0){
            return 0;
        }else {
            return -1;
        }
    }
}
