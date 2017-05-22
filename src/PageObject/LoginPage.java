package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(name="username")
	WebElement userNameComlink;
	
	@FindBy(name="password")
	WebElement passwordComlink;
	
	@FindBy(xpath="/html/body/div/div/div/form/div/div/button")
	WebElement loginBtnComlink;
	
	
	public void setUsername(String user){
		userNameComlink.clear();
		userNameComlink.sendKeys(user);
	}
	
	public void setPassword(String passwd){
		passwordComlink.clear();
		passwordComlink.sendKeys(passwd);
	}
 public void clickLogin(){
	 loginBtnComlink.click();
 }
 
 public void loginToComlink(String user, String passwd){
	 this.setUsername(user);
	 this.setPassword(passwd);
	 this.clickLogin();
 }
}
