package org.muviereck.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile {
	
	 WebDriver ldriver;
		
		public MyProfile(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[1]/div/input")
		WebElement loginnumber;
		
	    @FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[3]/input")
		WebElement loginpwd;
		
		@FindBy(xpath="/html/body/div[1]/div/section/div/div/div/div/div/div[2]/div[2]/div[5]/button")
		WebElement loginok;
		
		@FindBy(xpath="/html/body/div[1]/div[3]/ul[1]/li[1]/a")
		WebElement profile;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/input")
		WebElement fname;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/input")
		WebElement lname;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/input")
		WebElement email;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[4]/input")
		WebElement phn;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[5]/input")
		WebElement address;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[6]/div/div[1]/input")
		WebElement state;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[6]/div/div[2]/input")
		WebElement city;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[7]/div/div[1]/input")
		WebElement pincode;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[7]/div/div[2]/input")
		WebElement country;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[8]/input")
		WebElement password;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[9]/button")
		WebElement save;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div[1]/a")
		WebElement back;
		
		
		public void clickloginnumber()
		{
			loginnumber.sendKeys("9962019188");
		}
		public void clickloginpwd()
		{
			loginpwd.sendKeys("dd@29");
		}
		public void clicklogin1()
		{
			loginok.click();
		}
		public void clickprofile()
		{
			profile.click();
		}
		public void clickfname(String name)
		{
			fname.clear();
			fname.sendKeys(name);
		}
		public void clicklname(String name)
		{
			lname.clear();
			lname.sendKeys(name);
		}
		public void clickemail(String mail)
		{
			email.clear();
			email.sendKeys(mail);
		}
		public void clickphn(String number)
		{
			phn.clear();
			phn.sendKeys(number);
		}
		public void clickaddress(String address1)
		{
			address.clear();
			address.sendKeys(address1);
		}
		public void clickstate(String sts)
		{
			state.clear();
			state.sendKeys(sts);
		}
		public void clickcity(String City)
		{
			city.clear();
			city.sendKeys(City);
		}
		public void clickpincode(String pin)
		{
			pincode.clear();
			pincode.sendKeys(pin);
		}
		public void clickcountry(String coun)
		{
			country.clear();
			country.sendKeys(coun);
		}
		public void clickpassword(String psw)
		{
			password.clear();
			password.sendKeys(psw);
		}
		public void clicksave()
		{
			save.click();
		}
		public void clickback()
		{
			back.click();
		}
		


}
