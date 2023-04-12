package org.muviereck.visitingCard.TestCase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyCard;
import org.muviereck.pageObjects.VistingCard;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Vistingcards_01 extends BaseClass{
//	@Test(priority=0)
//	public void visitingtest() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		VistingCard cc = new VistingCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickvistingcard();
//		Thread.sleep(2000);
//		cc.clickvistcards();
//		Thread.sleep(2000);
//		cc.clickcard1();
//		cc.clickcard2();
//		cc.clickcard3();
//		cc.clickcard4();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		cc.clickcard5();
//		cc.clickcard6();
//		cc.clickcard7();
//		cc.clickcard8();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		cc.clickcard9();
//		cc.clickcard10();
//		cc.clickcard11();
//		cc.clickcard12();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		cc.clickcard13();
//		cc.clickcard14();
//		
//	}

//	@Test(priority=3)
//	public void visitingtestcard() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		VistingCard cc = new VistingCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickvistingcard();
//		Thread.sleep(2000);
//		cc.clickvistcards();
//		Thread.sleep(2000);
//		cc.clickcard1();
//		cc.clickcard2();
//		cc.clickcard3();
//		cc.clickcard4();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		cc.clickcard5();
//		cc.clickcard6();
//		cc.clickcard7();
//		cc.clickcard8();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		cc.clickcard9();
//		cc.clickcard10();
//		cc.clickcard11();
//		cc.clickcard12();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		cc.clickcard13();
//		cc.clickcard14();
//		Thread.sleep(2000);
//		cc.requestcard();
//		
//	}
//	@Test(priority=2)
//	public void visitingtestrequestcard() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		VistingCard cc = new VistingCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickvistingcard();
//		Thread.sleep(2000);
//		cc.clickvistcards();
//		Thread.sleep(2000);
//		cc.clickcard1();
//		cc.clickcard2();
//		cc.clickcard3();
//		cc.clickcard4();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		cc.clickcard5();
//		cc.clickcard6();
//		cc.clickcard7();
//		cc.clickcard8();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		cc.clickcard9();
//		cc.clickcard10();
//		cc.clickcard11();
//		cc.clickcard12();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		cc.clickcard13();
//		cc.clickcard14();
//		Thread.sleep(2000);
//		cc.clickselectcards();
//		cc.requestcard();
//		
//	}
//	@Test(priority=3)
//	public void visitingtestneg() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		VistingCard cc = new VistingCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickvistingcard();
//		Thread.sleep(2000);
//		cc.clickvistcards();
//		Thread.sleep(2000);
//		cc.requestcard();
//	}
//	@Test(priority=4)
//	public void visitingtestpayment() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		VistingCard cc = new VistingCard(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		Thread.sleep(2000);
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.clickvistingcard();
//		Thread.sleep(2000);
//		cc.clickvistcards();
//		Thread.sleep(2000);
//		cc.clickcard1();
//		cc.clickcard2();
//		cc.clickcard3();
//		cc.clickcard4();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		cc.clickcard5();
//		cc.clickcard6();
//		cc.clickcard7();
//		cc.clickcard8();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		cc.clickcard9();
//		cc.clickcard10();
//		cc.clickcard11();
//		cc.clickcard12();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		cc.clickcard13();
//		cc.clickcard14();
//		Thread.sleep(2000);
//		cc.clickselectcards();
//		cc.requestcard();
//		Thread.sleep(1000);
//		cc.paymentmode("Pay Now");
//		Thread.sleep(1000);
//		cc.clickplaceorder();
//		Thread.sleep(1000);
//		cc.clickcancel();
//		}
	@Test(priority=5)
	public void visitingtestpaymentproceed() throws InterruptedException
	{
		driver.get(baseurl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		VistingCard cc = new VistingCard(driver);
		cc.clickloginnumber();
		cc.clickloginpwd();
		Thread.sleep(2000);
		cc.clicklogin1();
		Thread.sleep(2000);
		cc.clickvistingcard();
		Thread.sleep(2000);
		cc.clickvistcards();
		Thread.sleep(2000);
		cc.clickcard1();
		cc.clickcard2();
		cc.clickcard3();
		cc.clickcard4();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		cc.clickcard5();
		cc.clickcard6();
		cc.clickcard7();
		cc.clickcard8();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		cc.clickcard9();
		cc.clickcard10();
		cc.clickcard11();
		cc.clickcard12();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		cc.clickcard13();
		cc.clickcard14();
		Thread.sleep(2000);
		cc.clickselectcards();
		cc.requestcard();
		Thread.sleep(1000);
		cc.paymentmode("Pay Now");
		Thread.sleep(1000);
		cc.clickplaceorder();
		Thread.sleep(3000);
		cc.clickcountry();
		cc.clickindia();
		Thread.sleep(1000);
		cc.clicknumber("9962019188");
		Thread.sleep(1000);
		cc.clickproceed();
		
		
		
	}

	
	

}
