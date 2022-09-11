import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import org.openqa.selenium.support.PageFactory;

public class TestAddNewAdress extends BaseTest {

    @Test
    public void addNewAdresses() {

        PageSignIn pageSignIn = new PageSignIn(webDriver);

        PageInputAccount pageInputAccount = new PageInputAccount(webDriver);
        PageMyAccount pageMyAccount = new PageMyAccount(webDriver);
        PageMyAddresses pageMyAddresses = new PageMyAddresses(webDriver);
        PageAddNewAdresses pageAddNewAdresses = new PageAddNewAdresses(webDriver);


        pageSignIn.signInInput();
        pageInputAccount.inputAccount(getData);
        pageMyAccount.myAddresses();
        pageMyAddresses.addNewdresses();
        pageAddNewAdresses.pageAddNewAdresses(getDataAddress);

        WebElement pageAdresses = webDriver.findElement
                (By.xpath("//*[@id=\"page\"]/div/div"));

        boolean checkPage = pageAdresses.isDisplayed();

        Assert.assertTrue(checkPage);

    }
}

