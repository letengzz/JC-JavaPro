package 基本语法.变量;
/**
 * 变量的使用：
 * 1.java定义变量的格式： 数据类型 变量名 = 变量值
 * 2.说明：
 *  ①变量必须先声明，后使用
 *  ②变量都定义在其作用域内 在作用域有效 出了失效
 *  ③同一作用域内 不可以同时声明两个同名变量
 *
 * */
public class 变量的使用 {
    public static void main(String[] args) {
        //变量的定义
        int myAge = 12;
        //变量的使用
        System.out.println(myAge);  //12

        //使用myNumber之前未定义过myNumber
        //System.out.println(myNumber);

        //变量的声明
        int myNumber;

        //使用之前未赋值myNumber
        //System.out.println(myNumber);

        //变量的赋值
        myNumber = 100;

        //出了作用域
        //System.out.println(myClass);
    }
    public void method(){
        int myClass = 1;

    }
}
