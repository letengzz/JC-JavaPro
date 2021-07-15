package 基本语法.运算符;
/**
 * 位运算符
 *     <<左移 >>右移 >>>无符号右移  & 与 |或  ^异或 ~取反
 * 位运算符操作的都是整型的数据
 * <<在一定的范围内 每向左移1位 相当于 * 2
 * >>在一定的范围内 每向右移1位 相当于 / 2
 * 最高效方式的计算 2*8    2 << 3  或 8 << 1
 * */
public class 位运算符 {
    public static void main(String[] args) {
        int i = 21;
        System.out.println("i<< 2 ：" + (i<<2));     //84
        System.out.println("i<< 27 ：" + (i<<27));     //最高位  -1476395008
        System.out.println("i>> 2 ：" + (i>>2));     //5
        System.out.println("i>> 27 ：" + (i>>27));     //0

        int m = 12;  //0001100
        int n = 5;   //0000101
        System.out.println("m & n = " + (m & n ));//4
        System.out.println("m | n = " + (m | n ));//13
        System.out.println("m ^ n = " + (m ^ n ));//9
        System.out.println("~ n = " + ~n );//-6
    }
}
