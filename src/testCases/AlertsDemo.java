package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
        Thread.sleep(5000);

       // driver.switchTo().alert().accept();//closes popup by using ok button
        driver.switchTo().alert().dismiss();









    }
}
