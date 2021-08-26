package 面向对象.方法.递归方法.练习题;

/**
 * @version 1.0
 * @ClassName Lianxiti
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/26 16:28
 *
 * 已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
 * 的整数，求f(10)的值。
 **/
public class Lianxiti {
    public static void main(String[] args) {
        Lianxiti l = new Lianxiti();
        System.out.println(l.f(10));
    }
    public int f(int n){
        if (n == 0) {
            return 1;
        }else if(n ==1){
            return 4;
        }else {
            return 2*f(n-1) + f(n-2);
        }
    }
}
