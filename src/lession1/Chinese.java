/**
 * @author Nikll
 * @date 2018/8/29 13:18
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/29 13:18

 */
class Person2 {
    public static void prt(String s) {
        System.out.println(s);
    }

    Person2() {
        prt("父类·无参数构造方法： "+"A Person.");
    }//构造方法(1)

    Person2(String name) {
        prt("父类·含一个参数的构造方法： "+"A person's name is " + name);
    }//构造方法(2)
}

public class Chinese extends Person2 {
    Chinese() {
        super(); // 调用父类构造方法（1）
//        System.out.println("子类·调用父类”无参数构造方法“： "+"A chinese coder.");
        prt("子类·调用父类”无参数构造方法“： "+"A chinese coder.");
    }

    Chinese(String name) {
        super(name);// 调用父类具有相同形参的构造方法（2）
//        System.out.println("子类·调用父类”含一个参数的构造方法“： "+"his name is " + name);
        prt("子类·调用父类”含一个参数的构造方法“： "+"his name is " + name);
    }

    Chinese(String name, int age) {
        this(name);// 调用具有相同形参的构造方法（3）
//        System.out.println("子类：调用子类具有相同形参的构造方法：his age is " + age);
        prt("子类：调用子类具有相同形参的构造方法：his age is " + age);
    }

    public static void main(String[] args) {
        Chinese cn = new Chinese();
        cn = new Chinese("codersai");
        cn = new Chinese("codersai", 18);
        int a = 10;
        String b = "b";
        System.out.println("b="+b);
        System.out.println("a="+a);
        final int i;//i只能被赋值一次
        i = 10;
//        i = 11;
    }
}