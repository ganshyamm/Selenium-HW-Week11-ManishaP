package project1Nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) {
        String baseurl ="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gheko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //launce url
        driver.get(baseurl);

        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //get tittle of loaded page
        System.out.println("page tittle is :  +tittle");

        //get current Url
        System.out.println("Current url is: " + driver.getCurrentUrl());

        //Find email field element
        WebElement emailFilled = driver.findElement(By.id("Email:"));
        emailFilled.sendKeys("manisha123@gmail.com");

        //Find password field element
        WebElement passwordfilled = driver.findElement(By.id("Password:"));
        passwordfilled.sendKeys("Password123");

        driver.quit();




    }
}
