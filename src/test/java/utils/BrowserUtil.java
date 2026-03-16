
package utils;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	WebDriver driver;
	Properties prop;
    public  WebDriver openBrowser() throws Exception {

        prop = new Properties();
        FileInputStream fis =
                new FileInputStream("src/test/java/config/config.properties");
        prop.load(fis);

        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        
        driver.get(url);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
       
        return driver;
    }

    public  void closeBrowser() {
        
            driver.quit();
        
    }
    
    public static void scrollToElement(WebDriver driver,WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
    }
}
