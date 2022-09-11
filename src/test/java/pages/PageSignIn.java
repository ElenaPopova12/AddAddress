package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSignIn {
    private final WebDriver driver;



    @FindBy(xpath =  "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public WebElement signInInput;

    public void signInInput(){
        signInInput.click();
    }
    public PageSignIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
