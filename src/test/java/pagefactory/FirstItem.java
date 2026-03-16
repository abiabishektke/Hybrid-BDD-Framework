
package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstItem {
	
	WebDriver driver;
	public FirstItem(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@data-test-index='0']/div[2]/div[1]") 
	WebElement firstitem;
	
	public void firstItem() {
		firstitem.click();
	}
	
}
