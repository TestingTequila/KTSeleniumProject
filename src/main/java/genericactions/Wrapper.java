package genericactions;

import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Wrapper
{
    WebDriver driver;

    public Wrapper(WebDriver driver) {
        this.driver = driver;
    }

    public void doClick(By locator)
    {
        WebElement webElement = driver.findElement(locator);
        webElement.click();
    }

    public void doSendKeys(By locator, String text)
    {
        WebElement webElement =driver.findElement(locator);
        webElement.sendKeys(text);
    }

    public  void doValidatePageTitle(String title)
    {
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);

        if (title.equals(actualTitle)) {
            System.out.println(TestData.SUCCESS_MESSAGE);
        } else {
            System.out.println(TestData.FAILURE_MESSAGE);
        }
    }

    public  void doDDLSelectByValue(By locator)
    {
        int randomNumber = new Random().nextInt(239) + 1;
        WebElement countryDDL = driver.findElement(locator);
        Select country = new Select(countryDDL);
        country.selectByValue(Integer.toString(randomNumber));
    }
    public  void doDDLSelectByStringValue(By locator, String text)
    {

        WebElement countryDDL = driver.findElement(locator);
        Select country = new Select(countryDDL);
        country.selectByValue(text);
    }
}

