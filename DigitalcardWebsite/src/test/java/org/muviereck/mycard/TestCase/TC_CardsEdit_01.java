package org.muviereck.mycard.TestCase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyCard;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TC_CardsEdit_01 extends BaseClass{
	@Test(priority=0)
	public void cardstest() throws InterruptedException
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
		cc.clickedit();
		Thread.sleep(2000);
		cc.setphone();
		cc.setEmail();
		cc.setwebsite();
		Thread.sleep(3000);
		cc.setphnnumber("9962019188");
		Thread.sleep(3000);
		cc.setemailent("dd@gmail.com");
		cc.setwebsite("https://www.maxlifeinsurance.com/insurance-calculators/tax-calculator");
		Thread.sleep(2000);
		cc.setpresave();
		Thread.sleep(3000);
		cc.clickupok();
	}
//	@Test(priority=1)
//	public void cardstestback() throws InterruptedException
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
//		cc.clickedit();
//		Thread.sleep(2000);
//		cc.setphone();
//		cc.setEmail();
//		cc.setwebsite();
//		Thread.sleep(3000);
//        Thread.sleep(3000);
//		cc.clickback();
//	}
//	
//	
//	@Test(priority=2)
//	public void cardstestpaview() throws InterruptedException, IOException
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
//		cc.clickedit();
//		Thread.sleep(4000);
//		cc.clickphnpre();
//		cc.clickemailpre();
//		cc.clickwebpre();
//	}
//	@Test(priority=3)
//	public void cardstestpaviewinfo() throws InterruptedException, IOException
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
//		cc.clickedit();
//		Thread.sleep(4000);
//		cc.clicksavecontact();
//		Thread.sleep(2000);
//		TakesScreenshot sc2=(TakesScreenshot) driver;
//		File source2=sc2.getScreenshotAs(OutputType.FILE);
//		File store2=new File(".\\Screenshot\\MYcardpreview.png");
//		FileHandler.copy(source2, store2);
//		Thread.sleep(1000);
//        cc.clickpayinfo();
//		Thread.sleep(2000);
//		cc.clickpayview();
//		
//	}
//	@Test(priority=4)
//	public void cardstesteditcard() throws InterruptedException, IOException, AWTException
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
//		cc.clickedit();
//		cc.seteditcardname("Detailed Card");
//		Thread.sleep(3000);
//		cc.seteditimg();
//		cc.seteditallcolor();
//		cc.clickblack();
//	    cc.seteditfrstname("Deepika");
//		cc.setedittitle("personal card");
//		cc.seteditedu("Automation");
//		cc.seteditdep("IT");
//		cc.seteditcomapny("Muviereck");
//		cc.seteditbio("Busniess");
//		cc.seteditcity("Erode");
//		cc.setpresave();
//		Thread.sleep(3000);
//		cc.clickupok();
//		Thread.sleep(4000);
//		cc.clickbackbefore();
//   }
//	@Test(priority=5)
//	public void cardstesteditcardnumneg() throws InterruptedException, IOException, AWTException
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
//		cc.clickedit();
//		cc.seteditcardname("12365");
//		cc.seteditimg();
//		cc.seteditallcolor();
//		cc.clickblack();
//	    cc.seteditfrstname("12365");
//		cc.setedittitle("12365");
//		cc.seteditedu("12365");
//		cc.seteditdep("12365");
//		cc.seteditcomapny("12365");
//		cc.seteditbio("12365");
//		cc.seteditcity("12365");
//		cc.setpresave();
//		Thread.sleep(3000);
//		cc.clickupok();
//		Thread.sleep(4000);
//		cc.clickbackbefore();
//	}
		
	

}
