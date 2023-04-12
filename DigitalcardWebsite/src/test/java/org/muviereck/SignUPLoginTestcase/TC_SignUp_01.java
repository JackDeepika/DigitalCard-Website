package org.muviereck.SignUPLoginTestcase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.SignUpLogin;
import org.testng.annotations.Test;

public class TC_SignUp_01 extends BaseClass {
//	@Test(priority=0)
//	public void signuptest() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clickname();
//		Thread.sleep(3000);
//		sp.clickindianum();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//	}
//	@Test(priority=1)
//	public void signuptestnum() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clicknamenum();
//		Thread.sleep(3000);
//		sp.clickindianum();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//		Thread.sleep(3000);
//	}
//	@Test(priority=2)
//	public void signuptestspcl() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clicknamespc();
//		Thread.sleep(3000);
//		sp.clickindianum();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//		Thread.sleep(3000);
//	}
//	@Test(priority=3)
//	public void signuptestalp() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clicknamealp();
//		Thread.sleep(3000);
//		sp.clickindianum();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//		Thread.sleep(3000);
//	}
//	@Test(priority=4)
//	public void signuptestchr() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clicknamechr();
//		Thread.sleep(3000);
//		sp.clickindianum();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//		Thread.sleep(3000);
//	}
//	@Test(priority=5)
//	public void signuptestphnzero() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clickname();
//		Thread.sleep(3000);
//		sp.clickindiazero();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//		Thread.sleep(3000);
//	}
//	@Test(priority=6)
//	public void signuptestphn1() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clickname();
//		Thread.sleep(3000);
//		sp.clickindianum1();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//		Thread.sleep(3000);
//	}
//	@Test(priority=7)
//	public void signuptestphnword() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clickname();
//		Thread.sleep(3000);
//		sp.clickindiaword();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//		Thread.sleep(3000);
//	}
//	@Test(priority=8)
//	public void signuptestphnspcl() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clickname();
//		Thread.sleep(3000);
//		sp.clickindiaspc();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickconpwd();
//		Thread.sleep(3000);
//		sp.clickotp();
//		Thread.sleep(3000);
//	}
//	@Test(priority=9)
//	public void signuptestconpsw() throws InterruptedException
//	{
//		driver.get(baseurl);
//		sp=new SignUpLogin(driver);
//		String email1 = randomestring()+"@gmail.com";
//		Thread.sleep(3000);
//		sp.clicksiginup();
//		Thread.sleep(3000);
//		sp.clickname();
//		Thread.sleep(3000);
//		sp.clickindianum();
//		Thread.sleep(3000);
//		sp.clickemail(email1);
//		sp.clickpwd();
//		sp.clickwrongcon();
//		Thread.sleep(3000);
//		sp.clickotp();
//	}
	@Test(priority=10)
	public void signuptestemail() throws InterruptedException
	{
		driver.get(baseurl);
		sp=new SignUpLogin(driver);
		String email1 = randomestring()+"@gmail.com";
		Thread.sleep(3000);
		sp.clicksiginup();
		Thread.sleep(3000);
		sp.clickname();
		Thread.sleep(3000);
		sp.clickindianum();
		Thread.sleep(3000);
		sp.clickemailnum();
        sp.clickpwd();
		sp.clickwrongcon();
		Thread.sleep(3000);
		sp.clickotp();
		Thread.sleep(3000);
	}
	@Test(priority=11)
	public void signuptestemailspcl() throws InterruptedException
	{
		driver.get(baseurl);
		sp=new SignUpLogin(driver);
		String email1 = randomestring()+"@gmail.com";
		Thread.sleep(3000);
		sp.clicksiginup();
		Thread.sleep(3000);
		sp.clickname();
		Thread.sleep(3000);
		sp.clickindianum();
		Thread.sleep(3000);
		sp.emailspcl();
        sp.clickpwd();
		sp.clickwrongcon();
		Thread.sleep(3000);
		sp.clickotp();
		Thread.sleep(3000);
	}
	@Test(priority=12)
	public void signuptestotpneg() throws InterruptedException
	{
		driver.get(baseurl);
		sp=new SignUpLogin(driver);
		String email1 = randomestring()+"@gmail.com";
		Thread.sleep(3000);
		sp.clicksiginup();
		Thread.sleep(3000);
		sp.clickname();
		Thread.sleep(3000);
		sp.clickindianum();
		Thread.sleep(3000);
		sp.clickemail(email1);
		sp.clickpwd();
		sp.clickconpwd();
		Thread.sleep(3000);
		sp.clickotp();
		Thread.sleep(3000);
		sp.clickotpenter();
	}
	
	

}
