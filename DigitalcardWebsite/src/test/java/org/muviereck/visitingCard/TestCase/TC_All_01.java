package org.muviereck.visitingCard.TestCase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.VistingCard;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_All_01 extends BaseClass {
	@Test
	public void alltest() throws InterruptedException
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
		cc.clickall();
		cc.clickvcn3();
		cc.clickvcn4();
		Thread.sleep(4000);
		cc.clickselectallcards();
		cc.clickreqcards();
		Thread.sleep(3000);
		cc.paymentmodeall("pay now");
		Thread.sleep(1000);
		cc.clickplaceorderall();
		Thread.sleep(3000);
		cc.clickcountry();
		cc.clickindia();
		Thread.sleep(1000);
		cc.clicknumber("9962019188");
		Thread.sleep(1000);
		cc.clickproceed();
	}

}
