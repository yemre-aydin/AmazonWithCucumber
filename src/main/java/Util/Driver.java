package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Driver {

    static WebDriver driver;
    static Properties properties;
    public static WebDriver inilitize_Driver(String browser){
        properties=ConfigReader.getProperties();
        if (browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        String url= properties.getProperty("amazon_url");//propertiesden okuması için
        int pageWait=Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        int impWait=Integer.parseInt(properties.getProperty("implecityWait"));
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(impWait,TimeUnit.SECONDS);

        return getDriver();

    }
    public static WebDriver getDriver(){
        return driver;
    }
}
