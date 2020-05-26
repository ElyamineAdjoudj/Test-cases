package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait= new WebDriverWait(driver,10000);



        driver.get("http://newtours.demoaut.com/");
        WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
        username.sendKeys("mercury");

        WebElement pass= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        pass.sendKeys("mercury");

    }


}
