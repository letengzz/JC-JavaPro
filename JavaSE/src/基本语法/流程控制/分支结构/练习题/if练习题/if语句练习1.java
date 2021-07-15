package 基本语法.流程控制.分支结构.练习题.if练习题;

import java.util.Scanner;

/**
 * 1声明2个int变量并赋值 判断两数之和 如果大于50打印hello
 * 2声明2个double变量并赋值判断第一个数大于10.0且第二个数大于20.0打印两数之和 否则打印两数乘积
 * 3 狗的前两年每一年相当于人类的10.5岁 之后每增加一年就增加四岁 那么五岁的狗相当于人类
 *  10.5+10.5+4+4+4 = 33岁
 *  编写一个程序获取用户输入的狗的年龄 通过程序显示其相当于人类的年龄 如果用户输入负数请显示一个它提示信息
 *
 * */
public class if语句练习1 {
    public static void main(String[] args) {
        //第一题
        int num1 = 50;
        int num2 = 24;
        if (num1+num2 > 50){
            System.out.println("hello");
        }
        //第二题
        double d1 = 4.5;
        double d2 = 40.5;
        if (d1 > 20.0 && d2 >20.0){
            System.out.println(d1 + d2);
        }else {
            System.out.println(d1 * d2);
        }
        //第三题
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入狗狗的年龄");
        int dogAge = scanner.nextInt();
        double years;
        if (dogAge >= 0 && dogAge <= 2){
            years = dogAge *10.5;
            System.out.println("狗狗相当于人类的"+ years+ "岁");
        }else if (dogAge >2){
            years = 2 *10.5 + (dogAge-2)*4;
            System.out.println("狗狗相当于人类的"+ years+ "岁");
        }else {
            System.out.println("输入错误");
        }
    }
}
