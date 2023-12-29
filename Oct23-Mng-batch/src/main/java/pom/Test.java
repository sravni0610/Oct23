package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private static WebDriver driver;


    public static void main(String args[]) throws InterruptedException {

        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        driver = new ChromeDriver();


        driver.get(url);

        Thread.sleep(4000);

        driver.manage().window().maximize();

        Login_page.username(driver).sendKeys("admin");
        Login_page.password(driver).sendKeys("Qedge123!@#");
        Login_page.login_btn(driver).click();


    }


}
