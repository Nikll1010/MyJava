/**
 * @author Nikll
 * @date 2018/8/29 19:35
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/29 19:35

 */
interface Runner { public void run();}
interface Swimmer {public double swim();}
abstract class Animal_1  {abstract public int eat();
//    {
//        System.out.println("i like eating");
//        return 0;
//    }
}
class Person_i extends Animal_1 implements Runner,Swimmer{
    public void run(){
        System.out.println("i like running");
//        return;
    }
    public double swim(){
        System.out.println("i like swimming");
        return 0;
    }
    public int eat() {
        System.out.println("i like eating_1");
        return 0;
    }
}
class Person_ii extends Animal_1 implements Runner,Swimmer{
    public void run(){
        System.out.println("i like runningiiiiii");
//        return;
    }
    public double swim(){
        System.out.println("i like swimmingiiiiii");
        return 0;
    }
    public int eat() {
        System.out.println("i like eating_1iiiiii");
        return 0;
    }
}
class Testt extends Animal_1 implements Runner,Swimmer{
    public int eat() {
        System.out.println("i like eating_1tttttt");
        return 0;
    }
    public void run(){
        System.out.println("i like runningtttttt");
//        return;
    }
    public double swim(){
        System.out.println("i like swimmingtttttt");
        return 0;
    }
//    public String m1(Runner f){
//        f.run();
//        return "";
//    }
    public String m1(){
        this.run();
        return "";
    }
    public void  m2() {this.swim();}
    public void  m3() {this.eat();}
}
//与继承关系类似，接口与实现类之间存在多态性
public class test {
    public static void main(String args[]){
        test t = new test();
        Person_i p = new Person_i();
        t.m1(p);
        t.m2(p);
        t.m3(p);
        test tt = new test();
        Person_ii pp = new Person_ii();
        tt.m1(pp);
        tt.m2(pp);
        tt.m3(pp);
        Testt testt = new Testt();
        testt.m1();
        testt.m2();
        testt.m3();
//        p.eat();
//        p.run();
//        p.swim();
    }
    public String m1(Person_i f){
        f.run();
        return "";
    }
    public String m1(Person_ii f){
        f.run();
        return "";
    }
    public void  m2(Swimmer s) {s.swim();}
    public void  m3(Animal_1 a) {a.eat();}
}
