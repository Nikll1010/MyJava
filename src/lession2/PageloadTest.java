/**
 * @program: MyJava
 * @description: Timeout接口测试
 * @author Nikll
 * @date 2018/11/5 20:58
 */
package lession2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikll

 * @date 2018/11/5 20:58

 */
public class PageloadTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.get("https://www.icloud.com/");
    }
}