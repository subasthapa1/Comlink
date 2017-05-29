package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddRecruiterCases {
	public WebDriver driver;
	
	public LoginPage objLogin;
  @BeforeTest
  public void setUp(){
	  System.setProperty("webdriver.chrome.driver", "D://SeleniumWebdriver//chromedriver.exe");

	  driver =new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://qa.codefirm.net/system/login");
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin","123admin@");
	  
  }
  @Test
  public void addRecruiter(){
	  
      AddRecruiter rctr2 = new AddRecruiter(driver);
      driver.get("http://qa.codefirm.net/system/agent/pages/recruiters/create");
      rctr2.setAllRequiredFields("a@gmail.com", "Test", "Man", "9873737373", "Kathmandu Nepal", "Kathmandu", "7867");
  }
	  
  }
  

