package automationtesting;

import base.BasePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

public class OrderCompleteTest extends BasePage {

    public OrderCompleteTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver=null;
    }

    @Test
    public void endToEndTest() throws InterruptedException, IOException {
        //creating an object of the automationtesting.co.uk webpage
        HomePage home= new HomePage(driver);
        home.getCookie().click();
        home.getTestStoreLink().click();

        //creating an object of the test store home page
        ShopHomePage shopHome = new ShopHomePage(driver);
        shopHome.getProductOne().click();

        //creating an object of the shop products page (when a product has been selected)
        ShopProductPage shopProd = new ShopProductPage(driver);
        Select option = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        shopProd.getQuantityIncrease().click();
        shopProd.getAddToCartBtn().click();

        Thread.sleep(5000);

        //creating an object of the cart content panel (once an item was added)
        ShopContentPanel cPanel = new ShopContentPanel(driver);
        cPanel.getProceedToCheckoutBtn().click();

        //creating an object of the shopping card page (all items selected)
        ShoppingCart cart = new ShoppingCart(driver);
        cart.getHavePromo().click();
        cart.getPromoTextBox().sendKeys("20OFF");
        cart.getPromoAddButton().click();
        Thread.sleep(5000);
        cart.getProceedToCheckoutBtn().click();

        //personal information
        OrderFormPersInfo pInfo = new OrderFormPersInfo(driver);
        pInfo.getGenderMr().click();
        pInfo.getFirstName().sendKeys("Bilal");
        pInfo.getLastName().sendKeys("Coskun");
        pInfo.getEmail().sendKeys("bilalcoskun@test.com");
        pInfo.getPrivacyPolicyCheckBox().click();
        Thread.sleep(5000);
        pInfo.getContinueBtn().click();

        //delivery address information
        OrderFormDelivery orderFormDelivery = new OrderFormDelivery(driver);
        orderFormDelivery.getAddress().sendKeys("123 Main Street");
        orderFormDelivery.getCity().sendKeys("Houston");
        Select state = new Select(orderFormDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderFormDelivery.getZipCode().sendKeys("77021");
        Thread.sleep(5000);
        orderFormDelivery.getContinueBtn().click();

        //shipping method information
        OrderFormShippingMethod shippingMethod = new OrderFormShippingMethod(driver);
        shippingMethod.getDeliveryMsgTextBox().sendKeys("Please be fast, it is important");
        shippingMethod.getContinueBtn().click();

        //payment information
        OrderFormPayment payment = new OrderFormPayment(driver);
        payment.getPayByCheck().click();
        payment.getTermsOfServiceCheckBox().click();
        Thread.sleep(5000);
        payment.getOrderBtn().click();
    }
}
