package com.zerobank.pages.LoginPages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignedInPage {
    public SignedInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement userNameDropDown;

    @FindBy(xpath = "//a[@id='logout_link']")
    public WebElement logoutLink;
}
