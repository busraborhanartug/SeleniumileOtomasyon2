package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {

    WebDriver driver;
    private String tusId;

    public Sayfa(WebDriver driver){
        this.driver = driver;
    }
    public void elementGozukeneKadarBekle(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));

    }

    public void tusaBas(String tusId){
        driver.findElement(By.id(tusId)).click();
        this.tusId = tusId;
    }
    public void alanaYaziYaz(String elementId, String emailAdresi){
        driver.findElement(By.id(elementId)).sendKeys(emailAdresi);
    }

    public void alanaSifreYaz(String elementId, String password2){
        driver.findElement(By.id(elementId)).sendKeys(password2);
    }
}
