/**
 * @program: MyJava
 * @description: 浏览器位置大小设置
 * @author Nikll
 * @date 2018/11/5 21:20
 */
package lession2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikll

 * @date 2018/11/5 21:20

 */
public class PagePonsionTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com");
        Point pointposion = new Point(100,100);
        driver.manage().window().setPosition(pointposion);
        System.out.println(driver.manage().window().getPosition());
        Dimension dimension = new Dimension(800,600);
        driver.manage().window().setSize(dimension);
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getSize());

    }
}