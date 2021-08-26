package 面向对象.方法.方法的值传递机制;

/**
 * @version 1.0
 * @ClassName 值传递
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/18 16:34
 *
 *关于变量的赋值
 *  如果变量是基本数据类型，此时赋值的是变量所保存的数据值
 *  如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值
 *方法的形参的传递机制：值传递
 *  1.形参：方法定义时，声明的小括号内的参数
 *  2.实参：方法调用时，实际传递给形参的数据
 *
 *值传递机制:
 * 如果参数是基本数据类型，此时实参赋给形参的是 实参真实存储的数据值
 * 如果参数时引用数据类型，此时实参赋给形参的是 实参存储数据的地址值
 **/
public class 值传递 {
    public static void main(String[] args) {
        //基本数据类型值的赋值
        int m = 10;
        int n = m;
        System.out.println(m + " " + n);
        n = 20;
        System.out.println(m + " " + n);
        //交换两个变量的值的操作
//        int temp = m;
//        m = n;
//        n = temp;
        值传递 z = new 值传递();
        z.swap(m,n);

        System.out.println(m + " " + n);
        //引用数据类型
        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;//赋值以后o1 o2 的地址值相同，都指向了堆空间中同一个对象实体
        System.out.println(o1.orderId + " " + o2.orderId);

        o2.orderId = 1002;
        System.out.println(o1.orderId + " " + o2.orderId);

        //引用数据类型
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println(data.m + " " + data.n);
        z.swap1(data);
        System.out.println(data.m + " " + data.n);
    }
    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println(m + " " + n);
    }
    public void swap1(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
class Order{
    int orderId;
}
class Data{
    int m;
    int n;
}