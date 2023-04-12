package org.muviereck.newcardsTestCase;

import java.awt.AWTException;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.NewCards;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_ActionNewcard_01 extends BaseClass{
//	@Test(priority=0)
//	public void newcard() throws InterruptedException, AWTException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		NewCards cc=new NewCards(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(4000);
//		//cc.Clicknewcard();
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
//	}
	@Test(priority=1)
	public void newcardmandatory() throws InterruptedException, AWTException
	{
		driver.get(baseurl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		NewCards cc=new NewCards(driver);
		cc.clickloginnumber();
		cc.clickloginpwd();
		cc.clicklogin1();
		Thread.sleep(2000);
		cc.Clicknewcard();
		js.executeScript("window.scrollBy(0,80000)");
		Thread.sleep(9000);
		cc.setpreview();
	}
//	@Test(priority=2)
//	public void newcardnegative() throws InterruptedException, AWTException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		NewCards cc=new NewCards(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.Clicknewcard();
//		cc.setcardname("12365");
//		Thread.sleep(2000);
//		cc.clickcolor();
//		Thread.sleep(2000);
//		cc.clickallcolor();
//		Thread.sleep(2000);
//		cc.clickyellow();
//		cc.setfirstname("21365");
//		cc.settitle("9564");
//		cc.seteducation("12365");
//		cc.setdepartment("956");
//		cc.Setcompany("4895");
//		cc.setbio("98654");
//		js.executeScript("window.scrollBy(0,80000)");
//		cc.setcity("98654");
//		js.executeScript("window.scrollBy(0,80000)");
//		Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,80000)");
//        Thread.sleep(2000);
//		cc.setphoto();
//     	Thread.sleep(9000);
//		cc.setpreview();
//	}
//	@Test(priority=3)
//	public void newcardnegativespcl() throws InterruptedException, AWTException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		NewCards cc=new NewCards(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.Clicknewcard();
//		cc.setcardname("';./");
//		Thread.sleep(2000);
//		cc.clickcolor();
//		Thread.sleep(2000);
//		cc.clickallcolor();
//		Thread.sleep(2000);
//		cc.clickyellow();
//		cc.setfirstname("/.;']");
//		cc.settitle("/.,;'");
//		cc.seteducation("/.;'");
//		cc.setdepartment("/*-+");
//		cc.Setcompany("+-*/");
//		cc.setbio("*-+/");
//		js.executeScript("window.scrollBy(0,80000)");
//		cc.setcity("';[]");
//		js.executeScript("window.scrollBy(0,80000)");
//		Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,80000)");
//        Thread.sleep(2000);
//		cc.setpdf();
//     	Thread.sleep(9000);
//		cc.setpreview();
//	}
		

}
