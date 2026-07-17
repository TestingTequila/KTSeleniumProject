package ReusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonActions {
    static WebDriver driver;

    public static WebDriver launchBrowser(String browserName) {
        if (browserName.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equals("Edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equals("IE")) {
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Not a valid browser name....");
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeBrowser() {
        driver.quit();
    }
}
