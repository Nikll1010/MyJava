/**
 * @program: MyJava
 * @description: find element test by xpath
 * @author Nikll
 * @date 2018/11/6 20:26
 */
package lession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikll

 * @date 2018/11/6 20:26

 */
public class EleTestByXpath {
    public static void main(String[] args) throws InterruptedException {
        String URL = "https://www.baidu.com";
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='s_ipt']")).sendKeys("Xpath教程");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to(URL);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("学术")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("贴")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}