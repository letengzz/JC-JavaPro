package 基本语法.运算符.练习题;

public class 求0到255整数的十六进制值 {
    public static void main(String[] args) {
        //方式一 自动实现
        String str1 = Integer.toBinaryString(60);
        String str2 = Integer.toHexString(30);

        //方式二 手动实现
        int i1 = 60;//十进制转十六进制：四个一位
        int i2 = i1&15;//位运算 15的二进制与60的二进制相同’1100‘
        String j = (i2 > 9)?(char)(i2-10+'A')+"":i2+"";//当大于9 先减去十加A得到后强转成char
        int temp = i1 >>>4;//先整体右移四位不用关心符号所以用无符号
        i2 = temp & 15;
        String k = (i2 > 9)?(char)(i2-10+'A')+"":i2+"";//当大于9 先减去十加A得到后强转成char
        System.out.println(k+""+j);
    }
}
