package 基本语法.运算符;
/**
 * 算术运算符
 *  + - * / % (前)++ (后)++ (前)-- (后)--   +
 * */
public class 算术运算符 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1);    //2

        int result2 = num1 / num2 *num2;
        System.out.println(result2);    //10

        double result3 = num1 / num2;
        System.out.println(result3);    //2.0

        double result4 = num1 / num2 +0.0;  //2.0
        double result5 = num1 /(num2 + 0.0);    //2.4
        double result6 = (double) num1 / num2;  //2.4
        double result7 = (double) (num1 / num2);    //2.0

        //%：取余运算
        //结果的符号与被模数符号相同
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1=" + m1 % n1);   //2
        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2=" + m2 % n2);   //-2
        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3=" + m3 % n3);   //2
        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4=" + m4 % n4);   //-2

        // (前)++:先自增1 后运算
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1=" + a1 + "b1=" + b1);    //a1=11b1=11
        // (后)++: 先运算 后自增1
        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2=" + a2 + "b2=" + b2);    //a2=11b2=10

        // (前)--:先自减1 后运算
        // (后)--:先运算 后自减1

        int a3 = 10;
        ++a3;   //a3++
        int b3 = a3;    //两个没有区别 都是独立运算

        //注意点
        short s1 = 10;
        //s1 = s1 +1; //编译失败
        s1 = (short) (s1 + 1);  //正确
        s1++;   //自增1不会改变本身没变量的数据类型

        //问题
        byte bb1 = 127;
        bb1++;
        System.out.println(bb1);    //-128

        //连接符: + 只能使用在String与其他数据类型变量之间使用
    }
}
