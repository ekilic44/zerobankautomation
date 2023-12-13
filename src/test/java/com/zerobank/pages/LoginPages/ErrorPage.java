package com.zerobank.pages.LoginPages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorPage {
    public ErrorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='ERR_SSL_VERSION_OR_CIPHER_MISMATCH']")
    public WebElement errorMessagePage;



}
