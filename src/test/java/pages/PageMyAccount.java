package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageMyAccount {
    private final WebDriver driver;

    @FindBy(xpath = "//a[@title='Addresses']")
        private WebElement myAddresses;



    public void myAddresses(){
        myAddresses.click();
        }
    public PageMyAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}


