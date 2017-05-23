package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRecruiter {
	WebDriver driver;
	public AddRecruiter(WebDriver driver){
		driver=this.driver;
	}
	@FindBy(id="enterEmail")
	WebElement emailField;
	
	@FindBy(id="first_name")
	WebElement firstNameField;
	
	@FindBy(id="middle_name")
	WebElement middleNameField;
	
	@FindBy(id="last_name")
	WebElement lastNameField;
	
	@FindBy(id="phone")
	WebElement phoneField;
	
	@FindBy(name="addr_line1")
	WebElement addressLineField1;
	
	@FindBy(name="addr_line2")
	WebElement addressLineField2;
	
	@FindBy(name="city")
	WebElement cityField;
	
	@FindBy(id="zip_code")
	WebElement zipCodeField;
	
	@FindBy(id="tax_id")
	WebElement taxIdField;
	
	@FindBy(id="bank_name")
	WebElement bankNameField;
	
	@FindBy(id="routing_number")
	WebElement routingNumberField;
	
	@FindBy(id="account_number")
	WebElement accountNumberField;
	
	
	@FindBy(id="profile_pic")
	WebElement profilePicField;
	
	
	
   public void setEmailField(String email ){
	   emailField.sendKeys(email);
	   }
    
   public void setFirstNameField(String firstName){
	   firstNameField.sendKeys(firstName);
        }

   public void setMiddleNameField(String middleName ){
	   middleNameField.sendKeys(middleName);
       }

   public void setLastNameField(String lastName){
	   lastNameField.sendKeys(lastName);
     }

   public void setPhoneField(String phone){
	  phoneField.sendKeys(phone);
      }

   public void setAddress1Field(String address1 ){
	addressLineField1.sendKeys(address1);
       }

   public void setAddress2Field(String address2){
	addressLineField2.sendKeys(address2);
      }

   public void setCityField(String city){
	   cityField.sendKeys(city);
       }

   public void setZipCodeField(String zipCode){
	   zipCodeField.sendKeys(zipCode);
      }

   public void setTaxIdField(String taxId){
	taxIdField.sendKeys(taxId);
      }

   public void setBankNameField(String bankName){
	   bankNameField.sendKeys(bankName);
     }

public void setRoutingNumberField(String routingNumber){
	routingNumberField.sendKeys(routingNumber);
}

public void setAccountNumberField(String accountNumber){
	accountNumberField.sendKeys(accountNumber);
}

public void setProfileImageField(String profileImage){
	profilePicField.sendKeys(profileImage);
}
public void setAllRequiredFields(String email,String firstName, String lastName, String phone, String address1, String city, String zipCode){
	setEmailField(email);
	setFirstNameField(firstName);
	setLastNameField(lastName);
	setPhoneField(phone);
	setAddress1Field(address1);
	setCityField(city);
	setZipCodeField(zipCode);
	WebElement el1=driver.findElement(By.cssSelector("#page-content > div.panel > div > form > div:nth-child(22) > div > div > button"));
	el1.click();
}
}
