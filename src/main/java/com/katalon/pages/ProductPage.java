package com.katalon.pages;

import com.katalon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@aria-label='Add “Flying Ninja” to your cart']")
    WebElement addFlyingNinjaToCart;

    @CacheLookup
    @FindBy(xpath = "//li[@class='product type-product post-26 status-publish instock product_cat-clothing product_cat-t-shirts has-post-thumbnail taxable shipping-taxable purchasable product-type-simple']//a[@aria-label='Add “Happy Ninja” to your cart'][normalize-space()='Add to cart']")
    WebElement addHappyNinjaToCart;

    @CacheLookup
    @FindBy(xpath = "//a[@aria-label='Add “Patient Ninja” to your cart']")
    WebElement addPatientNinjaToCart;

    @CacheLookup
    @FindBy(xpath = "//li[@class='product type-product post-22 status-publish first instock product_cat-clothing product_cat-t-shirts has-post-thumbnail taxable shipping-taxable purchasable product-type-simple']//a[@aria-label='Add “Premium Quality” to your cart'][normalize-space()='Add to cart']")
    WebElement addPremiumQualityToCart;

    public void addFlyingNinjaProductToCart() {
        log.info("Adding Flying Ninja to cart : " );
        clickOnElement(addFlyingNinjaToCart);
    }
    public void addHappyNinjaProductToCart() {
        log.info("Adding Happy Ninja to cart : " );
        clickOnElement(addHappyNinjaToCart);
    }
    public void addPatientNinjaProductToCart() {
        log.info("Adding Patient Ninja to cart : " );
        clickOnElement(addPatientNinjaToCart);
    }
    public void addPremiumQualityProductToCart() {
        log.info("Adding Premium Quality to cart : " );
        clickOnElement(addPremiumQualityToCart);
    }

 }
