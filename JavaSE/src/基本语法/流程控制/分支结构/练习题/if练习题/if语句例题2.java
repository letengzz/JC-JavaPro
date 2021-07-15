package 基本语法.流程控制.分支结构.练习题.if练习题;

import java.util.Scanner;

/**
 * 由键盘输入三个整数分别存入变量num1 num2 num3 对他们进行排序 并从小到大输出
 * */
public class if语句例题2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int num1 = scanner.nextInt();

        System.out.println("请输入第二个整数");
        int num2 = scanner.nextInt();

        System.out.println("请输入第三个整数");
        int num3 = scanner.nextInt();

        if (num1 >= num2){
            if (num3 >= num1){
                System.out.println(num2 + "," + num1 + "," + num3);
            }else if (num3 <= num2){
                System.out.println(num3 + "," + num2  + "," + num1 );
            }else {
                System.out.println(num2 + "," + num3  + "," + num1 );
            }
        }else {
            if (num3 >= num2){
                System.out.println(num1 + "," + num2 + "," + num3);
            }else if (num3 <= num1){
                System.out.println(num3 + "," + num1  + "," + num2);
            }else {
                System.out.println(num1 + "," + num3  + "," + num2 );
            }
        }
    }
}
