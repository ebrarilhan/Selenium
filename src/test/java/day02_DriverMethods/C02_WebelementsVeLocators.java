package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementsVeLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon sayfasina gidelim.
        driver.get("https://www.amazon.com/");

        // search bolumunu locate edelim.
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));

        // search bolumunde iphone aratalim.
        aramaKutusu.sendKeys("iphone", Keys.ENTER);

        /*
        eger bir web elementi (web sayfasindaki herbir buton ya da text/yazi) locate (konumunu belirleme)
        etmek istersek once manuel olarak web sayfasini acip sayfa uzerinde sag click yapip incele'ye
        tiklariz. karsimiza cikan HTML kodlarindan locaterlardan (konum belirleyiciler) essiz olani seceriz.
        genellikle id Attribute'u kullanilir. sectigimiz attribute degerini findelement() methodu icine
        findelement(By.id("attribute degeri")) seklinde yazariz.
         */

        //amazon sayfasindaki <input> ve <a> taglarinin sayisini yazdiriniz.
        List<WebElement> inputTags = driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayisi = " + inputTags.size());

        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayisi = " + linklerList.size());

        // linklerin kendisini yazdirma:
        for (WebElement w : linklerList){

            System.out.println(w.getText());

        }
    }
}
