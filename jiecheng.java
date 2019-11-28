//递归求n的阶乘

package work;

public class jiecheng {
    public static void main(String[] args){

        int n = 5;
        System.out.println(factor(n));
    }
    public static int factor(int n){
        if(n == 1)
            return 1;
        else
            return n*factor(n-1);
    }
}




