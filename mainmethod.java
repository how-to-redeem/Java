package kind;


class testdemo{
    public int a;
    public static int count;
}
public class mainmethod {
    public static void main(String[] args){
        testdemo test1 = new testdemo();
        test1.a++;
        test1.count++;
        System.out.println(test1.a);
        System.out.println(test1.count);
        System.out.println("----------");
        testdemo test2 = new testdemo();
        test2.a++;
        test2.count++;
        System.out.println(test2.a);
        System.out.println(test2.count);
    }
}