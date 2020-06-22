import Utils.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFeatureTest extends TestBase{
    @Given("^I navigate to the allegro website$")
    public void iNavigateToTheAllegroWebsite() {
        setupDriver();
        openWebsite();

    }

    @When("^I search item by Iphone phrase$")
    public void iSearchItemByIphonePhrase() {
        System.out.println("szukanie iphone");
    }

    @And("^I sort the price from the highest$")
    public void iSortThePriceFromTheHighest() {
    }

    @And("^I set used filter$")
    public void iSetUsedFilter() {
    }

    @And("^I open first item from list$")
    public void iOpenFirstItemFromList() {
    }

    @Then("^Item page is open$")
    public void itemPageIsOpen() {
    }

    @And("^Item name i equal to item name from list$")
    public void itemNameIEqualToItemNameFromList() {
    }
}
