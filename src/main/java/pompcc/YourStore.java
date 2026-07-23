package pompcc;

import data.TestData;
import genericactions.Wrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class YourStore {

    //1. Click on My Account Icon
    WebDriver driver;
    Wrapper wrapper;
    By myAccountIcon= By.xpath("//i[@class='fa fa-user']");
    By loginLink = By.xpath("//a[text()='Login']");

    public YourStore(WebDriver driver) {
        this.driver = driver;
        wrapper = new Wrapper(driver);
    }

    public void clickOnMyAccountIcon() {
        wrapper.doClick(myAccountIcon);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(TestData.WAIT_TIME));
    }

    public AccountLogin clickOnLoginLink() {
        wrapper.doClick(loginLink);
        return new AccountLogin(driver);
    }
}
