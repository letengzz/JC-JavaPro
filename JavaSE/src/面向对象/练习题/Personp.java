package JavaSE.面向对象.练习题;
/**
 * 创建一个person类 定义：
 *      创建Person类的对象 设置该对象的name age sex 属性
 *      调用study方法输出字符串“studying"
 *      调用showAge()方法显示age值
 *      调用addAge()方法给对象的age属性值增加2岁
 *
 * */
public class Personp {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.age = 10;
        p.sex = false;
        p.study();
        p.showAge();
        int newAge = p.addAge(2);
        System.out.println(p.name + "\t" + newAge);
        Person1 p2 = new Person1();
        p2.showAge();//0
    }
}
class Person1{
    String name;
    int age;
    /**
     * sex:1表明是男性
     * sex:0表明是女性
     * */
    boolean sex;
    public void showAge(){
        System.out.println(age);
    }
    public void study(){
        System.out.println("studying...");
    }
    public int addAge(int i){
        return this.age + i;
    }
}