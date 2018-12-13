/**
 * @program: MyJava
 * @description: 元素发送与清除
 * @author Nikll
 * @date 2018/11/7 23:18
 */
package lession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Nikll

 * @date 2018/11/7 23:18

 */
public class ElementOpration {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com");
        WebElement element = driver.findElement(By.id("kw"));
        element.sendKeys("Xpath");
        Thread.sleep(5000);
        element.clear();
    }
}