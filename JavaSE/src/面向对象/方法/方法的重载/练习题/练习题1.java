package 面向对象.方法.方法的重载.练习题;

/**
 * @version 1.0
 * @ClassName 练习题1
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/18 15:34
 *
 * 编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
 * 执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 *
 * 定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
 * 法求两个double值中的最大值，第三个方法求三个double值中的最大值，
 * 并分别调用三个方法。
 **/
public class 练习题1 {
    public static void main(String[] args) {
        OverLoad ov = new OverLoad();
        ov.mOl(2);
        ov.mOl(2,5);
        ov.mOl("ff");
        OverLoadT ot = new OverLoadT();

        System.out.println(ot.max(5,10));
        System.out.println(ot.max(5.1,10.2));
        System.out.println(ot.max(5,10,50));
    }
}
class OverLoad{
    public void mOl(int x){
        x *= x;
        System.out.println(x);
    }
    public void mOl(int x,int y){
        System.out.println(x * y);
    }
    public void mOl(String a){
        System.out.println(a);
    }
}
class OverLoadT{
    public int max(int x,int y){
       return (x > y)?x:y;

    }
    public double max(double d1,double d2){
        return (d1 > d2)?d1:d2;
    }
    public double max(double x , double y,double z){
        return (x > y)?((x > z)?x:z):((y > z)?y:z);
    }
}