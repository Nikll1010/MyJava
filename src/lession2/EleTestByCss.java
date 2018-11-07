/**
 * @program: MyJava
 * @description: find element by css
 * @author Nikll
 * @date 2018/11/6 22:32
 */
package lession2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikll

 * @date 2018/11/6 22:32

 */
public class EleTestByCss {
    public static void main(String[] args) throws InterruptedException {
        String URL = "https://www.baidu.com";
        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
        driver.get(URL);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#kw")).sendKeys("Xpath");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#su")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#su")).sendKeys(Keys.F11);
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.tagName("body")).sendKeys(Keys.F11);
        try {
            String title = "百度一下1，你就知道";
            assert driver.getTitle().equals(title);
            System.out.println("Test pass");
        }catch (Exception e){
            System.out.println("抛出异常啦啦啦");
            e.printStackTrace();
        }
    }
}