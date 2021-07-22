package 基本语法.变量;
/**
 *数据类型分类
 *  变量按照数据类型分
 *      基本数据类型
 *          整型 byte、short、int、long
 *          浮点型 float、double
 *          字符型 char
 *          布尔型 boolean
 *      引用数据类型
 *          类(class
 *          接口(interface
 *          数组(array
 *  变量按照声明的位置
 *      成员变量 vs 局部变量
 * */
public class 变量类型 {
    public static void main(String[] args) {
        //整型 byte(1字节=8bit)、short(2字节)、int(4字节)、long(8字节)
        //byte 范围 -128~127
        byte b1 = 12;
        byte b2 = -128;
        System.out.println(b1); //12
        System.out.println(b2); //-128

        //声明long变量 必须以'l' 或'L'结尾
        //通常定义整型变量时，使用int型
        short s1 = 12;
        long l1 = 1212L;
        System.out.println(l1); //1212

        //浮点型   float(4字节) double(8字节)
        //浮点型 表示带小数点的数值
        //float表示数值的范围比long大

        double d1 = 211.1;
        double d2 = 3.14E2;//科学记数法表示小数
        System.out.println(d1 + 1); //212.1
        //定义float变量时 变量以'f'或‘F’结尾

        float f1 = 12.3F;
        //float f2 = 1.65;  1.65是double类型 不能直接赋值到float
        System.out.println(f1); //12.3
        //通常 定义浮点数变量时使用double

        //字符型   char(1字符 = 2字节)
        //定义char型变量通常使用'' 内部只能写一个字符
        char c1 = 'a';
        System.out.println(c1); //a
        //表示方式: ①声明一个字符  ②转义字符  ③直接使用Unicode表示字符串常量
        char c5 = '\n'; //换行符
        c5 = '\t';
        System.out.println(c5); //水平制表符

        char c6 = '\u0122';
        char c7 = 97;
        System.out.println(c7); //97
        System.out.println(c6); //Ģ

        //布尔型 boolean
        //只能取两个值: true false
        //通常在条件判断 循环结构中使用
        boolean bb1 = true;
        System.out.println(bb1);    //true

        boolean isMarried = true;
        if (isMarried){
            System.out.println("你好");
        }else {
            System.out.println("你不好");
        }
        //你好

        //编码情况
        long l = 123123;
        System.out.println(l);
        //编译失败：过大的整数
        //long l2 = 2131334344434;
        long l2 = 2131334344434l;

        //编译失败
        //float f1 = 12.3;

        //整型常量，默认类型为int型
        //浮点型常量，默认为double型
        byte b = 12;
        //byte b1 = b + 1;//编译失败
        //float f1 = b + 12.2;//编译失败

        //char c = ''//编译不通过
    }
}
