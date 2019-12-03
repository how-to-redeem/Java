package packaging;

class one{
    private int age;
    private String name;

    public one(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void show(){
        System.out.println("name"+name+"age"+age);
    }

    //重写object的toString方法
    @Override
    public  String toString(){
        return "Person{" + "name='" + name + '\'' +", age=" + age +
                '}';
    }


}


public class test2 {
    public static void main(String[] args){
          one one1 = new one(19,"coco") ;
          one1.show();
        System.out.println(one1);
    }
}
