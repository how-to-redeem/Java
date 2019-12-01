package packaging;

class ren{
    private int age;
    private String name;
    private String sex;

    public ren(){
        System.out.println("方法");
    }

    {
        this.age = 18;
        this.name = "yuyu";
        this.sex = "girl";
        System.out.println("代码块");
    }
    public void show(){
        System.out.println("name"+name+"age"+age+"sex"+sex);
    }
}


public class person {
    public static void main(String[] args){
        ren ren1 = new ren();
        ren1.show();
    }
}
