package pages;

import data.DataUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageInputAccount {
        private final WebDriver driver;



    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement signInInput;


    public void inputAccount(DataUser dataUser){
          emailInput.sendKeys(dataUser.email);
          passwordInput.sendKeys(dataUser.password);
          signInInput.click();
            }


            public PageInputAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        }


