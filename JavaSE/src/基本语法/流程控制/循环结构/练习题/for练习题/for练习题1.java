package 基本语法.流程控制.循环结构.练习题.for练习题;

import java.util.Scanner;

/**
 * 输入两个正整数m 和 n 求其最大公约数和最小公倍数
 * 比如 12和 20 最大公倍数 4 最小公倍数是60
 * break关键字的使用
 * */
public class for练习题1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("m");
        int m = scanner.nextInt();
        System.out.println("n");
        int n = scanner.nextInt();

        //获取最大公约数
        //获取两个数中的较小值
        int min = (m<=n)?m:n;
        for (int i = min;i > 1;i--){
            if (m % i == 0 && n % i == 0){
                System.out.println(i);
                break;//一旦在循环中执行break 就跳出循环
            }
        }
        //获取最小公倍数
        //获取两个数中的较大数
        int max = (m >= n)?m:n;
        for (int i = max;i <= m * n;i++){
            System.out.println(i);
            break;
        }

    }
}
