/**
 * @author Nikll
 * @date 2018/8/30 1:14
 */
package lession1;

import java.io.*;

/**
 * @author Nikll

 * @date 2018/8/30 1:14

 */
public class YiChang2 {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream = new FileInputStream("myfile.txt");
        int b;
        b = System.in.read();
        while(b!= -1)       {
            System.out.print((char)b);
            b = System.in.read();
        }
        System.in.close();
    }
}