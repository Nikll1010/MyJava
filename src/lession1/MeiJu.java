/**
 * @author Nikll
 * @date 2018/8/30 11:48
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/30 11:48

 */
public class MeiJu {
    //    enum Meiju{
//        wensday,summer,fall,winter;
//    }
    public static void main(String[] args) {
        ClassLoader classloader;
        //获取系统缺省的ClassLoader
        classloader = ClassLoader.getSystemClassLoader();
        System.out.println(classloader);
        while (classloader != null) {
            //取得父的ClassLoader
            classloader = classloader.getParent();
            System.out.println(classloader);
        }
    }
}