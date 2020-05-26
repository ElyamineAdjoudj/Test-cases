package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {

    public static String chromeDriver= "webdriver.chrome.driver";
    public static String chromeDriverPath="BrowserDriver\\Windows\\chromedriver.exe";
    public static String url="https://www.amazon.com/";

    public static void setUp(String browserDriver, String driverPath,String url) throws InterruptedException {
        //Chrome Browser

        System.setProperty(chromeDriver, chromeDriverPath);
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.get("https://www.amazon.com/");
        driver.navigate().to(url);
        //wait 5 sec
        
        String title=driver.getTitle();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Hand Sanitizer");
        System.out.println(title);
        driver.close();

    }


    public static void main(String[] args) throws InterruptedException {

        setUp(chromeDriver,chromeDriverPath,url);




          //Firefox Browser
        /*String geckoDriver= "webdriver.gecko.driver";
        String geckoDriverPatch="BrowserDriver\\Windows\\geckodriver.exe";

        System.setProperty(geckoDriver,geckoDriverPatch);

        WebDriver driver1= new FirefoxDriver();
        driver1.get("https://www.ebay.com/");
*/





    }
}
