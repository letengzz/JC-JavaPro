package JavaSE.面向对象.练习题;

public class Test02 {
    public static void main(String[] args) {
        Student1 student = new Student1("k",99);
        System.out.println(student.name + student.age);
        student.run();
    }
}
class Person03{
    protected String name;
    protected int age;
    public Person03(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void run(){
        System.out.println("nihao");
    }
}
class Student1 extends Person03{
    public Student1(String name, int age) {
        super(name, age);
    }
    public String hello(){

        return "ff" + super.name;
    }

    @Override
    public void run() {
        System.out.println("你好");
    }
}
