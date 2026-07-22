package pfmpcc;

import data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogin {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;


    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail() {

        emailTextBox.sendKeys(TestData.EMAIL_ID);
    }

    public void enterPassword() {
        passwordTextBox.sendKeys(TestData.PASSWORD);
    }

    public MyAccount clickOnLogiButton() {
        loginButton.click();
        return new MyAccount(driver);
    }


}
