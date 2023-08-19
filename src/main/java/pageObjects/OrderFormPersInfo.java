package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPersInfo {
    public WebDriver driver;

    By genderMr = By.cssSelector("[class] .radio-inline:nth-of-type(1) [name]");
    By genderMrs = By.cssSelector("[class] .radio-inline:nth-of-type(2) [name]");
    By firstName = By.cssSelector("[name='firstname']");
    By lastName = By.cssSelector("[name='lastname']");
    By email = By.cssSelector("form#customer-form > section input[name='email']");
    By password = By.cssSelector("form#customer-form > section input[name='password']");
    By birthDate = By.cssSelector("[name='birthday']");
    By receiveOffersCheckBox = By.cssSelector("[name='optin']");
    By newsletterCheckBox = By.cssSelector("[name='newsletter']");
    By privacyPolicyCheckBox = By.cssSelector("[name='psgdpr']");
    By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");

    public OrderFormPersInfo(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getGenderMr(){
        return driver.findElement(genderMr);
    }

    public WebElement getGenderMrs(){
        return driver.findElement(genderMrs);
    }

    public WebElement getFirstName(){
        return driver.findElement(firstName);
    }

    public WebElement getLastName(){
        return driver.findElement(lastName);
    }

    public WebElement getEmail(){
        return driver.findElement(email);
    }

    public WebElement getPassword(){
        return driver.findElement(password);
    }

    public WebElement getBirthDate(){
        return driver.findElement(birthDate);
    }

    public WebElement getReceiveOffersCheckBox(){
        return driver.findElement(receiveOffersCheckBox);
    }

    public WebElement getNewsletterCheckBox(){
        return driver.findElement(newsletterCheckBox);
    }

    public WebElement getPrivacyPolicyCheckBox(){
        return driver.findElement(privacyPolicyCheckBox);
    }

    public WebElement getContinueBtn(){
        return driver.findElement(continueBtn);
    }

}
