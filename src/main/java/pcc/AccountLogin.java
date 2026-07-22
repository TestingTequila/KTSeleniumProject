package pcc;

import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLogin {
    WebDriver driver;

    public AccountLogin(WebDriver driver)
    {
        this.driver= driver;
    }
    public void enterEmail()
    {
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys(TestData.EMAIL_ID);
    }

    public void enterPassword()
    {
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys(TestData.PASSWORD);
    }

    public MyAccount clickOnLogiButton()
    {
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        return new MyAccount(driver);
    }


}
