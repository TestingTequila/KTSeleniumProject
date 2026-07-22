package pcc;

import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class YourStore {

    //1. Click on My Account Icon
    WebDriver driver;

    public YourStore(WebDriver driver)
    {
        this.driver= driver;
    }

    public void clickOnMyAccountIcon()
    {
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(TestData.WAIT_TIME));
    }

    public AccountLogin clickOnLoginLink()
    {
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
        return  new AccountLogin(driver);
    }
}
