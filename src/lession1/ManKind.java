/**
 * @author Nikll
 * @date 2018/8/28 16:45
 */
package lession1;

import java.util.Scanner;

/**
 * @author Nikll

 * @date 2018/8/28 16:45

 */
public class ManKind {
    public int getSex() {
        return sex;
    }

    public void setSex() {
        System.out.println("请输入性别：男性 1，女性 0");
        Scanner scanner = new Scanner(System.in);
        this.sex = scanner.nextInt();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int sex;
    public int salary;
    public String lala;
    public ManKind(){
        lala = "lalalala";
    }
    public void manOrWorman(){
        if (sex==1){
            System.out.println("男性");
        }
        else if (sex==0){
            System.out.println("女性");
        }
    }
//    public static void main(String[] args) {
//        ManKind_2 manKind_2 =new ManKind_2();
//        manKind_2.manOrWorman();
//    }
}
class ManKind_2 extends ManKind {
    public int a;
    public ManKind_2(){
        a = 10;
    }
    public void ManKind(){

    }
    public  void manOrWorman(){
        if (sex==1){
            super.manOrWorman();
            System.out.println("男性");
        }
        else if (sex==0){
//            super.manOrWorman();
            System.out.println(super.lala+"女性");
        }
    }
}