//实现两个整数相加


package work;

public class sum {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int ret = add(x,y);
        System.out.println("第一次方法调用的结果是："+ret);

        ret = add(30,50);
        System.out.println("第二次方法调用的结果是："+ ret);

    }
    public static int add(int x,int y){
        System.out.println("调用方法中:x = "+ x +"y = "+y);
        return x + y;
    }

}
