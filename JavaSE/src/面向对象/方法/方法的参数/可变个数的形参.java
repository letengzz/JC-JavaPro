package 面向对象.方法.方法的参数;

/**
 * @version 1.0
 * @ClassName 可变个数的形参
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/18 15:59
 *  jdk5.0新增的内容
 * 具体使用
 *      1.可变个数形参的各市 ：数据类型 ... 变量名
 *      2.当调用可变个数形参的方法时，传入的参数个数可以是0个 1个 。。。
 *      3.可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 *      4.可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载
 *      5.可变个数形参在方法的形参中，必须声明在末尾
 *      6.可变个数形参在方法的形参中，最多只能声明一个可变形参
 **/
public class 可变个数的形参 {
    public static void main(String[] args) {
        可变个数的形参 s = new 可变个数的形参();
        s.show("Hello","World");
        s.show();

          //s.show(new String[]{"dd","cc"});
    }
    public void show(int i){

    }
    public void show(String s){
        System.out.println("show(String)");

    }
    public void show(String ... strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
    public void show(int o ,String ... strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
    //public void show(String ... strs,int o) 错误用法
//    public void show(String[] strs){
//        System.out.println(strs[1]);
//    }
}
