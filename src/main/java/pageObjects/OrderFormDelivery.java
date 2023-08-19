package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormDelivery {
    public WebDriver driver;

    By firstName = By.cssSelector(".form-fields input[name='firstname']");
    By lastName = By.cssSelector(".form-fields input[name='lastname']");
    By companyName = By.cssSelector("[name='company']");
    By address = By.cssSelector("[name='address1']");
    By addressComplement = By.cssSelector("[name='address2']");
    By city = By.cssSelector("input[name='city']");
    By stateDropdown = By.cssSelector("select[name='id_state']");
    By zipCode = By.cssSelector("input[name='postcode']");
    By countryDropdown = By.cssSelector("select[name='id_country']");
    By phone = By.cssSelector("input[name='phone']");
    By invoiceSameAddCheckBox = By.cssSelector("input#use_same_address");
    By continueBtn = By.cssSelector("button[name='confirm-addresses']");

    public OrderFormDelivery(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getFirstName(){
        return driver.findElement(firstName);
    }

    public WebElement getLastName(){
        return driver.findElement(lastName);
    }

    public WebElement getCompanyName(){
        return driver.findElement(companyName);
    }

    public WebElement getAddress(){
        return driver.findElement(address);
    }

    public WebElement getAddressComplementField(){
        return driver.findElement(addressComplement);
    }

    public WebElement getCity(){
        return driver.findElement(city);
    }

    public WebElement getStateDropdown(){
        return driver.findElement(stateDropdown);
    }

    public WebElement getZipCode(){
        return driver.findElement(zipCode);
    }

    public WebElement getCountryDropdown(){
        return driver.findElement(countryDropdown);
    }

    public WebElement getPhoneNumber(){
        return driver.findElement(phone);
    }
    public WebElement getContinueBtn(){
        return driver.findElement(continueBtn);
    }

    public WebElement getInvoiceSameAddCheckBox(){
        return driver.findElement(invoiceSameAddCheckBox);
    }
}
