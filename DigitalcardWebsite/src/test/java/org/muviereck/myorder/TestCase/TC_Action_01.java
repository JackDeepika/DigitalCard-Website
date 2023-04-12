package org.muviereck.myorder.TestCase;

import java.io.File;
import java.io.IOException;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyOrder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TC_Action_01 extends BaseClass{
	@Test(priority=0)
	public void actiontest() throws InterruptedException, IOException
	{
		driver.get(baseurl);
		MyOrder od = new MyOrder(driver);
		od.clickloginnumber();
		od.clickloginpwd();
		od.clicklogin1();
		Thread.sleep(2000);
		od.clickmyorder();
		Thread.sleep(2000);
		od.clickeye();
		Thread.sleep(9000);
		od.clicksavetocontant();
		Thread.sleep(2000);
		TakesScreenshot sc2=(TakesScreenshot) driver;
		File source2=sc2.getScreenshotAs(OutputType.FILE);
		File store2=new File(".\\Screenshot\\MYOrderAction.png");
		FileHandler.copy(source2, store2);
		Thread.sleep(1000);
		od.clickshowqr();
		od.clickpaymentinfo();
	}
	@Test(priority=1)
	public void actiontestecom() throws InterruptedException, IOException
	{
		driver.get(baseurl);
		MyOrder od = new MyOrder(driver);
		od.clickloginnumber();
		od.clickloginpwd();
		od.clicklogin1();
		Thread.sleep(2000);
		od.clickmyorder();
		Thread.sleep(2000);
		od.clickeye();
		Thread.sleep(9000);
		od.clickfb();
		od.clicktwit();
		od.clicklinked();
		od.clickwhatsapp();
		od.clicktelegram();
	}
	@Test(priority=2)
	public void actiontestnumber() throws InterruptedException, IOException
	{
		driver.get(baseurl);
		MyOrder od = new MyOrder(driver);
		od.clickloginnumber();
		od.clickloginpwd();
		od.clicklogin1();
		Thread.sleep(2000);
		od.clickmyorder();
		Thread.sleep(2000);
		od.clickeye();
		Thread.sleep(9000);
		od.clicknumber();
	}
	@Test(priority=3)
	public void actiontestemail() throws InterruptedException, IOException
	{
		driver.get(baseurl);
		MyOrder od = new MyOrder(driver);
		od.clickloginnumber();
		od.clickloginpwd();
		od.clicklogin1();
		Thread.sleep(2000);
		od.clickmyorder();
		Thread.sleep(2000);
		od.clickeye();
		Thread.sleep(9000);
		od.clickemail();
	}
	@Test(priority=4)
	public void actiontestweb() throws InterruptedException, IOException
	{
		driver.get(baseurl);
		MyOrder od = new MyOrder(driver);
		od.clickloginnumber();
		od.clickloginpwd();
		od.clicklogin1();
		Thread.sleep(2000);
		od.clickmyorder();
		Thread.sleep(2000);
		od.clickeye();
		Thread.sleep(9000);
		od.clickweb();
	}
	

}
