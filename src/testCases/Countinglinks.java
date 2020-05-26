package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Countinglinks {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
        List <WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("There is a total of "+links.size()+" links");
        //reading all links from a web page and display
        for (WebElement e:links) {
            System.out.println(e.getText());

        }



    }
}
