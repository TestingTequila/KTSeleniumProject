package tests;

import data.AppData;
import org.openqa.selenium.WebDriver;
import pfm.AccountLogin;
import pfm.MyAccount;
import pfm.YourStore;

public class Login5_pfm {

    public static void main(String[] args) {
        //1- Open the browser
        WebDriver driver = ReusableMethods.CommonActions.launchBrowser(AppData.BROWSER_NAME);

        //2- Enter the url
        driver.get(AppData.URL);

        //3- Click on My Account icon
        YourStore ys= new YourStore(driver);
        ys.clickOnMyAccountIcon();

        //4- Click on login Link
        ys.clickOnLoginLink();

        //5- Enter correct email
        AccountLogin al= new AccountLogin(driver);
        al.enterEmail();

        //6- Enter correct password
        al.enterPassword();

        //7- Click on Login button
        al.clickOnLogiButton();

        //8- Validate Login status
        MyAccount ma =new MyAccount(driver);
        ma.validateLoginStatus();

        //9- Close the browser
        ReusableMethods.CommonActions.closeBrowser();

    }
}

//We made handling multiple browsers as common function[in class file ReusableMethods-->CommonActions-->launchBrowser]
