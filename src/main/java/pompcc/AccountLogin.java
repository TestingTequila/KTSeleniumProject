package pompcc;

import data.TestData;
import genericactions.Wrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLogin {
    WebDriver driver;
    Wrapper wrapper;
    By emailTextBox = By.xpath("//input[@id='input-email']");
    By passwordTextBox = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@type='submit']");


    public AccountLogin(WebDriver driver)
    {
        this.driver= driver;
        wrapper = new Wrapper(driver);
    }
    public void enterEmail()
    {
        wrapper.doSendKeys(emailTextBox,TestData.EMAIL_ID );
    }

    public void enterPassword()
    {
        wrapper.doSendKeys(passwordTextBox,TestData.PASSWORD);
    }

    public MyAccount clickOnLogiButton()
    {
        wrapper.doClick(loginButton);
        return new MyAccount(driver);
    }


}
