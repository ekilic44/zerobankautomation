package com.zerobank.pages.LoginPages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    public Login_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='user_login']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='user_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement signInButton;


    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement wrongUserNameOrPassword;

    @FindBy(xpath = "//*[text()='Forgot your password ?']")
    public WebElement forgetYourPassword;

}
