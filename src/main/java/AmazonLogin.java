import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin
{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement bestSellersTab= driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
        bestSellersTab.click();
    }
}
