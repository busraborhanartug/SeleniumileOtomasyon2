package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa{
    public final String emailAdresi = "txtUserName";
    public final String girisYapTusu = "btnLogin";
    public final String password2 =  "txtPassword";
    public final String cerezKabul = "onetrust-accept-btn-handler";

    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
