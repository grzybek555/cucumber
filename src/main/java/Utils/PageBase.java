package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    protected WebDriver driver;
    protected WaitForElement waitForElement;

    protected static final int SHORT_WAIT_TIME = 10;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        waitForElement = new WaitForElement(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickElement(WebElement element){
        waitForElement.waitFormElementToBeClicable(element, SHORT_WAIT_TIME);
        element.click();
    }

    public void sendKeys(WebElement element, String text){
        waitForElement.waitFormElementToBeVisible(element, SHORT_WAIT_TIME);
        waitForElement.waitFormElementToBeClicable(element, SHORT_WAIT_TIME);
        element.sendKeys(text);
    }

    public void chooseFromSelectByVisibleText(WebElement selectElement, String value){
        waitForElement.waitFormElementToBeVisible(selectElement, SHORT_WAIT_TIME);
        Select select = new Select(selectElement);
        select.selectByVisibleText(value);
    }
}
