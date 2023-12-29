package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleLoginNG {

    WebDriver wd;

    @BeforeMethod
    public void before() throws InterruptedException {

        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

       wd = new ChromeDriver();


        wd.get(url);

        wd.manage().window().maximize();

        Thread.sleep(5000);


    }

    @Test
    public void logintest(){

        wd.findElement(By.id("txtUsername")).sendKeys("admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();

        String exp_title = "OrangeHRM";
        String act_title = wd.getTitle();

        if(exp_title.equals(act_title)){
            System.out.println("Titles MAtched");
        }

        else {
            System.out.println("Titles not matched");

        }



    }

    @AfterMethod

    public void after(){
        System.out.println("Executes after test");
        wd.close();
    }


}
