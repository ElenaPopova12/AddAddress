package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageMyAddresses {
    private final WebDriver driver;

    @FindBy(xpath = "//a[@title='Add an address']")
    private WebElement addNewdresses;


    public void addNewdresses() {
        addNewdresses.click();
    }

    public PageMyAddresses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
