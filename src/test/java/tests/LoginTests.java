package tests;

import Sayfalar.AnaSayfa;
import Sayfalar.GirisYapSayfasi;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests {
   private WebDriver driver;
   private AnaSayfa anaSayfa;
   private GirisYapSayfasi girisYapSayfasi;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);

    }

    @Test
    void hepsiburadaLoginTesti()throws InterruptedException{
        driver.get("https://www.hepsiburada.com");

        anaSayfa.elementGozukeneKadarBekle(anaSayfa.hesabim);
        anaSayfa.tusaBas(anaSayfa.hesabim);
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.girisYap);
        anaSayfa.tusaBas(anaSayfa.girisYap);

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.cerezKabul);
        girisYapSayfasi.tusaBas(girisYapSayfasi.cerezKabul);
        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.emailAdresi);
        girisYapSayfasi.alanaYaziYaz(girisYapSayfasi.emailAdresi, "sercan.cataltepe.bites@gmail.com");
        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.password2);
        girisYapSayfasi.alanaSifreYaz(girisYapSayfasi.password2, "Bites396");
        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisYapTusu);
    }
    //@AfterEach
   // void tearDown(){
     //   driver.close();
   // }

}
