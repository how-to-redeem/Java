//计算1-5的阶乘和

package work;


public class jiechengyidaowu {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i <= 5;i++){
            sum += factor(i);
    }
    System.out.println("sum = " +sum);
}
    public static int factor(int n){
        System.out.println("计算n的阶乘中：n = "+ n);
        int result = 1;
        for(int i = 1;i <= n;i++ ){
            result *= i;
        }
            return result;
    }
}
