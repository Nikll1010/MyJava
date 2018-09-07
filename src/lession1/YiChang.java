/**
 * @author Nikll
 * @date 2018/8/30 0:29
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/30 0:29

 */
public class YiChang {
    public static void main(String[] args) {
//        outfriend();
        String b = new String("aaa");
        System.out.println(b);
        try {
            NullRef t = new NullRef();
            t = null;
            System.out.println(t.i);
        }catch (java.lang.NullPointerException e){
            System.out.println("java.lang.NullPointerException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("lalalla");
        }catch (ArrayStoreException e){
            System.out.println("hehehehehhe");
        }catch (Exception e){
            System.out.println("dadadadad");
        }
    }
    static void outfriend(){
        String freind[] = {"123","321","132"};
        for (int i=0;i<5;i++){
            System.out.println(freind[i]);
        }
    }
}
class NullRef{
    int i=1;
}
