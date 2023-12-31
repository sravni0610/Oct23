package Webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Multisc {

    public static void main(String args[]) throws InterruptedException, IOException {

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");

        Thread.sleep(4000);
        wd.manage().window().maximize();

        List<WebElement> links = wd.findElements(By.tagName("a"));

        for(int i=0;i<links.size();i++){

            String linkname = links.get(i).getText();

            links.get(i).click();

            File sc = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sc,new File("C:\\Users\\sravn\\Documents\\testdata\\"+linkname+".png"));
            wd.navigate().back();
            links = wd.findElements(By.tagName("a"));


        }
    }
}
