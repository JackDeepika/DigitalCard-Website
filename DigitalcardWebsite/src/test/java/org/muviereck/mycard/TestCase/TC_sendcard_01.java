package org.muviereck.mycard.TestCase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyCard;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_sendcard_01 extends BaseClass{
//	@Test(priority=0)
//	public void sendcard() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyCard cc = new MyCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickchscard();
//		Thread.sleep(6000);
//		cc.clickfb();
//		
//	}
//	@Test(priority=1)
//	public void sendcardtwit() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyCard cc = new MyCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickchscard();
//		Thread.sleep(6000);
//		cc.clicktwitter();
//	}
//	@Test(priority=2)
//	public void sendcardlinked() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyCard cc = new MyCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickchscard();
//		Thread.sleep(6000);
//		cc.clicklinke();
//	}
//	@Test(priority=3)
//	public void sendcardtele() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyCard cc = new MyCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickchscard();
//		Thread.sleep(6000);
//		cc.clciktelegram();
//	}
//	@Test(priority=4)
//	public void sendcardtwp() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyCard cc = new MyCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickchscard();
//		Thread.sleep(6000);
//		cc.clickwhat();
//	}
//	@Test(priority=5)
//	public void sendcardtlink() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyCard cc = new MyCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickchscard();
//		Thread.sleep(6000);
//		cc.clickcopylink();
//		Thread.sleep(3000);
//		cc.clickdownqr();
//		Thread.sleep(3000);
//		cc.clickclientpre();
//		Thread.sleep(3000);
//		cc.clickprephnnumber();
//		
//	}
	@Test(priority=6)
	public void sendcardtemail() throws InterruptedException
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
		Thread.sleep(3000);
		cc.clickcopylink();
		cc.clickclientpre();
		Thread.sleep(3000);
		cc.clickpremail();
	}
	@Test(priority=7)
	public void sendcardweb() throws InterruptedException
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
		Thread.sleep(3000);
		cc.clickcopylink();
		cc.clickclientpre();
		Thread.sleep(3000);
		cc.clickpremail();
		cc.clickpreweb();
	}
		

}
