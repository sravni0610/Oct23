package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {

    WebDriver driver;

    private static WebElement element = null;


    public static WebElement username(WebDriver driver){

        element = driver.findElement(By.id("txtUsername"));

        return element;
    }

    public static WebElement password(WebDriver driver){
        element = driver.findElement(By.name("txtPassword"));
        return  element;
    }

    public static WebElement login_btn(WebDriver driver){
        element = driver.findElement(By.id("btnLogin"));
        return  element;
    }


}
