package PageObjects;

import Utils.ItemModel;
import Utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchingResultPage extends PageBase {

    @FindBy(xpath = "//select[@data-value='m']")
    private WebElement sortingSelect;

    @FindBy(xpath = "//span[contains(text(), 'używane')]")
    private WebElement usedFilter;



    private By searchedItemsLocator =  By.xpath("//h2[contains(text(), 'Oferty promowane')]/following-sibling::section//article");


    public SearchingResultPage(WebDriver driver) {
        super(driver);
    }

    public void sortItemsBy(String sortingType){
        chooseFromSelectByVisibleText(sortingSelect, sortingType);
    }

    public List<WebElement> getSearchedItems(){
        waitForElement.waitFormAllElements(driver.findElements(searchedItemsLocator), SHORT_WAIT_TIME);
        return driver.findElements(searchedItemsLocator);
    }

    public void checkFilter(String filterValue){
        clickElement(driver.findElement(By.xpath("//span[contains(text(), '"+filterValue+"')]")));
    }

    public ItemModel getFirstItem(){
        return new ItemModel(getSearchedItems().get(0).findElement(By.tagName("h2")).getText());
    }

    public void openItem(int itemNumber){
        clickElement(getSearchedItems().get(itemNumber-1));
    }


}
