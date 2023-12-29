package TestNg;

import org.testng.annotations.Test;

public class BasicTest {


    @Test(priority = 2)
    public void A(){
        System.out.println("Simple first testNG Test");
    }

    @Test(priority = 0)
    public void a(){
        System.out.println("Simple Test two");
    }
    @Test(priority = 1)
    public void B(){
        System.out.println("Test Three");
    }

}
