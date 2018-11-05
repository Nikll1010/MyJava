/**
 * @program: MyJava
 * @description: 浏览器的前进，后退，打开网址，刷新当前页操作
 * @author Nikll
 * @date 2018/11/5 21:43
 */
package lession2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikll

 * @date 2018/11/5 21:43

 */
public class BrowserOptionTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.baidu.com");
        Thread.sleep(1000);
        driver.navigate().to("https://news.baidu.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
    }
}