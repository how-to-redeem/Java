package packaging;


class number{
    public int a;
    public int b;

    public number(int a,int b){
        this.a = a;
        this.b = b;
    }

    public void jiaohuan(){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a="+a+"b="+b);
    }
}

public class change {
    public static void main(String[] args){
        number number1 = new number(2,3);
        number1.jiaohuan();
    }
}
