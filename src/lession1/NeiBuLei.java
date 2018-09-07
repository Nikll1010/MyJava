/**
 * @author Nikll
 * @date 2018/8/29 23:53
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/29 23:53

 */
class A1 {
    public int getS() {
        return s;
    }

    private int s;
    public class B1{
        public void mb() {
            s = 100;
            System.out.println("在内部类B中s=" + s);
        }
    }
    public void ma() {
        System.out.println("在A中的s="+s);
        B1 i = new B1();
        i.mb();
        System.out.println("在A中的s="+s);
//        System.out.println(i.gets());
    }
}

public class NeiBuLei {
    public static void main(String args[]){
        A1 o = new A1();
        o.ma();
        System.out.println(o.getS());
    }
}
