import org.example.AruodasAd;
import org.example.Purpose;
import org.example.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class AruodasTests {

    @Test
    public void makeAdPositiveTest(){
        AruodasAd ad = new AruodasAd("Klaipėda","+37063500879","20","60000", new String[]{Purpose.miskuUkio,Purpose.namuValda});
        ad.fillAd();
    }

    @BeforeClass
    public void beforeClass(){
        Utils.driver = new ChromeDriver();
        Utils.driver.manage().window().maximize();
        Utils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Utils.wait = new WebDriverWait(Utils.driver, Duration.ofSeconds(5));
        Utils.acceptCookies();
        Utils.login();
    }

    @AfterClass
    public void afterClass(){
        // driver.quit();
    }
}
