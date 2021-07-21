package 基本语法.基础;
/**
 * String类型变量的使用
 *  String属于引用类型
 *  声明String变量时，使用一对""
 *  String可以跟八种数据类型做运算，且只能是连接运算:+
 *  运算结果仍然是String
 * */
public class String变量使用 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(s1);

        String s2 = "a";
        String s3 = "";

        int number = 100;
        String numberstr = "学号";
        String info = numberstr + number;   //+：连接运算
        boolean b1 = true;
        String info1 = info +b1;
        System.out.println(info1);

        //练习
        char c = 'a'; //97   A65
        int num = 10;
        String str = "hello";

        System.out.println(c + num + str);  //107hello
        System.out.println(c + str + num);  //ahello10
        System.out.println(c + (num + str));    //a10hello
        System.out.println((c + num) + str);    //107hello
        System.out.println(str + num + c);  //hello10a

        //练习
        //* *
        System.out.println("*   *");
        System.out.println('*' + '\t' + '*');//×
        System.out.println('*' + "\t" + '*');//√
        System.out.println('*' + '\t' + "*");//×
        System.out.println('*' + ('\t' + "*"));//√

        //String str1 = 123;//编译不通过
        String str1 = 123 + "";
        System.out.println(str1);//"123"

        //int num1 = str1;//编译不通过
        //int num1 = (int)str1;//编译不通过

    }
}
