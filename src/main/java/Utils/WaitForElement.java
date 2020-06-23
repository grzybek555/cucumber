package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WaitForElement {
    private WebDriver driver;
    public WaitForElement(WebDriver driver) {
        this.driver = driver;
    }

    public void waitFormElementToBeVisible(WebElement element, int timeInSeconds){

            WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
            wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitFormElementToBeClicable(WebElement element, int timeInSeconds){
            WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
            wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitFormAllElements(List<WebElement> elements, int timeInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));

    }
}
