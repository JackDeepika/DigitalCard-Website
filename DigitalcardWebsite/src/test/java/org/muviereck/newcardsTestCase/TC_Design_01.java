package org.muviereck.newcardsTestCase;

import java.awt.AWTException;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.NewCards;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Design_01 extends BaseClass{
//	@Test(priority=0)
//	public void designtest() throws InterruptedException, AWTException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		NewCards cc=new NewCards(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.Clicknewcard();
//		Thread.sleep(2000);
//		cc.setcardname("persnol");
//		Thread.sleep(3000);
//		cc.clickcolor();
//		Thread.sleep(3000);
//		cc.clickallcolor();
//		Thread.sleep(3000);
//		cc.clickyellow();
//		Thread.sleep(5000);
//		cc.setfirstname("deepika");
//		cc.settitle("jack");
//		cc.seteducation("automation");
//		cc.setdepartment("IT");
//		cc.Setcompany("muviereck");
//		cc.setbio("working");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,80000)");
//		cc.setcity("salem");
//		js.executeScript("window.scrollBy(0,80000)");
//		Thread.sleep(2000);
//		cc.setphoto();
//		Thread.sleep(5000);
//		cc.setpreview();
//		Thread.sleep(2000);
//		cc.click1();
//		Thread.sleep(9000);
//		cc.setchscancel();
//		Thread.sleep(5000);
//		cc.click4();
//	    Thread.sleep(9000);
//		cc.setchsok();
//	}
	@Test(priority=1)
	public void designtestback() throws InterruptedException, AWTException
	{
		driver.get(baseurl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		NewCards cc=new NewCards(driver);
		cc.clickloginnumber();
		Thread.sleep(1000);
		cc.clickloginpwd();
		Thread.sleep(2000);
		cc.clicklogin1();
		Thread.sleep(2000);
		cc.Clicknewcard();
		Thread.sleep(2000);
		cc.setcardname("persnol");
		Thread.sleep(3000);
		cc.clickcolor();
		Thread.sleep(3000);
		cc.clickallcolor();
		Thread.sleep(3000);
		cc.clickyellow();
		Thread.sleep(5000);
		cc.setfirstname("deepika");
		cc.settitle("jack");
		cc.seteducation("automation");
		cc.setdepartment("IT");
		cc.Setcompany("muviereck");
		cc.setbio("working");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,80000)");
		cc.setcity("salem");
		js.executeScript("window.scrollBy(0,80000)");
		Thread.sleep(2000);
		cc.setphoto();
		Thread.sleep(5000);
		cc.setpreview();
		Thread.sleep(5000);
		cc.clickback();
		cc.clickback2();
		
	}

}
