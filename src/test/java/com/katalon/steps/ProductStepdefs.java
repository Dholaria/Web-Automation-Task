package com.katalon.steps;

import com.katalon.pages.CartPage;
import com.katalon.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Harsha Dholaria
 */
public class ProductStepdefs {
    @Given("^I add four items to the cart$")
    public void iAddFourItemsToTheCart() throws InterruptedException {
        new ProductPage().addFlyingNinjaProductToCart();
        Thread.sleep(1000);
        new ProductPage().addPatientNinjaProductToCart();
        Thread.sleep(1000);
        new ProductPage().addHappyNinjaProductToCart();
        Thread.sleep(1000);
        new ProductPage().addPremiumQualityProductToCart();
    }

    @When("^I view the cart$")
    public void iViewTheCart() {
        new CartPage().clickOnCart();
    }

    @Then("^I find total four items listed in my cart$")
    public void iFindTotalFourItemsListedInMyCart() {
        int exp=4;
        int actual=new CartPage().checkQtyInCart();
        Assert.assertEquals("Not Matched",exp,actual);
    }

    @When("^I search for lowest price item$")
    public void iSearchForLowestPriceItem() {
    }

    @And("^I am able to remove lowest price item from the cart$")
    public void iAmAbleToRemoveLowestPriceItemFromTheCart() {
        new CartPage().searchAndRemoveLowestPrice();
    }

    @Then("^I am able to verify three items in my cart$")
    public void iAmAbleToVerifyThreeItemsInMyCart() throws InterruptedException {
        Thread.sleep(3000);
        int exp=3;
        int actual=new CartPage().checkQtyInCartAfterRemoving();
        Assert.assertEquals("Not Matched",exp,actual);
    }

}
