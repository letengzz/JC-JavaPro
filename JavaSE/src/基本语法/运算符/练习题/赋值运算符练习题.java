package 基本语法.运算符.练习题;

public class 赋值运算符练习题 {
    public static void main(String[] args) {
        short s = 3;
        //s = s + 2;    //编译错误
        s += 2; //编译通过

        int i = 1;
        i *=0.1;
        System.out.println(i);  //0
        i++;
        System.out.println(i);  //1

        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m="+m); //3
        System.out.println("n="+n); //6

        int n1 = 10;
        n1 += (n1++) + (++n1);  //n=n + (n++) + (++n)
                                //  10    10      12
        System.out.println(n1); //32

    }
}
