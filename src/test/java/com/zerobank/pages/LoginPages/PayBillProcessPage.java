package com.zerobank.pages.LoginPages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillProcessPage {
    public PayBillProcessPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"onlineBankingMenu\"]/div/strong")
    public WebElement onlineBanking;

    @FindBy(id = "pay_bills_link")
    public WebElement payBill;

    @FindBy(xpath = "//*[@id=\"tabs\"]/ul/li[3]/a")
    public WebElement purchaseCurrencyTab;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropDownList;

    @FindBy(id="pc_amount")
    public WebElement amountTextBox;

    @FindBy(id ="pc_inDollars_true")
    public WebElement usDollarRadioButton;

    @FindBy(id="pc_inDollars_false")
    public WebElement selectCurrencyRadioButton;

    @FindBy(id="pc_calculate_costs")
    public WebElement calculateCostButton;




}
