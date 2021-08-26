package 面向对象.方法.方法的重载;

/**
 * @version 1.0
 * @ClassName 方法的重载
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/17 12:01
 *
 * 方法的重载(overload)
 * 定义 在同一个类中 允许在一个以上的同名方法，只要他们的参数个数或参数类型不同即可
 *          "两同一不同"
 *          1.同一个类 相同方法名
 *          2.参数列表不同：参数个数不同，参数类型不同
 * 举例
 * Arrays 类中的sort() binarySearch()
 *
 * 判断是否是重载
 *  跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系
 *
 *  在通过对象调用方法时，如何确定某一个指定的方法，
 *          1.方法名---> 参数列表
 **/
public class 方法的重载 {
    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();
        int[] arr = new int[]{5,6,1,88};
        overLoad.reverse(arr);
        System.out.println(arr[1]);
    }

    //如下构成了重载
    public void getSum(int i,int j){
        System.out.println("ggg");
    }
    public void getSum(double i,double j){
        System.out.println("ggg");
    }
    public void getSum(String i,int j){
        System.out.println("ggg");
    }
}
class OverLoad{
    //例
    //反转数组
    public void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
    }

    public void reverse(String[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
    }
}