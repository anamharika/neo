package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pim {
	@FindBy(xpath = "(//*[@class='oxd-main-menu-item'])[2]")private WebElement clickbtn;
	@FindBy(xpath = "(//*[@class='oxd-topbar-body-nav-tab'])[1]")private WebElement empbtn;
	@FindBy(xpath = "//*[@name='firstName']")private WebElement fstnametext;
	@FindBy(xpath = "//input[@name='lastName']")private WebElement lastnametext;
	@FindBy(xpath = "//button[@type='submit']")private WebElement savebtn;
	
	public pim(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getClickbtn() {
		return clickbtn;
	}
	public WebElement getEmpbtn() {
		return empbtn;
	}
	public WebElement getFstnametext() {
		return fstnametext;
	}
	public WebElement getLastnametext() {
		return lastnametext;
	}
	public void pimorg(String fn,String ln) {
		clickbtn.click();
		empbtn.click();
		fstnametext.sendKeys(fn);
		lastnametext.sendKeys(ln);
		savebtn.click();
		
		
	}

}
