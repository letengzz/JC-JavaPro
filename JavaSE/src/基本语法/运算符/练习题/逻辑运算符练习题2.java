package 基本语法.运算符.练习题;

public class 逻辑运算符练习题2 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
        //if(y == true)
        if (z++ == 42 && (y = true)){
            z++;
        }
        if ((x = false) || (++z == 45)){
            z++;
        }
        System.out.println("z="+z);
    }
}
