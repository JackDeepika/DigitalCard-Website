package org.muviereck.mycard.TestCase;

import java.util.concurrent.TimeUnit;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyCard;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Design_01 extends BaseClass{
	@Test(priority=0)
	public void designtest() throws InterruptedException
	{
		driver.get(baseurl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyCard cc = new MyCard(driver);
		cc.clickloginnumber();
		Thread.sleep(2000);
		cc.clickloginpwd();
		Thread.sleep(2000);
		cc.clicklogin1();
		Thread.sleep(2000);
		cc.clickchscard();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		cc.clickdesign();
		cc.clickchsdesign();
		Thread.sleep(5000);
		cc.clickdesigncancel();
		Thread.sleep(1000);
	}
	@Test(priority=1)
	public void designtestok() throws InterruptedException
	{
		driver.get(baseurl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyCard cc = new MyCard(driver);
		cc.clickloginnumber();
		cc.clickloginpwd();
		Thread.sleep(2000);
		cc.clicklogin1();
		Thread.sleep(2000);
		cc.clickchscard();
		cc.clickdesign();
		cc.clickchsdesign();
		Thread.sleep(5000);
		cc.clickdesignok();
	    Thread.sleep(1000);
	}
	@Test(priority=2)
	public void designtestback() throws InterruptedException
	{
		driver.get(baseurl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyCard cc = new MyCard(driver);
		cc.clickloginnumber();
		cc.clickloginpwd();
		Thread.sleep(2000);
		cc.clicklogin1();
		Thread.sleep(2000);
		cc.clickchscard();
		cc.clickdesign();
		cc.clickdesignback();
		
	}

}
