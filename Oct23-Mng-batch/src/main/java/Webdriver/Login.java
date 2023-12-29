package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String args[]){


        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        WebDriver wd = new ChromeDriver();


        wd.get(url);

        wd.manage().window().maximize();

        wd.findElement(By.id("txtUsername")).sendKeys("admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@");
        wd.findElement(By.id("btnLogin")).click();
        wd.findElement(By.linkText("Forgot your password?")).click();
        wd.findElement(By.className("cancel")).click();
        wd.findElement(By.partialLinkText("Forgot")).click();
        wd.findElement(By.id("securityAuthentication_userName")).sendKeys("sample");
        wd.findElement(By.id("btnSearchValues")).click();

    }
}
