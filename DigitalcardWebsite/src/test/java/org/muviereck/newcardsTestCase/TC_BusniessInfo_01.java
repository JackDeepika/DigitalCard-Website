package org.muviereck.newcardsTestCase;

import java.awt.AWTException;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.NewCards;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_BusniessInfo_01 extends BaseClass {
//	@Test(priority=0)
//	public void Busniessinfo() throws InterruptedException
//	{
//		driver.get(baseurl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		NewCards cc=new NewCards(driver);
//		cc.clickloginnumber();
//		cc.clickloginpwd();
//		cc.clicklogin1();
//		Thread.sleep(2000);
//		cc.Clicknewcard();
//		Thread.sleep(3000);
//		cc.setcardname("deepika");
//		Thread.sleep(3000);
//		cc.setphone();
//		cc.setEmail();
//		cc.setwebsite();
//		cc.setwhatsapp();
//		//Thread.sleep(2000);
//        cc.setaddress();
//		cc.setmap();
//		Thread.sleep(3000);
//	    //js.executeScript("window.scrollBy(0,80000)");
//		cc.setfb();
//		//js.executeScript("window.scrollBy(0,80000)");
//		cc.setinsta();
//		cc.settwitter();
//		cc.setyoutube();
//		cc.setlinkedin();
//		cc.setskype();
//		cc.settelegram();
//		//js.executeScript("window.scrollBy(0,80000)");
//		Thread.sleep(3000);
//		cc.setsnap();
//		cc.pinterest();
//		cc.setreddit();
//		cc.setquora();
//		cc.setdribble();
//		Thread.sleep(2000);
//		cc.setvimeo();
//		Thread.sleep(3000);
//		//js.executeScript("window.scrollBy(0,80000)");
//		 cc.setspotify();
//		Thread.sleep(5000);
//		cc.setplaystore();
//		cc.setappstore();
//	    cc.setbank();
//	    cc.setgp();
//	    Thread.sleep(2000);
//	    cc.setphnpe();
//	    cc.setpaytm();
//	    cc.setqrcode();
//	}
//	
//	@Test(priority=1)
//	public void Busniessinfoenterneg() throws InterruptedException, AWTException
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
//		cc.setcardname("145236");
//		Thread.sleep(3000);
//		cc.clickcolor();
//		Thread.sleep(3000);
//		cc.clickallcolor();
//		Thread.sleep(3000);
//		cc.clickyellow();
//		Thread.sleep(5000);
//		cc.setfirstname("58964");
//		cc.settitle("789651");
//		cc.seteducation("1459");
//		cc.setdepartment("47856");
//		cc.Setcompany("478596");
//		cc.setbio("4956");
//		Thread.sleep(1000);
//	    cc.setcity("1653");
//		Thread.sleep(5000);
//		cc.setphone();
//		cc.setEmail();
//		cc.setwebsite();
//		cc.setwhatsapp();
//		cc.setaddress();
//		cc.setmap();
//		cc.setfb();
//		//js.executeScript("window.scrollBy(0,80000)");
//		cc.setinsta();
//		cc.settwitter();
//		cc.setyoutube();
//		cc.setlinkedin();
//		cc.setskype();
//		cc.settelegram();
//		cc.setsnap();
//		cc.pinterest();
//		cc.setreddit();
//		cc.setquora();
//		Thread.sleep(2000);
//		cc.setdribble();
//		Thread.sleep(3000);
//		cc.setvimeo();
//		Thread.sleep(3000);
//		cc.setspotify();
//		cc.setplaystore();
//		cc.setappstore();
//		cc.setbank();
//	    cc.setgp();
//	    Thread.sleep(2000);
//	    cc.setphnpe();
//	    cc.setpaytm();
//	    cc.setqrcode();
//		Thread.sleep(5000);
//		cc.setphnnum("dssp");
//		cc.setemailent("1236547");
//		cc.setwebsiteent("56489");
//		cc.setwhatent("asdf");
//		cc.setlocation("145236");
//		Thread.sleep(3000);
//		cc.setmapent("145236");
//		cc.setfbent("15632");
//		cc.setinsent("45632");
//		cc.settwitterent("852369");
//		cc.setyoutubeent("456997");
//		js.executeScript("window.scrollBy(0,8000)");
//		cc.setlinkedent("45632");
//		cc.setskypeent("8541");
//		js.executeScript("window.scrollBy(0,8000)");
//		cc.settelegrament("45632");
//		cc.setsnapent("4565");
//		cc.setpinterestent("85421");
//		cc.setredditent("9563");
//		cc.setquoraent("8945");
//		cc.setdribbleent("46132");
//		cc.setvimeoent("9146");
//		Thread.sleep(3000);
//		cc.setspotifyent("3210");
//		cc.setplaystoreent("65412");
//		Thread.sleep(3000);
//		cc.setappstoreent("9654");
//		cc.setactype("123654");
//		cc.setbankname("145';./");
//		cc.setacnumber("rtyuh3295610101000");
//		cc.setacifsc("sbi10103292");
//		cc.setbranch("123654");
//		cc.setgpnumber("0000000000");
//		cc.setphnpenumber("0000000000");
//		cc.setpaytym("0000000000");
//		cc.setqrname("15694");
//		cc.setqrupi("159753");
//	    Thread.sleep(5000);
//	    cc.setphoto();
//        Thread.sleep(5000);
//		cc.setpreview();
//		
//	}
	@Test(priority=2)
	public void Busniessinfoenterpos() throws InterruptedException, AWTException
	{
		driver.get(baseurl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		NewCards cc=new NewCards(driver);
		cc.clickloginnumber();
		cc.clickloginpwd();
		Thread.sleep(2000);
		cc.clicklogin1();
		Thread.sleep(2000);
		cc.Clicknewcard();
		Thread.sleep(2000);
		cc.setcardname("deepika");
		Thread.sleep(3000);
		cc.clickcolor();
		Thread.sleep(3000);
		cc.clickallcolor();
		Thread.sleep(3000);
		cc.clickyellow();
		Thread.sleep(5000);
		cc.setfirstname("deepka");
		cc.settitle("jack");
		cc.seteducation("automation");
		cc.setdepartment("it");
		cc.Setcompany("muviereck");
		cc.setbio("wrk");
		Thread.sleep(1000);
	    cc.setcity("salem");
		Thread.sleep(5000);
		cc.setphone();
		cc.setEmail();
		cc.setwebsite();
		cc.setwhatsapp();
		cc.setaddress();
		cc.setmap();
		cc.setfb();
		//js.executeScript("window.scrollBy(0,80000)");
		cc.setinsta();
		cc.settwitter();
		cc.setyoutube();
		cc.setlinkedin();
		cc.setskype();
		cc.settelegram();
		cc.setsnap();
		cc.pinterest();
		cc.setreddit();
		cc.setquora();
		Thread.sleep(2000);
		cc.setdribble();
		Thread.sleep(3000);
		cc.setvimeo();
		Thread.sleep(3000);
		cc.setspotify();
		cc.setplaystore();
		cc.setappstore();
		cc.setbank();
	    cc.setgp();
	    Thread.sleep(2000);
	    cc.setphnpe();
	    cc.setpaytm();
	    cc.setqrcode();
		Thread.sleep(5000);
		cc.setphnnum("7305884112");
		cc.setemailent("dd@gmail.com");
		cc.setwebsiteent("https://www.maxlifeinsurance.com/insurance-calculators/tax-calculator");
		cc.setwhatent("7305884112");
		cc.setlocation("3a,gandhiji,street");
		Thread.sleep(3000);
		cc.setmapent("https://www.google.com/maps/place/Salem,+Tamil+Nadu/@11.6537012,77.9982106,11z/data=!3m1!4b1!4m6!3m5!1s0x3babf1ccf52cba0b:0xee9989007068ca47!8m2!3d11.664325!4d78.1460142!16zL20vMDFqbmdz");
		cc.setfbent("https://www.facebook.com/rbbusinessnexus");
		cc.setinsent("https://www.instagram.com/rbbusinessnexus/");
		cc.settwitterent("https://twitter.com/search?q=%23IPL2023&src=trend_click&vertical=trends");
		cc.setyoutubeent("https://www.youtube.com/watch?v=FkpAOQgXipo");
		js.executeScript("window.scrollBy(0,8000)");
		cc.setlinkedent("https://www.linkedin.com/company/rb-business-nexus/");
		cc.setskypeent("https://meet.uiowa.edu/its-skype-test/90Y5QVFL");
		js.executeScript("window.scrollBy(0,8000)");
		cc.settelegrament("9962019188");
		cc.setsnapent("https://www.snapchat.com/add/deepikathirukum?share_id=WZkGyQXErNM&locale=en-IN");
		cc.setpinterestent("https://pin.it/3wIiaUm");
		cc.setredditent("https://www.reddit.com/u/Subject-Lobster4610?utm_medium=android_app&utm_source=share");
		cc.setquoraent("https://www.quora.com/profile/Deepika-T-120?ch=3&oid=2140825896&share=c7485095&srid=hUJH7o&target_type=user");
		cc.setdribbleent("https://dribbble.com/tags/test_code");
		cc.setvimeoent("https://vimeo.com/812700300");
		Thread.sleep(3000);
		cc.setspotifyent("deepi");
		cc.setplaystoreent("https://play.google.com/store/apps/details?id=com.dribbble.clean");
		Thread.sleep(3000);
		cc.setappstoreent("https://apps.apple.com/us/app/instagram/id389801252");
		cc.setactype("Savings account");
		cc.setbankname("Canara bank");
		cc.setacnumber("3295610101000");
		cc.setacifsc("SBI10103292");
		cc.setbranch("salem");
		cc.setgpnumber("7305884112");
		cc.setphnpenumber("7305884112");
		cc.setpaytym("7305884112");
		cc.setqrname("bank");
		cc.setqrupi("sbi@24");
	    Thread.sleep(5000);
	    cc.setphoto();
        Thread.sleep(5000);
		cc.setpreview();
		
	}
	

}
