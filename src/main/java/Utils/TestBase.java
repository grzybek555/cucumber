package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    protected WebDriver driver;
    private static final String webUrl = "https://allegro.pl/";
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
    }

    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    protected void openWebsite(){
        driver.get(webUrl);
    }



}
