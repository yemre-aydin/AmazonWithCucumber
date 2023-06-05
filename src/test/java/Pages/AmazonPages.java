package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept= By.id("sp-cc-accept");
    static By search=By.id("twotabsearchtextbox");

    public AmazonPages(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new ElementHelper(driver);
    }
    public static void HomePage(){

    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }


    public static void writeProduct() {
    }

    public static void searchButton() {
    }

    public static void clickProduct() {
    }

    public static void confirmPages() {
    }

    public static void selectrandomProduct() {
    }

    public static void writeProductInformation() {
    }

    public static void addSelectedProduct() {
    }

    public static void equalsProductPrice() {
    }

    public static void addPieceConfirmProduct() {
    }

    public static void emptyProductCart() {
    }

    public static void confirmEmptyProductCart() {
    }
}
