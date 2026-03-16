package hooks;

import static com.assertthat.selenium_shutterbug.core.Capture.FULL_SCROLL;

import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BrowserUtil;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp() throws Exception {
        BrowserUtil browser = new BrowserUtil();
        driver = browser.openBrowser();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed() && driver != null) {

            String fileName = scenario.getName().replaceAll(" ", "_");

            Shutterbug.shootPage(driver, FULL_SCROLL)
                      .save("ExtentReports/Screenshots/" + fileName + ".png");
        }

        if (driver != null) {
            driver.quit();
        }
    }
}