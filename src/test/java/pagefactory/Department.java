
package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Department {
	
	WebDriver driver;
	public Department(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[text()='See more'])[1]") 
	public WebElement seemore; 

	
	@FindBy(xpath="//span[text()='Books']")
	public WebElement books;
	@FindBy(xpath="//span[text()='Computers & Accessories']")
	public WebElement computersAndAccessories;
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement electronics;
	@FindBy(xpath="//span[text()='Car & Motorbike']")
	public WebElement carAndMotorbike;
	
	public void seeMore() {
		seemore.click();
	}
	
	public void department(String str) {
		if(str.equalsIgnoreCase("books"))
			books.click();
		else if(str.equalsIgnoreCase("computers"))
			computersAndAccessories.click();
		else if(str.equalsIgnoreCase("electronics"))
			electronics.click();
		else if(str.equalsIgnoreCase("carandmotorbike"))
			carAndMotorbike.click();
		
	}
	
	
}
