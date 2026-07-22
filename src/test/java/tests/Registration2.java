package tests;

import data.AppData;
import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration2 {
    public static void main(String[] args) {

        //1. Open the browser
        WebDriver driver = ReusableMethods.CommonActions.launchBrowser(AppData.BROWSER_NAME);
        driver.manage().window().maximize();

        //2. Enter the url
        driver.get(AppData.URL);

        //3. Click on my account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Register link
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        registerLink.click();

        //5. Fill the Registration form
        WebElement fNameTextBox = driver.findElement(By.id("input-firstname"));
        fNameTextBox.sendKeys(TestData.FIRST_NAME);

        WebElement lNameTextBox = driver.findElement(By.name("lastname"));
        lNameTextBox.sendKeys(TestData.LAST_NAME);

        int randomNumber = TestData.RANDOM_NUMBER;

        WebElement emailTextBox = driver.findElement(By.id("input-email"));
        emailTextBox.sendKeys(TestData.REGISTRATION_EMAIL_ID);

        WebElement telephoneTextBox = driver.findElement(By.name("telephone"));
        telephoneTextBox.sendKeys(TestData.TELEPHONE_NUMBER);

        WebElement countryDDL = driver.findElement(By.id("input-country"));
        Select country = new Select(countryDDL);

        country.selectByValue(Integer.toString(randomNumber));

        WebElement passwordTextBox = driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys(TestData.REGISTRATION_PASSWORD);

        WebElement cPasswordTextBox = driver.findElement(By.id("input-confirm"));
        cPasswordTextBox.sendKeys(TestData.REGISTRATION_CONFIRM_PASSWORD);

        WebElement yesRadioButton = driver.findElement(By.name("newsletter"));
        yesRadioButton.click();

        WebElement subscriptionDDL = driver.findElement(By.name("subscription"));
        Select subscribe = new Select(subscriptionDDL);
        subscribe.selectByValue(TestData.SUBSCRIPTION_TYPE);

        //6. Click on Privacy Policy checkbox
        WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
        privacyPolicyCheckbox.click();

        //7. Click on Continue button
        WebElement continueBtn = driver.findElement(By.id("submitbtn"));
        continueBtn.click();

        //8. Validate registration status
        WebElement successLink = driver.findElement(By.xpath("//a[text()='Success']"));
        String successMsg = successLink.getText();
        System.out.println("SUCCESS MESSAGE IS: " + successMsg);

        if (successMsg.equals("Success")) {
            System.out.println(TestData.REGISTRATION_SUCCESS_MESSAGE);
        } else {
            System.out.println(TestData.REGISTRATION_FAILURE_MESSAGE);
        }
        //9. Close the browser
        ReusableMethods.CommonActions.closeBrowser();

    }
}
