package 面向对象.方法.方法的值传递机制.练习题;

/**
 * @version 1.0
 * @ClassName Fujiati
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/26 14:50
 **/
public class Fujiati {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);//需要在method方法被调用之后，仅打印a=100 b=200


        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
    //代码编写处
    public static void method(int a ,int b){
        a = a * 10;
        b  = b * 10;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.exit(0);
    }
    //
}
