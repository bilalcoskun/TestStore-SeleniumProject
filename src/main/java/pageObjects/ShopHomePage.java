package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopHomePage {
    public WebDriver driver;

    By productOne = By.linkText("Hummingbird Printed T-Shirt");
    By productTwo = By.linkText("Hummingbird Printed Sweater");

    public ShopHomePage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getProductOne(){
        return driver.findElement(productOne);
    }
    public WebElement getProductTwo(){
        return driver.findElement(productTwo);
    }
}
