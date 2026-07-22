package pom;

import data.TestData;
import org.openqa.selenium.WebDriver;

public class MyAccount {
    WebDriver driver;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void validateLoginStatus() {
        String expectedTitle = TestData.PAGE_TITLE;
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);

        if (expectedTitle.equals(actualTitle)) {
            System.out.println(TestData.SUCCESS_MESSAGE);
        } else {
            System.out.println(TestData.FAILURE_MESSAGE);
        }
    }
}
