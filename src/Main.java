
import lession1.*;
import org.openqa.selenium.*;


import java.util.Scanner;

public class Main {

    public static <ManKind_2> void main(String[] args) {
        System.out.println("Hello World!");
        Person person = new Person();
        person.move();
        person.setHeight(10);
        System.out.println(person.getHeight());
        person.setWeight("100Kg");
        System.out.println(person.getWeight());
        Person person1 = new Person();
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getWeight());
//        Person person2 = new Person(person2.setAge(15);person2.setName("lalalalla"););
//        Person person3;
//        person3 = new Person(15,"lalalallal");
        AddNum num1 = new AddNum();
//        num1.add(10,30);
        System.out.println(num1.add(10,30));
        AddNum num = new AddNum();
        System.out.println(num.getI());
        System.out.println(num.getJ());
        AddNum num2 = new AddNum(1,"q",2);
        Date date = new Date();
        System.out.println(date.getX()+date.getY()+date.getZ());
        Date date1 = new Date(100,100);
        System.out.println(date1.getX()+date1.getY());
        Addnu_e addnu_e = new Addnu_e();
        System.out.println(addnu_e.x);
        Addnu_e addnu_e1 = new Addnu_e();
        addnu_e1.setX("wwwwww");
        System.out.println(addnu_e1.x);
        System.out.println(addnu_e1.getX());
//        addnu_e1.add(9,9);
        System.out.println(addnu_e1.add(9,9));//调用继承Addnum的方法
        Addnum_1 addnum_1 = new Addnum_1();//调用继承Addnu_e父类
        System.out.println(addnum_1.getName());
        Addnum_1 addnum_11 = new Addnum_1();
        System.out.println(addnum_11.add(2,3));
        ManKind manKind = new ManKind();
        manKind.setSex();
        System.out.println(manKind.getSex());
        manKind.manOrWorman();
//        ManKind_2 manKind_2 = new ManKind_2();
//        manKind_2.setSex();
//        manKind_2.manOrWorman();
//        Chinese cn = new Chinese();
//        cn = new Chinese("codersai");
//        cn = new Chinese("codersai", 18);
    }
}
