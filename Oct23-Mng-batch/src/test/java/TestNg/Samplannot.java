package TestNg;

import org.testng.annotations.*;

public class Samplannot {

    @Test
    public  void testcase(){
        System.out.println("Test Execution");
    }

    @BeforeMethod
    public  void beforemethod(){
        System.out.println("Before test method");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("After test method");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("Before class");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("before test");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("After test");
    }



    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before suite");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("After suite");
    }



}
