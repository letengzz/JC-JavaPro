package 基本语法.运算符;
/**
 * 比较运算符
 *  == != > < >= <= instanceof
 *
 *  结论
 *  1比较运算符结果是boolean类型
 *
 *  区分 == 和 =
 *  > < >= <= 只能使用在数值类型的数据之间
 *  == 和 != 不仅可以使用在数据类型数据之间 还可以使用在其他引用数据类型之间
 * */
public class 比较运算符 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println(i == j); //false
        System.out.println(i = j);  //20

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);   //false
        System.out.println(b2 = b1);    //true
    }
}
