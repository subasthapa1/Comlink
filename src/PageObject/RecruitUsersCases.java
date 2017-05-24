package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class RecruitUsersCases {
	WebDriver driver;
	public LoginPage lgpg =new LoginPage(driver);
	public RecruitUsers rcrtUsr=new RecruitUsers(driver);
	public AddRecruiter rctr1= new AddRecruiter(driver);
	//public Dashboard dshbrd=new Dashboard(driver);
	@BeforeTest
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "D:/SeleniumWebdriver/chromedriver.exe");

		  driver =new ChromeDriver();
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://qa.codefirm.net/system/login");
		LoginPage lgpg =new LoginPage(driver);
		lgpg.loginToComlink("admin", "123admin@");
		//dshbrd.openLink("Recruiter Users");
		driver.navigate().to("http://qa.codefirm.net/system/agent/pages/recruiters");
		driver.navigate().to("http://qa.codefirm.net/system/news/pages/news/create");
		rctr1.setAllRequiredFields("a@gmail.com","Test","Man","9873737373","Kathmandu Nepal","Kathmandu","7867");
		//rcrtUsr.clickAddUser();
	  }
	/*@Test
	public void login()
	{
		lgpg.loginToComlink("admin", "123admin@");
		rcrtUsr.clickAddUser();
		
	}*/
	
}
