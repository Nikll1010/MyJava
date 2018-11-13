/**
 * @program: MyJava
 * @description: 句柄操作
 * @author Nikll
 * @date 2018/11/13 19:17
 */
package lession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Nikll

 * @date 2018/11/13 19:17

 */
public class HandleTest{
    private WebDriver driver = new FirefoxDriver();

    public void openBrowser(WebDriver driver,String URL){
//        WebDriver driver = new FirefoxDriver();

        driver.get(URL);

    }
    public void sleepTime() throws InterruptedException {
        int Time = 2000;
        Thread.sleep(Time);
    }

    /**
     * 句柄id输出测试
     */
    public void test1(){
//        WebDriver driver = new FirefoxDriver();
//        HandleTest handleTest = new HandleTest();
        String URL = "https://www.baidu.com/";
        this.openBrowser(driver,URL);
        System.out.println(driver.getWindowHandle());
        WebElement element = driver.findElement(By.partialLinkText("贴"));
//        driver.navigate().to(element);
        element.click();
//        driver.navigate().to("https://tieba.baidu.com/");
        System.out.println(driver.getWindowHandles());

    }

    /**
     * 句柄切换测试
     */
    public void test2() throws InterruptedException {

//        WebDriver driver = new FirefoxDriver();
        String URL = "https://www.jd.com/";
        this.openBrowser(driver,URL);
        sleepTime();
        WebElement phone_link = driver.findElement(By.linkText("手机"));
        phone_link.click();
        sleepTime();
        String handle = driver.getWindowHandle();
        for (String temhandle:driver.getWindowHandles()){
            if (!handle.equals(driver.getWindowHandles())){
                driver.quit();
                driver.switchTo().window(temhandle);
            }
        }




    }

    public static void main(String[] args) throws InterruptedException {
        HandleTest handleTest = new HandleTest();

        handleTest.test2();
    }
}