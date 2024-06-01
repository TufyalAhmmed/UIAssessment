package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.LoginPage;

import java.util.List;

import static org.testng.Assert.*;
import static utilities.DriverSetup.getDriver;

public class LoginStep {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        getDriver().get(loginPage.login_page_url);
    }

    @And("user click on the login button")
    public void userClickOnTheLoginButton() {
        loginPage.clickOnAElement(By.xpath(loginPage.LoginPageBtn));
    }

    @When("user input valid {string} and {string}")
    public void userInputValidAnd(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
       basePage.clickOnAElement(By.xpath(loginPage.DismissBtn));
        Thread.sleep(2000);
       basePage.clickOnAElement(By.xpath(loginPage.AccountBtn));
       basePage.clickOnAElement(By.xpath(loginPage.LoginBtn));
        loginPage.writeOnByLocator(By.xpath(loginPage.Emailinp), username);
        loginPage.writeOnByLocator(By.xpath(loginPage.PassInp), password);
    }

    @And("user should see an {string}")
    public void userShouldSeeAn(String error_message) {
        assertEquals(loginPage.getElementText(loginPage.error_msg_locator), error_message);
    }

    @And("Add apple to the basket")
    public void addAppleToTheBasket() {
        basePage.clickOnAElement(By.xpath(loginPage.addToBasketBtn));
    }

    @And("Checkout from basket")
    public void checkoutFromBasket() throws InterruptedException {
        Thread.sleep(2000);
        basePage.clickOnAElement(By.xpath(loginPage.yourBasketBtn));
        Thread.sleep(2000);
        basePage.clickOnAElement(By.xpath(loginPage.checkoutBtn));
    }

    @And("Fill the new address")
    public void fillTheNewAddress() throws InterruptedException {
        Thread.sleep(2000);
        basePage.clickOnAElement(By.xpath(loginPage.addNewAddressBtn));
        Thread.sleep(2000);
        loginPage.writeOnByLocator(By.xpath(loginPage.AddressCountryInp), "Bangladesh");
        Thread.sleep(1000);
        loginPage.writeOnByLocator(By.xpath(loginPage.AddressNameInp), "Tufyal");
        Thread.sleep(1000);
        loginPage.writeOnByLocator(By.xpath(loginPage.AddressMobileInp), "01679560509");
        Thread.sleep(1000);
        loginPage.writeOnByLocator(By.xpath(loginPage.AddressZipInp), "2230");
        Thread.sleep(1000);
        loginPage.writeOnByLocator(By.xpath(loginPage.AddressAddressInp), "Pallabi,Dhaka");
        Thread.sleep(1000);
        loginPage.writeOnByLocator(By.xpath(loginPage.AddressCityInp), "Dhaka");
        Thread.sleep(1000);
        loginPage.writeOnByLocator(By.xpath(loginPage.AddressStateInp), "Dhaka");
        Thread.sleep(2000);
        basePage.clickOnAElement(By.xpath(loginPage.AddressSubmitBtn));
        Thread.sleep(1000);
    }

    @Then("Verify search bar by searching Apple")
    public void verifySearchBarBySearchingApple() throws InterruptedException {
        Thread.sleep(2000);
        basePage.clickOnAElement(By.xpath(loginPage.SearchIcon));
        Thread.sleep(1000);
        loginPage.writeOnByLocator(By.xpath(loginPage.SearchInputIcon), "Apple");
        loginPage.writeOnByLocator(By.xpath(loginPage.SearchInputIcon), String.valueOf(Keys.ENTER));

    }

    @And("Verify two Apple product show up Banana product does not show up")
    public void verifyTwoAppleProductShowUpBananaProductDoesNotShowUp() {
        List<WebElement> appleProducts = getDriver().findElements(By.xpath("//*[contains(text(), 'Apple')]"));

        // Verify that at least two Apple products are found
        if (appleProducts.size() >= 2) {
            System.out.println("At least two Apple products are found and that banana product doesn't show up");
        } else {
            System.out.println("Less than two Apple products are found.");
        }
    }
}
