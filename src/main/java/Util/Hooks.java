package Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.Properties;

public class Hooks {
    //Before ve After testlerini burada  tanımlı
    WebDriver driver;
    Properties properties;

    @Before
    public void before(){
        String browser= Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");

        properties=ConfigReader.inilialize_Properties();//configreader dosyasından okutuyoruz
        driver=Driver.inilitize_Driver(browser);
    }
    @After
    public void after(){
        driver.quit();
    }
}
