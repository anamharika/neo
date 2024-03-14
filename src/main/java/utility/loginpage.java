package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(xpath = "//input[@name='username']")private WebElement untext;
	@FindBy(xpath = "//*[@name='password']")private WebElement pwdtext;
	@FindBy(xpath = "//*[@type='submit']")private WebElement loginbtn;
public loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public WebElement getUntext() {
	return untext;
}
public WebElement getPwdtext() {
	return pwdtext;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
public void logintoapp(String un, String pwd ) {
	untext.sendKeys(un);
	pwdtext.sendKeys(pwd);
	loginbtn.click();
}
}
