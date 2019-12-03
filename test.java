package packaging;

class renlei{
    private int age;
    private  String name;
    private String sex;
    private static int count = 10;

    public renlei(){
        System.out.println("构造方法");
    }

    {
        this.age = 12;
        this.name = "coco";
        this.sex = "girl";
        System.out.println("实例代码块");
    }

    static {
        int count =  100;
        System.out.println("静态代码块");
    }

    public void show(){
        System.out.println("name"+name+"age"+age+"sex"+sex);
    }

}


public class test {
    public static void main(String[] args){
      renlei renlei1 = new renlei();
      renlei renlei2 = new renlei();
      renlei1.show();
      renlei2.show();
    }
}