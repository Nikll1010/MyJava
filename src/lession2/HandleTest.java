/**
 * @program: MyJava
 * @description: 句柄操作
 * @author Nikll
 * @date 2018/11/13 19:17
 */
package lession2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    public void testpass(){
        System.out.println("test pass !!!");
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
        String handle1 = driver.getWindowHandle();
        System.out.println(handle1);
        sleepTime();
        WebElement phone_link = driver.findElement(By.linkText("手机"));
        phone_link.click();
        sleepTime();
        String handle = driver.getWindowHandle();

        //切换到新打开页面的句柄
        for (String temhandle:driver.getWindowHandles()){
            if (!temhandle.equals(handle1)){
//                driver.quit();
                driver.switchTo().window(temhandle);
            }
        }
        String handle2 = driver.getWindowHandle();
        System.out.println(handle2);



    }

    public void test3() throws InterruptedException {
        //利用Javascript处理竖向滚动条
        String URL = "https://blog.csdn.net/";
        this.openBrowser(driver,URL);
        sleepTime();
        //定义一个元素
        WebElement element = driver.findElement(By.xpath("//div[@class='right_box footer_box csdn-tracking-statistics']/h3[@class = 'feed_new_tit']/span[@class='txt']"));
        //创建一个执行实例
        JavascriptExecutor js = (JavascriptExecutor) driver;
        sleepTime();
        //执行定位到该元素   arguments[0] 是js中的第一个参数
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        testpass();
    }

    public static void main(String[] args) throws InterruptedException {
        HandleTest handleTest = new HandleTest();
//        handleTest.test1();
//        handleTest.test2();
        handleTest.test3();
    }
}