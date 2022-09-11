package pages;

import data.DataNewAddress;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PageAddNewAdresses {
     WebDriver driver;


    @FindBy(css = "#address1")
    private WebElement addressLine1input;

    @FindBy(css = "#city")
    private WebElement cityInput;

    @FindBy(css = "#id_state")
    private WebElement stateInput;

    @FindBy(css = "#postcode")
    private WebElement postCodeInput;

    @FindBy(css = "#id_country")
    private WebElement countryInput;

    @FindBy(css = "#phone")
    private WebElement phoneInput;

    @FindBy(css = "#phone_mobile")
    private WebElement mobilePhoneInput;

    @FindBy(css = "#alias")
    private WebElement aliasInput;

    @FindBy(css = "#submitAddress")
    private WebElement submitSaveButton;


    public void fillAdressesForm(DataNewAddress dataNewAddress) {

        addressLine1input.sendKeys(dataNewAddress.addressLine1);
        cityInput.sendKeys(dataNewAddress.userCity);
        stateInput.sendKeys(dataNewAddress.userState);
        postCodeInput.sendKeys(dataNewAddress.userPostCode);
        countryInput.sendKeys(dataNewAddress.userCountry);
        phoneInput.sendKeys(dataNewAddress.userPhone);
        mobilePhoneInput.sendKeys(dataNewAddress.userPhoneMobile);
        aliasInput.sendKeys(dataNewAddress.alias);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void pageAddNewAdresses(DataNewAddress dataNewAddress) {
        fillAdressesForm(dataNewAddress);
        submitSaveButton.click();
    }

    public PageAddNewAdresses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

