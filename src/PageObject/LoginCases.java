package PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginCases {
	public WebDriver driver;
	LoginPage objLogin;

	
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "D:/SeleniumWebdriver/chromedriver.exe");

	  driver =new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://qa.codefirm.net/system/login");
  }
  @Test
  public void blankLogin(){
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink(" "," ");
	  
  }
  @Test
  public void invalidUsername(){
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin1","123admin@");
	  
  }
  @Test
  public void invalidPassword(){
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin","123admin");
	  
  }
  @Test
  public void invalidUsernameAndPAssword(){
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin12","123admin@1");
	  
  }
  @Test
  public void validUsernameAndPAssword(){
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin","123admin@");
	  
  }
}
