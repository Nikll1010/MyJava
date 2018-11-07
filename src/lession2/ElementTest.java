/**
 * @program: MyJava
 * @description: 第一个find element测试举例
 * @author Nikll
 * @date 2018/11/7 22:17
 */
package lession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Nikll

 * @date 2018/11/7 22:17

 */
public class ElementTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.navigate().to("https://news.baidu.com");
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='hotnews']/ul/li/strong"));
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
        }
    }
}