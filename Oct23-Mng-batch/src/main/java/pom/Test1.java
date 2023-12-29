package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String args[]) throws InterruptedException {

        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

       WebDriver driver = new ChromeDriver();

    String id = "admin";
    String pwd = "Qedge123!@#";
        driver.get(url);

        Thread.sleep(4000);

        driver.manage().window().maximize();

        Login_page1 lp = new Login_page1(driver);
        Home_page hp = new Home_page(driver);
//        lp.username.sendKeys("admin");
//        lp.password.sendKeys("Qedge123!@#");
//        lp.login_btn.click();
        lp.login(id,pwd);
        hp.PIM.click();



    }
}
