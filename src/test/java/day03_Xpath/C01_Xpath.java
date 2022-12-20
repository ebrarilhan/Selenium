package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        Thread.sleep(3000);
//        WebElement addButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        WebElement addButonuT = driver.findElement(By.xpath("//*[text()='Add Element']"));
        //                  <button onclick="addElement()">Add Element</button>
        // xpath kullaniminda locate edecegimiz webelement texte sahipse yukardaki sekilde kullanabiliriz.
        addButonuT.click();

        //3 Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()){ //bir web elementin gorunur olup olmadigini isDisplayed() methodu
            //ile bakariz.
            System.out.println("Test passed");
        }else System.out.println("Test failed");

        //4 Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();

        //5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin.
        WebElement addRomoveElYazisi = driver.findElement(By.xpath("//h3"));
        if (addRomoveElYazisi.isDisplayed()){
            System.out.println("Test passed");
        }else System.out.println("Test failed\"");



        driver.close();



    }
}
