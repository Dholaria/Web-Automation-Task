package com.katalon.pages;

import com.katalon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends Utility {
    private static final Logger log = LogManager.getLogger(CartPage.class.getName());

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cart;

    @CacheLookup
    @FindBy(xpath = "//input[@size='4']")
    List<WebElement> chkQty;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='woocommerce-cart-form__cart-item cart_item']//td[@class='product-price']")
    List<WebElement> getAllPrices;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]")
    WebElement removeFromCart;

    @CacheLookup
    @FindBy(xpath = "//input[@class='input-text qty text']")
    List<WebElement> updatedQty;

    public void clickOnCart() {
        log.info("Clicking on Cart : ");
        clickOnElement(cart);
    }

    public int checkQtyInCart() {
        log.info("Checking Cart Quantity : ");
        return chkQty.size();
    }

    public void searchAndRemoveLowestPrice() {
        for (WebElement s : getAllPrices) {
            if (s.getText().equalsIgnoreCase("$12.00")) {
                clickOnElement(removeFromCart);
            }
        }
    }
    public int checkQtyInCartAfterRemoving() {
        log.info("Checking Cart Quantity after removing 1 product : ");
        return updatedQty.size();
    }


}
