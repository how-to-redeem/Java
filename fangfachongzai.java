//方法重载计算两个数相加的值


package work;

public class fangfachongzai {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int ret1 = add(x,y);
        System.out.println("ret1 = ："+ret1);

        double a = 1.0;
        double b = 2.0;
        double ret2 = add(a,b);
        System.out.println("ret2 = ："+ ret2);

        double a3 = 10.5;
        double b3 = 10.5;
        double c3 = 20.5;
        double ret3 = add(a3, b3, c3);
        System.out.println("ret3 = " + ret3);
}
    public static int add(int x,int y){
        System.out.println("调用方法中:x = "+ x +"y = "+y);
        return x + y;
    }
    public static double add(double a,double b){
        System.out.println("调用方法中:a = "+ a +"b = "+b);
        return a + b;
    }
    public static double add(double x, double y, double z) {
        System.out.println("调用方法中:a = "+ x +"b = "+y+"c = "+z);
        return x + y + z;    }
}







