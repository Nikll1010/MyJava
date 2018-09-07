/**
 * @author Nikll
 * @date 2018/8/30 0:09
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/30 0:09

 */
public class NeiBuLei1 {
    public static void main(String args[]) {
        A a = new A();
        A.B b = a.new B();
        b.mb(123);
        System.out.println("B的="+b.getS());
        System.out.println("A的="+a.getS());
    }
}
class A {
    public int getS() {
        return s;
    }

    private int s = 111;

    public class B {
        public int getS() {
            return s;
        }

        private int s = 222;

        public void mb(int a) {
            System.out.println("输入的变量s="+a);              // 局部变量s
            System.out.println("B中的="+this.s);      // 内部类对象的属性s
            System.out.println("B中的="+B.this.s);   // 外层类对象属性s
            System.out.println("A中的="+A.this.s);   // 外层类对象属性s
        }
    }
}