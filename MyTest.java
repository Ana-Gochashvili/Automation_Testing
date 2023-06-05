import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class MyTest {

    @Test

    public  void search(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //Selenide.open("https://www.google.com/");

      //  $(byId("APjFqb")).sendKeys("Ana Gochashvili");
      //  $(byName("btnK")).sendKeys(Keys.ENTER);

        /*WebElement waitForGmail = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(byLinkText("Gmail")));
        waitForGmail.click();
        driver.close();*/

        Wait<WebDriver> waitForGmail = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500));

        waitForGmail.until(ExpectedConditions.presenceOfElementLocated(byLinkText("Gmailf"))).click();

        driver.quit();




























    //sleep(5000);

    }
}
