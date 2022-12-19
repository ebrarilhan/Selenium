package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim.
        driver.navigate().to("https://amazon.com");

        //techpro sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com"); //driver.get ile de ayni sonuclari aliriz ancak drivergette sayfanin yuklenmesini
        //bekliyor navigate oldugunda beklemiyor.

        //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back(); //amazon sayfasina geri doner

        //Tekrar techpro sayfasına gidelim.
        Thread.sleep(3000);
        driver.navigate().forward(); //techproya gider.

        //Son sayfada sayfayı yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayı kapatalım
        driver.close();

    }
}
