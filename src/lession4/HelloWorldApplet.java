package lession4;

/**
 * @Auther: Administrator
 * @Date: 2018/12/14 11:46
 * @Description:
 */

import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet
{
    public void paint (Graphics g)
    {
        g.drawString ("Hello World", 25, 50);
    }
}
