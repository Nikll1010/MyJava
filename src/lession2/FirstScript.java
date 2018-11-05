/**
 * @program: MyJava
 * @description: 第一个自动化测试脚本
 * @author Nikll
 * @date 2018/10/20 1:12
 */
package lession2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikll

 * @date 2018/10/20 1:12

 */
@Test
public class FirstScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐形等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //get()打开一个站点
        driver.get("https://www.baidu.com");
        try {
            String baidutitle = "百度一下，你就知道";
//            assert baidutitle.equals(driver.getTitle());//由于assert编译的原因，没有执行判断，先使用if()进行判断
            if (baidutitle.equals(driver.getTitle())) {
                System.out.println("test pass");
            }else System.out.println("test fail");
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.close();
    }
}