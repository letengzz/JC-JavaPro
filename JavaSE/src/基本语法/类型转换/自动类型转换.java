package 基本语法.类型转换;
/**
 *基本数据类型运算规则
 * 前提:只是七种基本数据类型变量间的运算,不包含 boolean类型
 * 1自动类型提升
 *  当容量小的数据类型的变量与容量大的数据类型做运算 结果自动提升为容量大的数据类型
 *      byte、char、short->int->long->float->double
 *      当byte、char、short三种做运算时、结果为int型
 *
 * 2强制类型转换
 *
 *
 * 说明: 此时的容量大小指的是，表示数的范围的大和小 比如 float 容量大于long
 * */
public class 自动类型转换 {
    public static void main(String[] args) {
        byte b1 = 8;
        int i1 = 144;
        //编译不通过
        //byte b2 = b1 + i1;
        int i2 = b1 + i1;
        long l1 = b1 + i1;
        System.out.println(i2); //152

        float f = b1 + i1;
        System.out.println(f);  //152.0

        short s1 = 123;
        double d1 = s1;
        System.out.println(d1); //123.0

        //***************

        char c1 = 'a';//97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        //char c2 = c1 + s2;//编译不通过

        byte b2 = 10;
        //char c3 = c1 + b2;//编译不通过
        //short s3 = b2 + s2;//编译不通过
        //short s4 = b1 + b2;//编译不通过
    }
}
