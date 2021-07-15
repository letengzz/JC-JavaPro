package JavaSE.面向对象.练习题;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(98);
        p1.setName("l");
        p1.isMale = false;
        p1.setBirth(2000);
        p1.setNames("dg","ggd","gds");
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(p1.isMale);
        System.out.println(p1.getAges());
        System.out.println(Arrays.toString(p1.getNames()));

        Preson1 preson1 = new Preson1("nih",15);
        System.out.println(preson1.getName());
        System.out.println(preson1.getAge());
    }
}
class Preson1{
    private String name;
    private int age;

    public Preson1() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Preson1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Person{

    private String name;
    private int age;
    private int birth;
    private String[] names;

    public void setNames(String... names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }

    public boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private int calcAge(int currentYear){
        return currentYear - this.birth;
    }
    public int getAges() {
        return calcAge(2019);
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}
