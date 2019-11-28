import java.util.Random;
import java.util.Scanner;
public class HomeWork2 {
    /**
     * 系统自动生成一个随机整数(1-100), 然后由用户输入一个猜测的数字. 
     * 如果输入的数字比该随机数小, 提示 "低了", 
     * 如果输入的数字比该随机数大, 提示 "高了" , 
     * 如果输入的数字和随机数相等, 则提示 "猜对了" .
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int guess = random.nextInt(100);
        System.out.println(guess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type a number:");
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if(num < guess) {
                System.out.println("small");
            }else if(num > guess) {
                System.out.println("big");
            }else {
                System.out.println("right!");
                break;
            }
            System.out.println("please type a number:");
        }
    }
}