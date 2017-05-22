package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	WebDriver driver;
	public Dashboard(WebDriver driver){
		driver=this.driver;
	}
	public void openLink(String linkname){
		WebElement element= driver.findElement(By.linkText(linkname));
		element.click();
		
	}

}
