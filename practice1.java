//有一对兔子，从出生第三个月起每个月都生一对兔子，
// 小兔子长到第三个月后，每个月又生一对兔子，假如兔子都不死，
// 问M个月时兔子的数量，M为键盘读入的正整数。（请用Java语言作答）
package practice;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        long s1 = 1;
        long s2 = 1;
        int count;
        long temp;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i == 1) {
                System.out.println("第" + i + "个月的兔子对数：" + s1);
                continue;
            } else if (i == 2) {
                System.out.println("第" + i + "个月的兔子对数：" + s2);
                continue;
            } else {
                temp = s2;
                s2 = s1 + s2;
                s1 = temp;
                System.out.println("第" + i + "个月的兔子对数：" + s2);
            }
        }
    }
}