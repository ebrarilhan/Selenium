package day04_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // sayfadaki Berlin web elementini 3 farkli relative locator ile locate edin.
        WebElement NYCWebElement = driver.findElement(By.xpath("//*[@id='pid3_thumb']"));
        WebElement BayAreaWebElement = driver.findElement(By.cssSelector("img[id='pid8_thumb']"));
        WebElement BerlinWebElement = driver.findElement(with(By.tagName("li")).below(NYCWebElement).toLeftOf(BayAreaWebElement));

        BerlinWebElement.click();

        driver.close();



    }
}
