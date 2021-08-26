package 面向对象;

/**
 * @version 1.0
 * @ClassName 匿名对象
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/17 9:29
 *匿名对象的使用
 * 理解：我们创建的对象 没有显式的赋给一个变量名 即为匿名对象
 * 特征: 匿名对象只能调用一次
 *
 *
 **/
public class 匿名对象 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);

        p.price = 20;
        p.playGame();

        //匿名对象
        new Phone().playGame();
        new Phone().price = 1999;
        new Phone().showPrice();

        PhoneMall mall = new PhoneMall();
        //匿名对象的使用
        mall.show(new Phone());
    }
}
class PhoneMall{
    public void show(Phone phone){
        phone.playGame();
        phone.sendEmail();
    }
}
class Phone{
    double price;//价格

    public void sendEmail(){
        System.out.println("发邮件");
    }
    public void  playGame(){
        System.out.println("打游戏");
    }
    public void showPrice(){
        System.out.println(price);
    }
}