/**
 * @program: MyJava
 * @description: Element test by id
 * @author Nikll
 * @date 2018/11/5 22:01
 */
package lession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Nikll

 * @date 2018/11/5 22:01

 */
public class EleTestById {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("英雄主义");
        Thread.sleep(2000);
        driver.findElement(By.id("su")).click();
    }
}