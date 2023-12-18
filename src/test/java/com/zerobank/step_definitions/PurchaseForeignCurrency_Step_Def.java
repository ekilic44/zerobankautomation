package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPages.ErrorPage;
import com.zerobank.pages.LoginPages.Login_Page;
import com.zerobank.pages.LoginPages.MainPage;
import com.zerobank.pages.LoginPages.PayBillProcessPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PurchaseForeignCurrency_Step_Def {
    Login_Page login_page = new Login_Page();
    MainPage mainPage = new MainPage();
    ErrorPage errorPage = new ErrorPage();
    PayBillProcessPage paypage=new PayBillProcessPage();
    @Given("Users are onthe Main page")
    public void users_are_onthe_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Assert.assertTrue(mainPage.mainPageSignInButton.isDisplayed());
    }
    @Then("Users must  click Signin button")
    public void users_must_click_signin_button() {
        mainPage.mainPageSignInButton.click();
    }
    @Then("User is on the Login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        Assert.assertTrue(login_page.userName.isDisplayed());
        login_page.userName.sendKeys("username");
        login_page.password.sendKeys("password");
        Thread.sleep(2000);
        login_page.signInButton.click();

    }
    @Then("Users see an error on the page")
    public void users_see_an_error_on_the_page() {
        Assert.assertTrue(errorPage.errorMessagePage.isDisplayed());
    }
    @Then("Users came back and they are signed in already")
    public void users_came_back_and_they_are_signed_in_already() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);
    }
    @Then("user should clicl online banking")
    public void user_should_clicl_online_banking() {
    paypage.onlineBanking.click();
    }
    @Then("user should click Paybill menu")
    public void user_should_click_paybill_menu() {
    paypage.payBill.click();
    }
    @When("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_purchase_foreign_currency_cash_tab() {
    paypage.purchaseCurrencyTab.click();
    }
    @Then("following currencies should be available")
    public void following_currencies_should_be_available(io.cucumber.datatable.DataTable value) {
        Select select=new Select(paypage.currencyDropDownList);
        List<WebElement> dropMenuElements=select.getOptions();

        List<String> stringMenu=new ArrayList<>();

        List<String> tableElements=value.asList();
        for(int i =0;i<tableElements.size();i++){
        String option=tableElements.get(i);
            for(int j=0;j<dropMenuElements.size();j++){

                stringMenu.add(dropMenuElements.get(j).toString());
            }
        }


        Assert.assertEquals(stringMenu,tableElements);
        //Assert.assertTrue(dropMenuElements.equals(value));

    }

    @Then("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {

    }
    @Then("first error message should be displayed")
    public void first_error_message_should_be_displayed() {

    }
    @Then("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {

    }
    @Then("second error message should be displayed")
    public void second_error_message_should_be_displayed() {

    }





}
