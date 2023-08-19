package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HomePage {
    public WebDriver driver;

    By testStoreLink = By.linkText("TEST STORE");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getTestStoreLink(){
        return driver.findElement(testStoreLink);
    }

    By cookie = By.cssSelector(".close-cookie-warning > span");
    public WebElement getCookie() throws IOException {
        return driver.findElement(cookie);
    }

}
