package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.actions=new Actions(driver);
    }

    public WebElement presenceElement(By key){//istenilen elementin gelip gelmediğini kontrol et

        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public  WebElement findElement(By key){
        WebElement element=presenceElement(key);
        return element;
    }
    public  void click(By key){//elemente butonu tıklama
        findElement(key).click();
    }
    public void sendKey(By key, String text){//elemente metin gönderme
        findElement(key).sendKeys(text);
    }

}
