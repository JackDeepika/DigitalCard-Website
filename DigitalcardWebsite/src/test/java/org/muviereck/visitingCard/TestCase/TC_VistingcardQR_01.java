package org.muviereck.visitingCard.TestCase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.VistingCard;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_VistingcardQR_01 extends BaseClass {
	@Test(priority=0)
	public void vistQRTest() throws InterruptedException
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
		cc.clickvistcardqr();
		Thread.sleep(2000);
		cc.clickvcq1();
		cc.clickvcq2();
		Thread.sleep(2000);
		cc.clickselectcards();
		cc.requestcard();
		Thread.sleep(3000);
		cc.paymentmode("pay Later");
		Thread.sleep(1000);
		cc.clickplaceorder();
	}
//	@Test(priority=1)
//	public void vistQRTestpaynow() throws InterruptedException
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
//		cc.clickvistcardqr();
//		Thread.sleep(2000);
//		cc.clickvcq1();
//		cc.clickvcq2();
//		Thread.sleep(2000);
//		cc.clickselectcards();
//		cc.requestcard();
//		Thread.sleep(3000);
//		cc.paymentmode("Pay Now");
//		Thread.sleep(1000);
//		cc.clickplaceorder();
//		Thread.sleep(3000);
//		cc.clickcountry();
//		cc.clickindia();
//		Thread.sleep(1000);
//		cc.clicknumber("9962019188");
//		Thread.sleep(1000);
//		cc.clickproceed();
//		
//		
//	}

}
