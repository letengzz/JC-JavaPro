package 面向对象.练习题;

public class 计算圆的面积 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 2;
        c.findArea1();
        System.out.println(c.findArea());
    }
}
//圆
class Circle{
    double r;
    //方法一
    public double findArea(){
        return r*r*Math.PI;
    }
    //方法二
    public void findArea1(){
        double area = Math.PI * r *r;
        System.out.println(area);
    }
}