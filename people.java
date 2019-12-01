package packaging;

class peoples {
    private int age;
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("name" + name + "age" + age);
    }
}

public class people {
    public static void main(String[] args){
        peoples p1 = new peoples();
        p1.setName("yuyu");
        String name = p1.getName();
        System.out.println("name"+name);
        p1.show();
    }
}
