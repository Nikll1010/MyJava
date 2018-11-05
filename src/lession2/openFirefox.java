/**
 * @author Nikll
 * @date 2018/10/18 22:02
 */
package lession2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikll

 * @date 2018/10/18 22:02

 */
@Test
public class openFirefox {
    public static void main(String[] args) {
        /**
        *@Description:
        *@Param: [args]
        *@return: void
        *@Author: Nikll
        *@date: 2018/10/18
        */
        //初始化一个浏览器实例
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐形等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //get()打开一个站点
        driver.get("https://www.baidu.com");
        System.out.println("当前页面的标题是："+ driver.getTitle());

        //关闭并退出浏览器
//        driver.quit();
    }

}