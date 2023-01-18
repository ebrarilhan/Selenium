package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {
    public static void main(String[] args) {

        //Ödev
        //-Amazon sayfasına gidiniz
        //-Arama kutusunu locate ediniz
        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        //-Sayfayı kapatınız


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1
        driver.get("https://www.amazon.com/");

        //2
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

        //3
        String expected = "input";
        String actual = aramaKutusu.getTagName();

        if (expected.equals(actual)){
            System.out.println("passed");
        }else {
            System.out.println("failed : " + actual);
        }


        //4
        String expectedA =  "field-keywords";
        String actualA  = aramaKutusu.getAttribute("name");

        if (expectedA.equals(actualA)){
            System.out.println("passed");
        }else {
            System.out.println("failed : " + actualA);
        }


        //5
        driver.close();



    }
}
