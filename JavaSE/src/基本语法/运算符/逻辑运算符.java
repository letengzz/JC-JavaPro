package 基本语法.运算符;
/**
 * 逻辑运算符
 *
 * &逻辑与 &&短路与 |逻辑或 ||短路或 !逻辑非 ^逻辑异或
 *  逻辑运算符操作的都是boolean类型的变量 结果也是boolean类型的
 * */
public class 逻辑运算符 {
    public static void main(String[] args) {
        //区分& 和&&
        //相同点 & 与 && 的运算结果相同
        //当符号左边是true 时二者都会执行符号右边的运算
        //不同点：当符号左边为false & 会继续执行符号右边的运算，&&不再执行符号右边是运算
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)){
            System.out.println("111");
        }else {
            System.out.println("222");
        }
        System.out.println("num="+num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ >10)){
            System.out.println("111");
        }else {
            System.out.println("222");
        }
        System.out.println("num2="+num2);

        // | 和 || 与& && 相同
        // 相同点 | 与 || 运算结果相同
        // 当符号左边为false 二者都会执行符号右边的运算
        // 当符号左边为true | 继续执行符号右边的运算 而 || 不再继续执行符号右边的运算

        //开发中 推荐|| &&



    }
}
