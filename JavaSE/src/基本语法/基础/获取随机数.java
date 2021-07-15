package 基本语法.基础;

public class 获取随机数 {
    public static void main(String[] args) {
        //如何获取一个随机数
        int value = (int)(Math.random()*90+10); //[0.0,1.0) --> [0.0,90.0) --> [10.0,100.0) -->强转之后 [10,99]
        //公式 [a,b]: (int)(Math.random() * (b-a+1) + a)
        System.out.println(value);

    }
}
