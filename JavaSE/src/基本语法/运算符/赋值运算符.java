package 基本语法.运算符;
/**
 * 赋值运算符
 *  = += -= *= /= %=
 * */
public class 赋值运算符 {
    public static void main(String[] args) {
        //赋值符号 =
        int i1 = 10;
        int j1 = 10;

        int i2,j2;
        //连续赋值
        i2 = j2 = 10;

        int i3 = 10,j3 = 20;


        int num1 = 10;
        num1 += 2;  //num1 = num1 + 2
        System.out.println(num1);

        short s1 = 10;
        //s1 = s1 + 2; //编译失败
        s1 += 2;    //不会改变变量本身的数据类型
        System.out.println(s1);

        /*
        * 变量实现+2 的操作方法
        * 1）num = num + 2;
        * 2) num +=2;(推荐
        * */
    }
}
