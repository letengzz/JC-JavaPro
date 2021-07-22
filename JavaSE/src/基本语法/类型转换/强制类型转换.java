package 基本语法.类型转换;
/**
 *基本数据类型运算规则
 * 前提:只是七种基本数据类型变量间的运算,不包含 boolean类型
 * 1自动类型提升
 *  当容量小的数据类型的变量与容量大的数据类型做运算 结果自动提升为容量大的数据类型
 *      byte、char、short->int->long->float->double
 *      当byte、char、short三种做运算时、结果为int型
 *
 * 2强制类型转换:自动提升的逆运算
 *  需要使用强转符
 *  强制类型转换可能导致精度损失
 *
 *
 *
 * 说明: 此时的容量大小指的是，表示数的范围的大和小 比如 float 容量大于long
 * */
public class 强制类型转换 {
    public static void main(String[] args) {
        double d1 = 123.9;
        //int i1 = d1;//编译不通过
        int i1 = (int)d1;//截断操作
        System.out.println(i1);

        //没有精度损失
        long l1 = 123;
        short s2 = (short) l1;

        //精度损失
        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b);//-128


    }
}
