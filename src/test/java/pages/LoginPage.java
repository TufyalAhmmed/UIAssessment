package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public String login_page_url = "https://juice-shop.herokuapp.com/";

    public String DismissBtn = "//span[normalize-space()='Dismiss']";
    public String AccountBtn = "//span[normalize-space()='Account']";
    public String LoginBtn = "//button[@id='navbarLoginButton']//span[contains(text(),'Login')]";
    public String Emailinp = "//input[@id='email']";
    public String PassInp= "//input[@id='password']";
    public String LoginPageBtn = "//button[@id='loginButton']//span[@class='mat-button-wrapper']";
    public String addToBasketBtn = "(//span[contains(text(),'Add to Basket')])[1]";
    public String yourBasketBtn = "//span[normalize-space()='Your Basket']";
    public String checkoutBtn = "//span[normalize-space()='Checkout']";
    public String addNewAddressBtn = "//span[normalize-space()='Add New Address']";
    public String AddressCountryInp = "(//input[@id='mat-input-3'])[1]";
    public String AddressNameInp = "(//input[@id='mat-input-4'])[1]";
    public String AddressMobileInp = "(//input[@id='mat-input-5'])[1]";
    public String AddressZipInp = "(//input[@id='mat-input-6'])[1]";
    public String AddressAddressInp = "(//textarea[@id='address'])[1]";
    public String AddressCityInp = "(//input[@id='mat-input-8'])[1]";
    public String AddressStateInp = "(//input[@id='mat-input-9'])[1]";
    public String AddressSubmitBtn = "(//input[@id='mat-input-9'])[1]";
    public String SearchIcon = "//mat-icon[normalize-space()='search']";
    public String SearchInputIcon = "(//input[@id='mat-input-0'])[1]";

    public String error_msg = "Epic sadface: Username and password do not match any user in this service";
    public By username_input_field = By.id("user-name");
    public By password_input_field = By.id("password");
    public By login_button = By.id("login-button");
    public By username = By.id("login_credentials");
    public By password = By.className("login_password");

    public By error_msg_locator = By.tagName("h3");


    public String getUserName(){
        return getElementText(username);
    }

    public String getPassword(){
        return getElementText(password);
    }


}
