package 面向对象.方法.方法的值传递机制.练习题;

/**
 * @version 1.0
 * @ClassName 圆的面积
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/26 15:34
 *
 * （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个
 * findArea()方法返回圆的面积。
 * （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
 * 如下：public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * （3）在main方法中调用printAreas()方法，调
 * 用完毕后输出当前半径值。程
 **/
public class 圆的面积 {
    public static void main(String[] args) {
        PassObject p = new PassObject();
        Circle c = new Circle();
        p.printAreas(c,5);
        // p.printAreas(new Circle(),5);
        System.out.println("now radius is" + c.radius);
    }
}
class Circle{
    double radius;//半径
    public double findArea(){
       return Math.PI * radius *radius;
    }
}
class PassObject{
    public void printAreas(Circle c,int time){
        System.out.println("Redius\t\tArea");
        for (int i = 1; i <= time; i++) {
            //设置圆的半径
            c.radius = i;
            System.out.println(c.radius +"\t\t"+c.findArea());
        }

        c.radius = time + 1;
    }

}

