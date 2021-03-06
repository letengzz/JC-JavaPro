package 基本语法.基础;
/**
 * 计算机中不同进制
 * 对于整数有四种表现方式
 * >二进制(binary):0,1.满二进一，以0b或0B开头
 * >十进制(decimal):0-9.满十进一
 * >八进制(octal):0-7.满八进一，以0开头表示
 * >十六进制(hex):0-9及A-F.满十六进一，以0x或0X开头表示 此处的A-F不区分大小写
 *  如:0x21AF + 1 = 0X21B0
 *
 *
 * */
public class 进制 {
    public static void main(String[] args) {
        int num1 = 0b110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0x110A;

        System.out.println("num1=" + num1);//6
        System.out.println("num2=" + num2);//110
        System.out.println("num3=" + num3);//87
        System.out.println("num4=" + num4);//4362
    }
}
