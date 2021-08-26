package 面向对象.练习题.自定义数组工具类;

/**
 * @version 1.0
 * @ClassName Test
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/17 10:37
 **/
public class Test {
    public static void main(String[] args) {
        自定义数组 util = new 自定义数组();
        int[] arr = new int[]{23,56,85,44,6,3};
        int max = util.getMax(arr);
        System.out.println(max);
        util.sort(arr);
        util.print(arr);
        System.out.println();

        int a  =   util.getIndex(arr,6);
        System.out.println(a);

    }
}
