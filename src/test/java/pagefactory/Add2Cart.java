
package pagefactory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BrowserUtil;

public class Add2Cart {

    WebDriver driver;
    WebDriverWait wait;

    public Add2Cart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void add2cart() {

        List<WebElement> buttons = driver.findElements(By.id("add-to-cart-button"));

        for (WebElement btn : buttons) {

            if (btn.isDisplayed() && btn.isEnabled()) {

                BrowserUtil.scrollToElement(driver, btn);

                btn.click();
                return;
            }
        }

        throw new RuntimeException("No visible Add to Cart button found.");
    }
}