package Utils;

import org.openqa.selenium.WebDriver;

public class PageBase {
    protected WebDriver driver;
    protected WaitForElement waitForElement;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        waitForElement = new WaitForElement(driver);
    }
}
