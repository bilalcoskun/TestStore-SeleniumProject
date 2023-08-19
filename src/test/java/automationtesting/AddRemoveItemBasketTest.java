package automationtesting;

import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;
import java.time.Duration;

public class AddRemoveItemBasketTest extends BasePage{

    public AddRemoveItemBasketTest() throws IOException {
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
    public void addRemoveItem() throws IOException, InterruptedException {
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
        cPanel.getContinueShopBtn().click();
        shopProd.getHomePageLink().click();
        shopHome.getProductTwo().click();
        shopProd.getAddToCartBtn().click();
        cPanel.getProceedToCheckoutBtn().click();

        //deleting item from shopping card
        ShoppingCart cart = new ShoppingCart(driver);
        cart.getDeleteItemTwoBtn().click();

        //checking total value after deleting item
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(cart.getDeleteItemTwoBtn()));
        String actualValue = cart.getTotalValue().getText();
        Assert.assertEquals(actualValue,"$45.24");
    }

}
