
package kind;


class Personone {
    int age = 18;
    String name = "王羽";

    public void test(){
        System.out.println("我叫"+name+"年龄"+age);
    }
}


 public class lei{
    public static void main(String[] args){
        Personone person = new Personone();

        Personone person1 = new Personone();
        person1.age = 18;
        person1.name = "峰峰";
        person1.test();
    }
}