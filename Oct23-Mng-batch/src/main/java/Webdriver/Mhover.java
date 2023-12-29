package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mhover {

    public static void main(String args[]) throws InterruptedException {
        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        WebDriver wd = new ChromeDriver();


        wd.get(url);
        Thread.sleep(4000);
        wd.manage().window().maximize();

        wd.findElement(By.id("txtUsername")).sendKeys("admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();

        Actions action = new Actions(wd);
        WebElement pim = wd.findElement(By.xpath("//*[contains(text(),'PIM')]"));
        WebElement config = wd.findElement(By.id("menu_pim_Configuration"));
        WebElement customfi = wd.findElement(By.id("menu_pim_listCustomFields"));

        action.moveToElement(pim).moveToElement(config).moveToElement(customfi).build().perform();

        Thread.sleep(4000);

        customfi.click();



    }
}
