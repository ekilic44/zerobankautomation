package com.zerobank.pages.LoginPages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPasswordPage {
    public ForgottenPasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[text()='Forgotten Password']")
    public WebElement forgottenPassword;
}
