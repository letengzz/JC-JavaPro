package 基本语法.运算符.练习题;
/**
 *
 * */
public class 逻辑运算符练习题 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        if (x++ == 2 & ++y == 2){   //false & true
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);

        int x1 = 1 , y1 = 1;
        if (x1++ == 2 && ++y1 == 2){    //false 之后 ++y1不再运算
            x1 = 7;
        }
        System.out.println("x1=" + x1 + ",y1=" + y1);

        int x3 = 1 , y3 = 1;
        if (x3++ == 1 | ++y3 == 1){     //true | false
            x3 = 7;     //true
        }
        System.out.println("x3=" + x3 + ",y3=" + y3);

        int x4 = 1 , y4 = 1;
        if (x4++ == 1 || ++y4 == 1){    //true 之后 ++y4不在运算
            x4 = 7;     //true
        }
        System.out.println("x4=" + x4 + ",y4=" + y4);


    }
}
