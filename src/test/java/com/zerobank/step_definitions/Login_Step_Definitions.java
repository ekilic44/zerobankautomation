package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPages.*;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Timer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step_Definitions {
    Login_Page login_page=new Login_Page();
    ErrorPage errorPage=new ErrorPage();
    ForgottenPasswordPage forgottenPasswordPage=new ForgottenPasswordPage();
    MainPage mainPage=new MainPage();
    SignedInPage signedInPage=new SignedInPage();

    @Given("Users are on the Main page")
    public void users_are_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Assert.assertTrue(mainPage.mainPageSignInButton.isDisplayed());
    }
    @Then("Users should click Signin button")
    public void users_should_click_signin_button() {
        mainPage.mainPageSignInButton.click();
    }
    @Then("Users are on the Login page")
    public void users_are_on_the_login_page() {
        Assert.assertTrue(login_page.userName.isDisplayed());
    }
    @When("Users enter {string} and {string}")
    public void users_enter_and(String username, String password) {
login_page.userName.sendKeys(username);
login_page.password.sendKeys(password);
    }
    @When("Users click Sign in button")
    public void users_click_sign_in_button() {
login_page.signInButton.click();
    }
    @When("Users get an error on the page")
    public void users_get_an_error_on_the_page() {
Assert.assertTrue(errorPage.errorMessagePage.isDisplayed());
    }
    @Then("Users go back and they are signed in already")
    public void users_go_back_and_they_are_signed_in_already() throws InterruptedException {
Driver.getDriver().navigate().back();
signedInPage.profileUserName.isDisplayed();
signedInPage.profileUserName.click();
signedInPage.logoutFunction.isDisplayed();
        Thread.sleep(5000);
    }
    @When("Users enter wrong credentials {string} and {string}")
    public void users_enter_wrong_credentials_and(String InvalidUsername, String InvalidPassword) {
login_page.userName.sendKeys(InvalidUsername);
login_page.password.sendKeys(InvalidPassword);
    }
    @When("users see warning the message {string}")
    public void users_see_warning_the_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
