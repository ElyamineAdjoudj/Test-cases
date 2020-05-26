package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
        driver.manage().window().maximize();

        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium")).click();//frame 1
        driver.switchTo().defaultContent();

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("WebDriver")).click();//frame 2
        driver.switchTo().defaultContent();

        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//div[@class='topNav']//a[contains(text(),'Deprecated')]")).click();//frame 3




    }
}
