package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {


    public  static void main(String args[]) throws InterruptedException {


        WebDriver wd = new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");

        Thread.sleep(4000);

        wd.manage().window().maximize();

        wd.findElement(By.id("cloanamount")).clear();
        wd.findElement(By.id("cloanamount")).sendKeys("40000");
        wd.findElement(By.name("cloanterm")).clear();
        wd.findElement(By.name("cloanterm")).sendKeys("8");
        Boolean a =wd.findElement(By.id("cpayoff1")).isSelected();

        System.out.println(a);

        wd.findElement(By.xpath("//*[contains(text(),'Payback altogether')]")).click();



    }
}
