package day01_DriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Selenium {

    public static void main(String[] args) {


//        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

       /*
       En temel haliyle otomasyon yapmak icin Class'ımıza otomasyon icin gerekli olan
       webdriver'in yerini goostermemiz gerekir.Bunun icin java kutuphanesinden System.setProperty()
        methodunun icine ilk olarak driver'i yazariz. İkinci olarak driver'in fiziki yolunu kopyalariz
        */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
    }
}
