package PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitUsers {
	WebDriver driver;
	public RecruitUsers(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath="/html/body/div/div/div[3]/div/div[1]/div/a")
	WebElement addNewUser;
	
	@FindBy(xpath="/html/body/div/div/div[3]/div/div[3]/div/div[2]/div/table/tbody/tr[1]/td[8]/a")
	WebElement editUser;
	

	
	
	@FindBy(name="search")
	WebElement searchButton;
	
	@FindBy(id="keywords")
	WebElement searchBox;
	
	public void clickAddUser()
	{
		addNewUser.click();
	}
	
	public void clickEditUser()
	{
		editUser.click();
	}
	public void clickSearch(){
		searchButton.click();
	}
	public void enterUsername(String searchName){
		searchBox.clear();
		searchBox.sendKeys(searchName);
	}
	
	public void searchUsers(String searchName){
		enterUsername(searchName);
	
		
		searchButton.click();
	}
	
	


}
