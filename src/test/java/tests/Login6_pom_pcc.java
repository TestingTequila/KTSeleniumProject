package tests;

import data.AppData;
import org.openqa.selenium.WebDriver;
import pompcc.AccountLogin;
import pompcc.MyAccount;
import pompcc.YourStore;

public class Login6_pom_pcc {

    public static void main(String[] args) {
        //1- Open the browser
        WebDriver driver = ReusableMethods.CommonActions.launchBrowser(AppData.BROWSER_NAME);

        //2- Enter the url
        driver.get(AppData.URL);

        //3- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        //4- Click on login Link
        AccountLogin al= ys.clickOnLoginLink();

        //5- Enter correct email
        al.enterEmail();

        //6- Enter correct password
        al.enterPassword();

        //7- Click on Login button
        MyAccount ma=al.clickOnLogiButton();

        //8- Validate Login status
        ma.validateLoginStatus();

        //9- Close the browser
        ReusableMethods.CommonActions.closeBrowser();
    }
}

