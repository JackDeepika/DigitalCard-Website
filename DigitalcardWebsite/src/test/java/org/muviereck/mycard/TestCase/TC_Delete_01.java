package org.muviereck.mycard.TestCase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyCard;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Delete_01 extends BaseClass{
	@Test(priority=0)
	public void deletetest() throws InterruptedException
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
		cc.clickdelete();
		cc.clickdeletecancel();
	}
	@Test(priority=1)
	public void deletetestcon() throws InterruptedException
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
		cc.clickdelete();
		cc.clickdeleteyes();
	}

}
