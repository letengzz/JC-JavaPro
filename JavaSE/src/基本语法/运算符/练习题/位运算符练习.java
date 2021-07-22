package 基本语法.运算符.练习题;
/**
 * 交换两个变量的值
 * */
public class 位运算符练习 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        //方式一:定义临时变量的方式
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("*****");
        //方式二: 好处 不用定义临时变量 弊端：相加操作可能超出存储范围 ②有局限性中能适用于数值类型
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        //方式三 使用位运算符    有局限性 只能适用于数值类型
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

    }
}
