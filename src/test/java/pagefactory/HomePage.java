
package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@data-action-type='DISMISS']")
	public WebElement dismiss;//used xpath
	@FindBy(xpath = "//a[text()=\"Today's Deals\"] | //a[@data-csa-c-content-id='nav_cs_gb']") 
	public WebElement todaysdeal;
	//used xpath with OR operator...

	
	public void dismiss() {
		try {
			dismiss.click();
		}catch(Exception e) {
			
		}
	}
	
	public void todaysDeal() {
		todaysdeal.click();
	}
	
	
	
}
