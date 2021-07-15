package JavaSE.面向对象.练习题;
/**
 * 编写教师类和学生类 并通过测试类创建对象进行测试
 *
 * Student类
 * 属性：name String
 *      age int
 *      major String
 *      interests String
 * 方法 say() 返回学生的个人信息
 * Teacher类
 * 属性：name String
 * age int
 * teachAge int
 * course String
 * 方法 say()输出教师的个人信息
 * */
public class 教师和学生 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name ="nihao";
        s.age = 52;
        s.majio = "dd0";
        s.interests = "ff";
        s.say();

    }
}
class Student{
    String name;
    int age;
    String majio;
    String interests;
    public void say(){
        System.out.println(name + "\t" + age + "\t" + majio + "\t" + interests);
    }

}
class Teacher{
    String name;
    int age;
    int teachAge;
    String course;
    void say(){
        System.out.println(name + "\t" + age + "\t" + teachAge + "\t" + course);
    }
}
