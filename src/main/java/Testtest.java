import java.util.ArrayList;
import java.util.List;

public class Testtest {

    public final int x;

    public Testtest() {
        x=1;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        /*String a="ab";
        String test=new String("ab");
        String te="a"+"b";
        System.out.println(a==test);
        System.out.println(a==te);
        System.out.println(a==test.intern());*/
        /*List list1=new ArrayList();
        list1.add(1);
        List list2=null;
        list1.addAll(list2);
        for (Object o : list1) {
            System.out.println(o.toString());
        }*/
        System.out.println(test1());
    }

    public static int test1(){
        int a;
        try{
            //int i = 1 / 0;
            a=2;
            return a;
        }catch (Exception e){
            a=3;
            System.out.println(a);
        }finally {
            a=4;
            System.out.println("finally"+a);
            //String.format()
            return a;
        }

    }
}
