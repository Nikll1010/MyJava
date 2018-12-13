/**
 * @program: MyJava
 * @description: 打开百度
 * @author Nikll
 * @date 2018/11/13 19:18
 */
package lession2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Nikll

 * @date 2018/11/13 19:18

 */
public class OpenBaidu {

    public void openBaidu(){
        WebDriver driver = new FirefoxDriver();
        String URL = "https://www.baidu.com/";
        driver.get(URL);

    }
}