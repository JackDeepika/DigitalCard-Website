package org.muviereck.ProfileTestCase;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyProfile;

import org.testng.annotations.Test;

public class TC_EditProfile_01 extends BaseClass{
//	@Test(priority=0)
//	public void profile() throws InterruptedException
//	{
//		driver.get(baseurl);
//		MyProfile mp = new MyProfile(driver);
//		mp.clickloginnumber();
//		mp.clickloginpwd();
//		Thread.sleep(2000);
//		mp.clicklogin1();
//		Thread.sleep(2000);
//		mp.clickprofile();
//		mp.clickfname("deep");
//		mp.clicklname("t");
//		mp.clickemail("fgg@gmail.com");
//		mp.clickphn("9962019188");
//		mp.clickaddress("3a,gandhi");
//		mp.clickstate("tamilnadu");
//		mp.clickcity("salme");
//		mp.clickpincode("852369");
//		mp.clickcountry("india");
//		Thread.sleep(2000);
//		mp.clickpassword("dd@29");
//		mp.clicksave();
//	}
//	@Test(priority=1)
//	public void profilenum() throws InterruptedException
//	{
//		driver.get(baseurl);
//		MyProfile mp = new MyProfile(driver);
//		mp.clickloginnumber();
//		mp.clickloginpwd();
//		Thread.sleep(2000);
//		mp.clicklogin1();
//		Thread.sleep(2000);
//		mp.clickprofile();
//		mp.clickfname("1342");
//		mp.clicklname("1342");
//		mp.clickemail("1342");
//		mp.clickphn("1342");
//		mp.clickaddress("1342");
//		mp.clickstate("1342");
//		mp.clickcity("1342");
//		mp.clickpincode("1342");
//		mp.clickcountry("1342");
//		Thread.sleep(2000);
//		mp.clickpassword("1342");
//		mp.clicksave();
//	}
	@Test(priority=2)
	public void profilespcl() throws InterruptedException
	{
		driver.get(baseurl);
		MyProfile mp = new MyProfile(driver);
		mp.clickloginnumber();
		mp.clickloginpwd();
		Thread.sleep(2000);
		mp.clicklogin1();
		Thread.sleep(2000);
		mp.clickprofile();
		mp.clickfname(",./';");
		mp.clicklname(",./';");
		mp.clickemail(",./';");
		mp.clickphn(",./';");
		mp.clickaddress(",./';");
		mp.clickstate(",./';");
		mp.clickcity(",./';");
		mp.clickpincode(",./';");
		mp.clickcountry(",./';");
		Thread.sleep(2000);
		mp.clickpassword(",./';");
		mp.clicksave();
		mp.clickback();
	}


}
