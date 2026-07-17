import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class Login4 {

    public static void main(String[] args) {
        //1- Open the browser
        WebDriver driver = ReusableMethods.CommonActions.launchBrowser(AppData.BROWSER_NAME);

        //2- Enter the url
        driver.get(AppData.URL);

        //3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(TestData.WAIT_TIME));

        //4- Click on login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();

        //5- Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys(TestData.EMAIL_ID);

        //6- Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys(TestData.PASSWORD);

        //7- Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        //8- Validate Login status
        String expectedTitle = TestData.PAGE_TITLE;
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);

        if (expectedTitle.equals(actualTitle)) {
            System.out.println(TestData.SUCCESS_MESSAGE);
        } else {
            System.out.println(TestData.FAILURE_MESSAGE);
        }
        //9- Close the browser
        ReusableMethods.CommonActions.closeBrowser();


    }
}

//We made handling multiple browsers as common function[in class file ReusableMethods-->CommonActions-->launchBrowser]
