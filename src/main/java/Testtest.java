public class Testtest {
    public static void main(String[] args) {
        String a="ab";
        String test=new String("ab");
        String te="a"+"b";
        System.out.println(a==test);
        System.out.println(a==te);
        System.out.println(a==test.intern());
    }
}
