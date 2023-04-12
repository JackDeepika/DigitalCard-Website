package org.muviereck.pageObjects;

import org.muviereck.TestCase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLogin extends BaseClass{
	WebDriver ldriver;
	public SignUpLogin(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="signup-toggle")
	WebElement signup;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[3]/div/div[1]/input")
	WebElement name;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\'iti-1__item-us\']")
	WebElement us;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/input")
	WebElement number;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/div[2]/div[3]/div/div[4]/input")
	WebElement email;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[3]/div/div[5]/input")
	WebElement password;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[3]/div/div[6]/input")
	WebElement conpwd;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[3]/div/div[7]/button")
	WebElement otp;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/div[2]/div[3]/div/div[7]/input")
	WebElement otpenter;
	
	@FindBy(xpath="//*[@id=\'login-toggle\']")
	WebElement login;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[1]/div/input")
	WebElement loginnumber;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[1]/div/div/div/div[2]")
	WebElement logincountry;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[1]/div/div/ul/li[233]")
	WebElement loginus;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[3]/img")
	WebElement psweye;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[3]/input")
	WebElement loginpwd;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[5]/button")
	WebElement loginok;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[4]/a")
	WebElement forget;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div/div[1]/div/input")
	WebElement forgetphn;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div/div[3]/input")
	WebElement forgetemail;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div/div[4]/button")
	WebElement submit;
	
	public void clicksiginup()
	{
		signup.click();
	}
	public void clickname()
	{
		name.sendKeys("jack");
	}
	public void clicknamechr()
	{
		name.sendKeys("j");
	}
	public void clicknamenum()
	{
		name.sendKeys("1234");
	}
	public void clicknamespc()
	{
		name.sendKeys("/.;'[]=-");
	}
	public void clicknamealp()
	{
		name.sendKeys("jack29");
	}
	public void clickcountry()
	{
		country.click();
	}
	public void clickus()
	{
		us.click();
	}
	public void clicknumber()
	{
		number.sendKeys("202-555-0666");
	}
	public void clickindianum()
	{
		number.sendKeys("7305884112");
	}
	public void clickindianum1()
	{
		number.sendKeys("730588411222");
	}
	public void clickindiaword()
	{
		number.sendKeys("lkjui");
	}
	public void clickindiazero()
	{
		number.sendKeys("0000000000");
	}
	public void clickindiaspc()
	{
		number.sendKeys(",./';[]=-\'");
	}
	public  void clickemail(String mail)
	{
		email.click();
		email.sendKeys(mail);
		//return email1;
	}
	public void clickemailnum()
	{
		email.sendKeys("123654@gmail.com");
	}
	public void emailspcl()
	{
		email.sendKeys(";'./,@gmail.com");
	}
	
	public void clickpwd()
	{
		password.sendKeys("muviereck");
	}
	public void clickconpwd()
	{
		conpwd.sendKeys("muviereck");
	}
	public void clickwrongcon()
	{
		conpwd.sendKeys("123654");
	}
	public void clickotp()
	{
		otp.click();
	}
	public void clickotpenter()
	{
		otpenter.sendKeys("1236547");
	}
	public void clicklogin()
	{
		login.click();
	}
	public void clickloginnumber()
	{
		loginnumber.sendKeys("9962019188");
	}
	public void clickloginusnumber()
	{
		loginnumber.sendKeys("202-555-0666");
	}
	public void clickloginnumword()
	{
		loginnumber.sendKeys("sdfret");
	}
	public void clickloginspcl()
	{
		loginnumber.sendKeys(";'[]=-/.,;'");
	}
	public void clickloginnumzero()
	{
		loginnumber.sendKeys("0000000000");
	}
	public void clicklogininvalid()
	{
		loginnumber.sendKeys("7305884112");
	}
	public void clicklogincountry()
	{
		logincountry.click();
	}
	public void clickloginus()
	{
		loginus.click();
	}
	public void clickpsweye()
	{
		psweye.click();
	}
	public void clickloginpwd()
	{
		loginpwd.sendKeys("dd@29");
	}
	public void clickloginpwdwrong()
	{
		loginpwd.sendKeys("hdyd12364';[");
	}
	public void clicklogin1()
	{
		loginok.click();
	}
	public void clickforget()
	{
		forget.click();
	}
	public void clickforgetphn()
	{
		forgetphn.sendKeys("9962019188");
	}
	public void clickforgetphnext()
	{
		forgetphn.sendKeys("996201918869");
	}
	public void clickforgetphnword()
	{
		forgetphn.sendKeys("loikj");
	}
	public void clickforgetphnspcl()
	{
		forgetphn.sendKeys(";'[]=-/';");
	}
	public void clickforgetemail()
	{
		forgetemail.sendKeys("deepika@muvierecktech.com");
	}
	public void clickforgetemailnum()
	{
		forgetemail.sendKeys("123644@gmail.com");
	}
	public void clickforgetemailspcl()
	{
		forgetemail.sendKeys(",.;'@gmail.com");
	}
	public void clicksubmit()
	{
		submit.click();
	}

}
