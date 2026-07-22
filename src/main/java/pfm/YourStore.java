package pfm;

import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class YourStore {

    //1. Click on My Account Icon
    WebDriver driver;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    WebElement myAccountIcon;

    @FindBy(xpath ="//a[text()='Login']" )
    WebElement loginLink;

    public YourStore(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnMyAccountIcon()
    {
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(TestData.WAIT_TIME));
    }

    public void clickOnLoginLink()
    {
        loginLink.click();
    }
}
