package 基本语法.流程控制.循环结构.练习题.for练习题;

import java.util.Scanner;
/**
 * 从键盘读入个数不确定的整数 并判断读入的正数 和负数的个数 输入0时结束程序
 * 说明
 * 1不在循环条件部分限制次数的结构 for(;;) 或while(true)
 * 2结束循环方式
 *      方式一 循环条件部分返回false
 *      方式二 在循环体中执行break
 *
 * */
public class 无限循环 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0;//记录正数的个数
        int negativeNumber = 0;//记录负数的个数
        for (;;){
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
