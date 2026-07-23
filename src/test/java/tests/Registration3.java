package tests;

import data.TestData;
import genericactions.Wrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Registration3 {
    public static void main(String[] args) {

        By countryDDl =By.id("input-country");
        By subscriptionDDL = By.name("subscription");
        //1. Open the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Enter the url
        driver.get("https://janbaskdemo.com/");

        Wrapper wrapper= new Wrapper(driver);

        //3. Click on my account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Register link
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        registerLink.click();

        //5. Fill the Registration form
        WebElement fNameTextBox = driver.findElement(By.id("input-firstname"));
        fNameTextBox.sendKeys("Bharati");

        WebElement lNameTextBox = driver.findElement(By.name("lastname"));
        lNameTextBox.sendKeys("Mishra");

        int randomNumber = new Random().nextInt(239) + 1;

        WebElement emailTextBox = driver.findElement(By.id("input-email"));
        emailTextBox.sendKeys("bharati.mishra"+randomNumber+"@janbask.com");

        WebElement telephoneTextBox = driver.findElement(By.name("telephone"));
        telephoneTextBox.sendKeys("8987756745");

        wrapper.doDDLSelectByValue(countryDDl);
//        WebElement countryDDL = driver.findElement(By.id("input-country"));
//        Select country = new Select(countryDDL);
//
//        country.selectByValue(Integer.toString(randomNumber));

        WebElement passwordTextBox = driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys("test@1234");

        WebElement cPasswordTextBox = driver.findElement(By.id("input-confirm"));
        cPasswordTextBox.sendKeys("test@1234");

        WebElement yesRadioButton = driver.findElement(By.name("newsletter"));
        yesRadioButton.click();

//        WebElement subscriptionDDL = driver.findElement(By.name("subscription"));
//        Select subscribe = new Select(subscriptionDDL);
//        subscribe.selectByValue("Monthly");
        wrapper.doDDLSelectByStringValue(subscriptionDDL, TestData.SUBSCRIPTION_TYPE);

        //6. Click on Privacy Policy checkbox
        WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
        privacyPolicyCheckbox.click();

        //7. Click on Continue button
        WebElement continueBtn = driver.findElement(By.id("submitbtn"));
        continueBtn.click();

        //8. Validate registration status
        WebElement successLink =driver.findElement(By.xpath("//a[text()='Success']"));
        String successMsg =successLink.getText();
        System.out.println("SUCCESS MESSAGE IS: " + successMsg);

        if(successMsg.equals("Success"))
        {
            System.out.println("Congratulation....you have been registered");
        }
        else
        {
            System.out.println("This email already Registered....");
        }
        //9. Close the browser
        driver.close();

    }
}
