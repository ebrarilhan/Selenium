package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {

     static WebDriver driver;

    public static void main(String[] args) {

        /*

        Ilk once browseri maximixe yapalim sonra tum sayfa icin max bekleme suresi olarak 15 sn belirtelim
        Sirasiyla amazon, facebook ve youtube sayfalarina gidelim.
        Amazon sayfasina tekrar donelim.
        Amazon sayfasinin Url'inin https://www.amazon.com/ adresine esit oldugunu test edelim.
        Sayfanin konumu ve pozisyonunu yazdiralim.
        Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim
        ve istedigimiz sekilde oldugunu test edelim.
        ve sayfayi kapatalim.
         */

        driver = new ChromeDriver();

        //Ilk once browseri maximixe yapalim sonra tum sayfa icin max bekleme suresi olarak 15 sn belirtelim
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Sirasiyla amazon, facebook ve youtube sayfalarina gidelim.
        driver.get("https://www.amazon.com/");
        driver.get("https://www.facebook.com/");
        driver.get("https://www.youtube.com/");

        //Amazon sayfasina tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();

        //Amazon sayfasinin Url'inin https://www.amazon.com/ adresine esit oldugunu test edelim.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL testi passed");
        }else {
            System.out.println("URL testi failed");
        }

        //Sayfanin konumu ve pozisyonunu yazdiralim.
        System.out.println("sayfanin size'i = " + driver.manage().window().getSize());
        System.out.println("sayfanin konumu = " + driver.manage().window().getPosition());

        //Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim.
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("sayfanin yeni size'i = " + driver.manage().window().getSize());
        System.out.println("sayfanin yeni konumu = " + driver.manage().window().getPosition());

        //ve istedigimiz sekilde oldugunu test edelim.
        Dimension actualYeniSize = driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("Size testi passed");
        }else {
            System.out.println("Size testi failed");
        }

        Point actualYeniKonum = driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum testi passed");
        }else {
            System.out.println("Konum testi failed");
        }

        //ve sayfayi kapatalim.
        driver.close();






    }
}
