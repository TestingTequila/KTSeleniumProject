package pompcc;

import data.AppData;
import data.TestData;
import genericactions.Wrapper;
import org.openqa.selenium.WebDriver;

public class MyAccount {
    WebDriver driver;
    Wrapper wrapper;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
        wrapper = new Wrapper(driver);
    }

    public void validateLoginStatus() {
        wrapper.doValidatePageTitle(TestData.PAGE_TITLE);
    }
}
