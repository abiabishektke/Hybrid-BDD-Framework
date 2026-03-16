package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import hooks.Hooks;
import io.cucumber.java.en.*;

import pagefactory.*;

public class StepDefinitions {

    WebDriver driver;
    HomePage home;
    Department dept;
    FirstItem item;
    Add2Cart cart;
    SuccessMessage smsg;

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {

        driver = Hooks.getDriver();  // Get driver AFTER @Before runs
        home = new HomePage(driver);
    }

    @When("User handles initial popup if present")
    public void user_handles_initial_popup_if_present() {
        home.dismiss();
    }

    @When("User clicks on Today's Deals")
    public void user_clicks_on_today_s_deals() {
        home.todaysDeal();
        dept = new Department(driver);
    }

    @When("User clicks on See More")
    public void user_clicks_on_see_more() {
        dept.seeMore();
    }

    @When("User selects {string} department")
    public void user_selects_department(String string) {
        dept.department(string);
        item = new FirstItem(driver);
    }

    @When("User selects the first product")
    public void user_selects_the_first_product() {
        item.firstItem();
        cart = new Add2Cart(driver);
    }

    @When("User clicks on Add to Cart button")
    public void user_clicks_on_add_to_cart_button() {
        cart.add2cart();
        smsg = new SuccessMessage(driver);
    }

    @Then("Product should be added successfully to cart")
    public void product_should_be_added_successfully_to_cart() {

        SoftAssert softAssert = new SoftAssert();

        String actualMessage = smsg.successMessage();

        softAssert.assertTrue(
            actualMessage.contains("Added to Cart"),
            "Product was not added to cart successfully"
        );

        softAssert.assertAll();
    }
}