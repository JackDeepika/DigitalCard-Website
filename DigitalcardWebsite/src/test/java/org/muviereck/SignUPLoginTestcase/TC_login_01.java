package org.muviereck.SignUPLoginTestcase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.SignUpLogin;
import org.testng.annotations.Test;

public class TC_login_01 extends BaseClass {
	@Test(priority=0)
	public void logintest() throws InterruptedException
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		Thread.sleep(2000);
		sp.clickloginnumber();
		sp.clickpsweye();
		sp.clickloginpwd();
		//Thread.sleep(2000);
		sp.clicklogin1();
				
	}
	@Test(priority=1)
	public void logintestword()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clickloginnumword();
		sp.clickloginpwd();
	    sp.clicklogin1();
				
	}
	@Test(priority=2)
	public void logintestzero()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clickloginnumzero();
		sp.clickloginpwd();
		sp.clicklogin1();
				
	}
	@Test(priority=3)
	public void logintestspcl()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clickloginspcl();
		sp.clickloginpwd();
		sp.clicklogin1();
				
	}
	@Test(priority=4)
	public void logintestinvalid()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clicklogininvalid();
		sp.clickloginpwd();
		sp.clicklogin1();
				
	}
	@Test(priority=5)
	public void logintestneg()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clicklogininvalid();
		sp.clickloginpwdwrong();
		sp.clicklogin1();
				
	}
	@Test(priority=6)
	public void logintestpwdwrg()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clickloginnumber();
		sp.clickloginpwdwrong();
		sp.clicklogin1();
				
	}
	@Test(priority=6)
	public void logintestforget()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clickloginnumber();
		sp.clickloginpwdwrong();
		sp.clicklogin1();
		sp.clickforget();
		sp.clickforgetphn();
		sp.clickforgetemail();
		sp.clicksubmit();
				
	}
	@Test(priority=7)
	public void logintestforgetword()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clickloginnumber();
		sp.clickloginpwdwrong();
		sp.clicklogin1();
		sp.clickforget();
		sp.clickforgetphnword();
		sp.clickforgetemail();
		sp.clicksubmit();
				
	}
	@Test(priority=8)
	public void logintestforgetspcl()
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clickloginnumber();
		sp.clickloginpwdwrong();
		sp.clicklogin1();
		sp.clickforget();
		sp.clickforgetphnspcl();
		sp.clickforgetemail();
		sp.clicksubmit();
				
	}
	@Test(priority=9)
	public void logintestforgetext() throws InterruptedException
	{
		driver.get(baseurl);
		SignUpLogin sp = new SignUpLogin(driver);
		sp.clicklogin();
		sp.clickloginnumber();
		sp.clickloginpwdwrong();
		sp.clicklogin1();
		Thread.sleep(2000);
		sp.clickforget();
		sp.clickforgetphnext();
		sp.clickforgetemail();
		Thread.sleep(2000);
		sp.clicksubmit();
				
	}
	
	

}
