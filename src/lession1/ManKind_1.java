/**
 * @author Nikll
 * @date 2018/8/28 18:59
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/28 18:59

 */
public class ManKind_1 extends ManKind {
    public int a;
    public ManKind_1(){
        a = 10;
    }
    public  void manOrWorman(){
        if (sex==1){
            super.manOrWorman();
            System.out.println("男性");
        }
        else if (sex==0){
//            super.manOrWorman();
            System.out.println(super.lala+"女性");
            System.out.println(this.lala+"女性");
        }
    }
}