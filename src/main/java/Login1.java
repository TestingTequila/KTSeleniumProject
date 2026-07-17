import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Login1 {
    public static void main(String[] args) {
        //1- Open the browser
        WebDriver driver = new ChromeDriver();

        //2- Enter the url
        driver.get("http://www.janbaskdemo.com/");

        //3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        //4- Click on login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();

        //5- Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys("jason.roger@janbask.com");

        //6- Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys("test@1234");

        //7- Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        //8- Validate Login status
        String expectedTitle = "My Account";
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Login is successful...");
        } else {
            System.out.println("Login failed...please check your credentials....");
        }
        //9- Close the browser
        driver.close();


    }
}
