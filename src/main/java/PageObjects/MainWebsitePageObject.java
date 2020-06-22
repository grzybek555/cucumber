package PageObjects;

import Utils.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainWebsitePageObject extends PageBase {
    @FindBy(xpath = "//form/input")
    private WebElement searchInput;

    @FindBy(xpath = "//form/button")
    private WebElement searchButton;


    public MainWebsitePageObject(WebDriver driver) {
        super(driver);
    }
}
