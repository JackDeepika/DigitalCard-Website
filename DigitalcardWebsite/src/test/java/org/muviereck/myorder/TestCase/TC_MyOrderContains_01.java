package org.muviereck.myorder.TestCase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyOrder;
import org.testng.annotations.Test;

public class TC_MyOrderContains_01 extends BaseClass{
//	@Test(priority=0)
//	public void containstest() throws InterruptedException
//	{
//		driver.get(baseurl);
//		MyOrder od = new MyOrder(driver);
//		od.clickloginnumber();
//		od.clickloginpwd();
//		od.clicklogin1();
//		Thread.sleep(2000);
//		od.clickmyorder();
//		Thread.sleep(2000);
//		od.clickdate();
//		od.clickdatepic();
//		Thread.sleep(2000);
//		od.clickcardname("is null");
//		Thread.sleep(1000);
//		od.clickvistcard("blank");
//		Thread.sleep(1000);
//		od.clickorderstatus("is");
//		Thread.sleep(1000);
//		od.clickstatus("active");
//	}
//	@Test(priority=1)
//	public void containstestent() throws InterruptedException
//	{
//		driver.get(baseurl);
//		MyOrder od = new MyOrder(driver);
//		od.clickloginnumber();
//		od.clickloginpwd();
//		od.clicklogin1();
//		Thread.sleep(2000);
//		od.clickmyorder();
//		Thread.sleep(2000);
//		od.clickdate();
//		od.clickdatepic();
//		Thread.sleep(2000);
//		od.clickcardname("is null");
//		Thread.sleep(1000);
//		od.clickvistcard("blank");
//		Thread.sleep(1000);
//		od.clickorderstatus("is");
//		Thread.sleep(1000);
//		od.clickstatus("active");
//		od.clickcardnameent("detaied card");
//		Thread.sleep(1000);
//		od.clickvistcardname("vcn003");
//		Thread.sleep(1000);
//		od.clickorderstatuse("inactive");
//	}
//	@Test(priority=2)
//	public void containstestentpos() throws InterruptedException
//	{
//		driver.get(baseurl);
//		MyOrder od = new MyOrder(driver);
//		od.clickloginnumber();
//		od.clickloginpwd();
//		od.clicklogin1();
//		Thread.sleep(2000);
//		od.clickmyorder();
//		Thread.sleep(2000);
//		od.clickdate();
//		od.clickposdatepic();
//		Thread.sleep(2000);
//		od.clickcardname("is null");
//		Thread.sleep(1000);
//		od.clickvistcard("blank");
//		Thread.sleep(1000);
//		od.clickorderstatus("is");
//		Thread.sleep(1000);
//		od.clickstatus("inactive");
//		
//	}
	@Test(priority=3)
	public void containstestentpositive() throws InterruptedException
	{
		driver.get(baseurl);
		MyOrder od = new MyOrder(driver);
		od.clickloginnumber();
		od.clickloginpwd();
		od.clicklogin1();
		Thread.sleep(2000);
		od.clickmyorder();
		Thread.sleep(2000);
		od.clickdate();
		od.clickposdatepic();
		Thread.sleep(2000);
		od.clickcardname("is null");
		Thread.sleep(1000);
		od.clickvistcard("blank");
		Thread.sleep(1000);
		od.clickorderstatus("is");
		Thread.sleep(1000);
		od.clickstatus("inactive");
	}

}
