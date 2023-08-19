package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel {
    public WebDriver driver;

    By continueShoppingBtn = By.xpath("//button[contains(text(),'Continue shopping')]");
    By proceedToCheckoutBtn = By.linkText("\uE876PROCEED TO CHECKOUT");

    public ShopContentPanel(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getContinueShopBtn(){
        return driver.findElement(continueShoppingBtn);
    }

    public WebElement getProceedToCheckoutBtn(){
        return driver.findElement(proceedToCheckoutBtn);
    }
}
