package org.muviereck.myorder.TestCase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyOrder;
import org.testng.annotations.Test;

public class TC_Record_01 extends BaseClass{
	@Test
	public void recordtest() throws InterruptedException
	{
		driver.get(baseurl);
		MyOrder od = new MyOrder(driver);
		od.clickloginnumber();
		od.clickloginpwd();
		od.clicklogin1();
		Thread.sleep(2000);
		od.clickmyorder();
		Thread.sleep(4000);
		od.clickrecordpage("50");
		
	}

}
