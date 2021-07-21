package 面向对象.练习题;
/**
 * 3.1编写程序,声明一个method方法,在方法中打印一个10"8的*型矩形,
 * 在main方法中调用该方法。
 * 3.2修改上一个程序,在method方法中,除打印一个10"8的"型矩形外,
 * 再计算该矩形的面积,并将其作为方法返回值。
 * 在main方法中调用该方法,9接收返回的面积值并打印。
 * 3.3修改上一个程序,在method方法提供m和n两个参数,
 * 方法中打印一个m'n的“型矩形,并计算该矩形的面积,将其作为方法返回值。
 * 在main方法中调用该方法,接收返回的面积值并打印。
 *
 * 在主类中调用主类的方法，在不给方法添加static的情况下，
 * 需要先在主类的main方法中建立自身的对象，其后才可以调用
 * */
public class 打印矩形 {
    public static void main(String[] args) {
        打印矩形 l = new 打印矩形();
//        l.method(10,8);
        System.out.println(l.method1(10,8));
    }
    //3.1
    /*public void method(int l , int wide){
        for (int i = 0; i < wide; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
    //3.2 3.3
    public int method1(int l , int wide){
        for (int i = 0; i < wide; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return l * wide ;
    }
}
