import PageObjects.MainWebsitePageObject;
import PageObjects.SearchingResultPage;
import Utils.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFeatureTest extends TestBase{
    MainWebsitePageObject websitePageObject;
    SearchingResultPage searchingResultPage;
    String itemName;

    @Given("^I navigate to the allegro website$")
    public void iNavigateToTheAllegroWebsite() {
        setupDriver();
        openWebsite();

        websitePageObject = new MainWebsitePageObject(driver);
        websitePageObject.closePopUp();


    }

    @When("^I search item by Iphone phrase$")
    public void iSearchItemByIphonePhrase() {
        websitePageObject.findItem("Iphone");
    }

    @And("^I sort the price from the highest$")
    public void iSortThePriceFromTheHighest() {
        searchingResultPage = new SearchingResultPage(driver);
        searchingResultPage.sortItemsBy(" cena: od najwyższej ");
    }

    @And("^I set used filter$")
    public void iSetUsedFilter() {
        searchingResultPage.checkFilter("używane");
    }

    @And("^I open first item from list$")
    public void iOpenFirstItemFromList() {
        searchingResultPage.openItem(1);
    }

    @Then("^Item page is open$")
    public void itemPageIsOpen() {
    }

    @And("^Item name i equal to item name from list$")
    public void itemNameIEqualToItemNameFromList() {

        tearDown();
    }
}
