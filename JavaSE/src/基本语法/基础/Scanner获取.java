package 基本语法.基础;

import java.util.Scanner;

/**
 * 从键盘获取不同类型的变量 使用Scanner 类
 *  步骤
 *      1导包 import java.util.Scanner;
 *      2Scanner实例化Scanner scanner = new Scanner(System.in);
 *      3调用scanner类的相关方法 来获取指定类型的变量
 *
 *      nextInt(); int
 *      next(); String
 *      nextDouble(); double
 *      nextBoolean(); boolean
 *      nextByte(); byte
 *      对于char 的获取 Scanner 没有提供相关的方法 只能获取一个字符串
 *      String gender = scan.next();
 *      char genderChar = gender.charAt(0) //获取索引值为0位置上的字符
 *      注意
 *      需要根据相应的方法 来输入制定类型的值 如果输入的数据类型与要求的不匹配 报异常
 *      导致程序终止
 * */
public class Scanner获取 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int i = scanner.nextInt();//获取整型
        System.out.println(i);

        String name = scanner.next();//获取字符串
        System.out.println(name);
    }
}
