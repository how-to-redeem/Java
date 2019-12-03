package packaging;

class jisuanqi{
    public int num1;
    public int num2;

    public jisuanqi(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add(){
        System.out.println(num1 + num2);
    }

    public void sub(){
        System.out.println(num1 - num2);
    }

    public void sql(){
        System.out.println(num1 * num2);
    }

    public void chu(){
        if(num2 == 0){
            System.out.println("输入非法");
        }
        else{
            System.out.println(num1 / num2);
        }
    }
    }

public class Calculator {
    public static void main(String[] args){
        jisuanqi jisuanqi1 = new jisuanqi(6,2);
        jisuanqi1.add();
        jisuanqi1.sub();
        jisuanqi1.sql();
        jisuanqi1.chu();
    }
}

