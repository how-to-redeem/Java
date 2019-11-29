package kind;


class Personwang {
    int age = 18;
    String name = "王羽";
    public void test(){
        System.out.println("我叫"+name+"年龄"+age);
    }
}
public class kind1 {
    public static void main(String[] args){
        Personwang person = new Personwang();
        System.out.println(person.age);
        System.out.println(person.name);
    }
}
