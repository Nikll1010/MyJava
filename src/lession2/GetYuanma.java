/**
 * @program: MyJava
 * @description: 获取当前页面源码
 * @author Nikll
 * @date 2018/11/7 23:31
 */
package lession2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Nikll

 * @date 2018/11/7 23:31

 */
public class GetYuanma {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com");
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }
}