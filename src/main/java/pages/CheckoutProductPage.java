package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import utils.WebActions;

public class CheckoutProductPage {
    private Page page;

    private final Locator USERNAME_INPUTBOX;
    private final Locator PASSWORD_INPUTBOX;
    private final Locator LOGIN_BUTTON;
    private final Locator PRODUCTS_PAGE;
    private final Locator CART_BUTTON;
    private final Locator CART_BUTTONS;
    private final Locator CONTAINER_BUTTON;
    private final Locator CHECKOUT_BUTTON;
    private final Locator FIRSTNAME_INPUTBOX;
    private final Locator LASTNAME_INPUTBOX;
    private final Locator POSTALCODE_INPUTBOX;
    private final Locator CONTINUE_BUTTON;
    private final Locator FINISH_BUTTON;

    public CheckoutProductPage(Page page) {
        this.page = page;
        this.USERNAME_INPUTBOX = page.locator("//input[@id='user-name']");
        this.PASSWORD_INPUTBOX = page.locator("//input[@type='password']");
        this.LOGIN_BUTTON = page.locator("//input[@value='LOGIN']");
        this.PRODUCTS_PAGE = page.locator(".product_label");
        this.CART_BUTTON = page.locator("(//button[@class='btn_primary btn_inventory'])[1]");
        this.CART_BUTTONS = page.locator("[class*='btn_inventory']");

        this.CONTAINER_BUTTON = page.locator("//div[@id='shopping_cart_container']");
        this.CHECKOUT_BUTTON = page.locator("//a[@class='btn_action checkout_button']");
        this.FIRSTNAME_INPUTBOX = page.locator("//input[@id='first-name']");
        this.LASTNAME_INPUTBOX = page.locator("//input[@id='last-name']");
        this.POSTALCODE_INPUTBOX = page.locator("//input[@id='postal-code']");
        this.CONTINUE_BUTTON = page.locator("//input[@class='btn_primary cart_button']");
        this.FINISH_BUTTON = page.locator("//a[@class='btn_action cart_button']");
    }

    public void navigateToUrl(String url) {
        this.page.navigate(WebActions.getProperty(url));
    }

    public void enterUsername(String username) {
        USERNAME_INPUTBOX.fill(WebActions.getProperty(username));
    }

    public void enterPassword(String password) {
        PASSWORD_INPUTBOX.fill(WebActions.getProperty(password));
    }

    public void clickLogin() {
        LOGIN_BUTTON.click();
    }

    public boolean verifyProductsPage() {
        return WebActions.waitUntilElementDisplayed(this.PRODUCTS_PAGE, 60);
    }

    public void clickCart() {
        
        CART_BUTTON.click();
    }

    public void clickContainer() {
        CONTAINER_BUTTON.click();
    }

    public void clickCheckout() {
        CHECKOUT_BUTTON.click();
    }

    public void enterFirstname(String firstname) {
        FIRSTNAME_INPUTBOX.fill(WebActions.getProperty(firstname));
    }

    public void enterLastname(String lastname) {
        LASTNAME_INPUTBOX.fill(WebActions.getProperty(lastname));
    }

    public void enterPostalcode(String postalcode) {
        POSTALCODE_INPUTBOX.fill(WebActions.getProperty(postalcode));
    }

    public void clickContinue() {
        CONTINUE_BUTTON.click();
    }

    public void clickFinish() {
        FINISH_BUTTON.click();
    }
}
