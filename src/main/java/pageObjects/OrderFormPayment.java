package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPayment {
    public WebDriver driver;

    By payByCheck = By.cssSelector("[data-module-name='ps_checkpayment']");
    By payByBankWire= By.cssSelector("[data-module-name='ps_wirepayment']");
    By termsOfServiceCheckBox = By.cssSelector("#checkout-payment-step [method] .ps-shown-by-js");
    By orderBtn = By.cssSelector(".btn.btn-primary.center-block");

    public OrderFormPayment(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getPayByCheck(){
        return driver.findElement(payByCheck);
    }

    public WebElement getPayByBankWire(){
        return driver.findElement(payByBankWire);
    }

    public WebElement getTermsOfServiceCheckBox(){
        return driver.findElement(termsOfServiceCheckBox);
    }

    public WebElement getOrderBtn(){
        return driver.findElement(orderBtn);
    }

}
