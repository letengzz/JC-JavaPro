package 面向对象;
/**
 * java面向对象学习的三大主线
 * 一 Java类和类的成员 ：属性、方法、构造器;代码块、内部类
 * 二面向对象的三大特征:封装性、继承性、多态性（抽象性)
 * 三其他关键字：this、super、static、final、abstract、interface、package、import
 *
 * 面向过程：强调的是功能行为，以函数为最小单位 考虑怎么做
 * 面向对象：强调具备了功能的对象 以类/对象为最小单位，考虑谁来做
 *
 *
 * 一、面向对象的两个要素
 * 类:对一类事物的描述，是抽象的 概念上的定义
 * 对象:是实际存在的该类事物的每个个体，因而也称为实例(instance)
 *
 * 面向对象程序设计的重点是类的设计
 *  设计类 就是设计类的成员
 *
 *      属性 = 成员变量 = field = 域、字段
 *      方法 = 成员方法 = 函数 = method
 *
 *      Java类的实例化 即创建类的对象
 * 二、类和对象的使用 （面向对象思想落地的实现）
 *      1.创建类，设计类的成员
 *      2.创建类的对象
 *      3.通过对象.属性或对象.方法 调用对象的结构
 *
 *三、如果创建了一个类的多个对象，则每个对象都独立的拥有一个类的属性(非static)
 *      意味着如果我们修改一个对象的属性a 则不影响另外一个对象属性a的值
 *
 *四、内存解析
 * */
public class 面向对象 {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构 属性、方法
        //调用属性:"对象.属性"
        p1.name = "Libai";
        p1.age = 20;
        p1.isMale = false;
        System.out.println(p1.name + p1.age + p1.isMale);
        //调用方法:"对象.方法"
        p1.talk("chinese");
        p1.eat();

        //*******************
        Person p2 = new Person();
        System.out.println(p2.name);//null
        System.out.println(p2.isMale);//false
        //*******************
        //将p1 变量保存的对象地址值赋给p3 导致p1和p3指向了堆空间中的同一对象实体
        Person p3 = p1;
        System.out.println(p3.name);

        p3.age = 18;
        System.out.println(p1.age);
    }
}
class Person{  //类
    //属性
    String name;
    int age = 1;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void talk(String language){
        System.out.println("人可以说话 " + language);
    }
}