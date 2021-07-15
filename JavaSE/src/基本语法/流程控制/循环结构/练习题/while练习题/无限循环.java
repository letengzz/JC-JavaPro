package 基本语法.流程控制.循环结构.练习题.while练习题;

import java.util.Scanner;

/**
 * 从键盘读入个数不确定的整数 并判断读入的正数 和负数的个数 输入0时结束程序
 * */
public class 无限循环 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0;//记录正数的个数
        int negativeNumber = 0;//记录负数的个数
        while (true){
            int number = scan.nextInt();

            //判断number正负情况
            if (number > 0){
                positiveNumber++;
            }else if (number < 0){
                negativeNumber++;
            }else {
                //一旦执行break 跳出循环
                break;
            }



        }
            System.out.println("输入的正数为"+positiveNumber);
            System.out.println("输入的负数为"+negativeNumber);
    }
}
