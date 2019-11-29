package kind;

class people{
    public int age = 18;
    public static String name;
    public static void test(){
        name = "小四";
    }
}
public class hi {
    public static void main(String[] args){
    people.test();
    System.out.println(people.name);
}
  }