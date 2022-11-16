package project1Nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class edge {
    public static void main(String[] args) {

        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //launce Url
        driver.get(baseurl);
        //Maximize window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the tittle of the page
        String tittle = driver.getTitle();
        System.out.println("page tittle is: +tittle");

        //get current url
        System.out.println("current url :" + driver.getCurrentUrl());

        //find the emailField element
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("manisha@gmail.com");

        //Find the password field emements
        WebElement passwordfield = driver.findElement(By.name("Password"));
        passwordfield.sendKeys("Patel123");

        //closing
        driver.quit();


    }

}
