package org.muviereck.mycard.TestCase;

import java.io.File;
import java.io.IOException;

import org.muviereck.TestCase.BaseClass;
import org.muviereck.pageObjects.MyCard;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TC_PreviewEdit_01 extends BaseClass{
//	@Test(priority=0)
//	public void previewcard() throws IOException, InterruptedException
//	{
//		    driver.get(baseurl);
//			JavascriptExecutor js= (JavascriptExecutor)driver;
//			MyCard cc = new MyCard(driver);
//			cc.clickloginnumber();
//			cc.clickloginpwd();
//			Thread.sleep(2000);
//			cc.clicklogin1();
//			Thread.sleep(2000);
//			cc.clickchscard();
//			cc.clickedit();
//			Thread.sleep(2000);
//			cc.setphone();
//			cc.setEmail();
//			cc.setwebsite();
//			Thread.sleep(3000);
//			cc.clicksavecontact();
//			Thread.sleep(2000);
//			TakesScreenshot sc2=(TakesScreenshot) driver;
//			File source2=sc2.getScreenshotAs(OutputType.FILE);
//			File store2=new File(".\\Screenshot\\savetocontant.png");
//			FileHandler.copy(source2, store2);
//			Thread.sleep(1000);
//		}
	@Test(priority=1)
	public void previewcardcontentclick() throws IOException, InterruptedException
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
			cc.clickedit();
			Thread.sleep(2000);
			cc.setphone();
			cc.setEmail();
			cc.setwebsite();
			Thread.sleep(3000);
			cc.setphnnumber("9962019188");
			Thread.sleep(3000);
			cc.setemailent("dd@gmail.com");
			cc.setwebsite("https://www.maxlifeinsurance.com/insurance-calculators/tax-calculator");
			cc.setpresave();
			cc.clickupok();
			cc.clickphnpre();
			cc.clickemailpre();
			cc.clickwebpre();
	}
	

}
