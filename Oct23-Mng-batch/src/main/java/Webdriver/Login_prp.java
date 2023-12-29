package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Login_prp {


    public static void main(String args[]) throws IOException, InterruptedException {

        File f = new File("C:\\Users\\sravn\\Documents\\testdata\\prp.txt");

        FileInputStream fis = new FileInputStream(f);

        Properties p = new Properties();
        p.load(fis);

        System.out.println(p.getProperty("id"));
        System.out.println(p.getProperty("pwd"));



        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        WebDriver wd = new ChromeDriver();


        wd.get(url);

        Thread.sleep(4000);

        wd.manage().window().maximize();



        wd.findElement(By.id("txtUsername")).sendKeys(p.getProperty("id"));
        wd.findElement(By.name("txtPassword")).sendKeys(p.getProperty("pwd"));
        wd.findElement(By.id("btnLogin")).click();
    }
}
