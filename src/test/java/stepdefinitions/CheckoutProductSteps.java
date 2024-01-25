package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CheckoutProductPage;

public class CheckoutProductSteps {
    CheckoutProductPage checkoutProductPage = new CheckoutProductPage(DriverFactory.getPage());

    @Given("^user navigates to \"([^\"]*)\"$")
    public void navigateToUrl(String url) {
        checkoutProductPage.navigateToUrl(url);
    }

    @When("^user enters \"([^\"]*)\" username$")
    public void enterUsername(String username) {
        checkoutProductPage.enterUsername(username);
    }

    @When("^user enters \"([^\"]*)\" password$")
    public void enterPassword(String password) {
        checkoutProductPage.enterPassword(password);
    }

    @When("^user clicks Login button$")
    public void clickLogin() {
        checkoutProductPage.clickLogin();
    }

    @When("^user navigate to the products page$")
    public void userNavigateProductsPage() {
        checkoutProductPage.verifyProductsPage();
    }

    @When("^user click on add to cart$")
    public void clickCart() {
        checkoutProductPage.clickCart();
    }

    @When("^user click on container button$")
    public void clickContainer() {
        checkoutProductPage.clickContainer();
    }

    @When("^user click on checkout button$")
    public void clickCheckout() {
        checkoutProductPage.clickCheckout();
    }

    @When("^user enters \"([^\"]*)\" firstname$")
    public void enterfirstname(String firstname) {
        checkoutProductPage.enterFirstname(firstname);
    }

    @When("^user enters \"([^\"]*)\" lastname$")
    public void enterLastname(String lastname) {
        checkoutProductPage.enterLastname(lastname);
    }

    @When("^user enters \"([^\"]*)\" postalcode$")
    public void enterPostalcode(String postalcode) {
        checkoutProductPage.enterPostalcode(postalcode);
    }

    @When("^user click on continue button$")
    public void clickContinue() {
        checkoutProductPage.clickContinue();
    }

    @When("^user click on finish button$")
    public void clickFinish() {
        checkoutProductPage.clickFinish();
    }
}
