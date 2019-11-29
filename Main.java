package kind;

class Persons{
    int age;
    String name;
    String sex;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

        }
public class Main {
    public static void main(String[] arg){
        Persons person =  new Persons();
        person.eat();
        person.sleep();
        Persons person1 = new Persons();
        Persons person2 = new Persons();
    }
}
