$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("product.feature");
formatter.feature({
  "line": 1,
  "name": "Product Test",
  "description": "As user I want to remove the lowest price item from the cart",
  "id": "product-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7998048300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should remove lowest price item from the cart successfully",
  "description": "",
  "id": "product-test;user-should-remove-lowest-price-item-from-the-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I add four items to the cart",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I view the cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I find total four items listed in my cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I search for lowest price item",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I am able to remove lowest price item from the cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am able to verify three items in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductStepdefs.iAddFourItemsToTheCart()"
});
formatter.result({
  "duration": 3407580399,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iViewTheCart()"
});
formatter.result({
  "duration": 1302742299,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iFindTotalFourItemsListedInMyCart()"
});
formatter.result({
  "duration": 35613601,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iSearchForLowestPriceItem()"
});
formatter.result({
  "duration": 22600,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iAmAbleToRemoveLowestPriceItemFromTheCart()"
});
formatter.result({
  "duration": 226381600,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iAmAbleToVerifyThreeItemsInMyCart()"
});
formatter.result({
  "duration": 3046034201,
  "status": "passed"
});
formatter.after({
  "duration": 815121500,
  "status": "passed"
});
});