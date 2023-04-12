package org.muviereck.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCard {
	
	WebDriver ldriver;
	public MyCard(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[1]/div/input")
	WebElement loginnumber;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[3]/img")
	WebElement psweye;
	
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[3]/input")
	WebElement loginpwd;
	
	@FindBy(xpath="/html/body/div[1]/div/section/div/div/div/div/div/div[2]/div[2]/div[5]/button")
	WebElement loginok;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement chscard;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/a[2]")
	WebElement edit;
	
	@FindBy(xpath="//i[@class='fa fa-phone icon_update']")
	WebElement phone;
	
	@FindBy(xpath="//i[@class='fa fa-envelope icon_update']")
	WebElement Email;
	
	@FindBy(xpath="//i[@class='fa fa-globe icon_update']")
	WebElement website;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[8]/div[1]/div[2]/div/input")
	WebElement phnnum;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[8]/div[2]/div[2]/div/input")
	WebElement emailent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[8]/form/div/div[2]/div/input")
	WebElement websiteent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[4]/button")
	WebElement presave;
	
	@FindBy(xpath="/html/body/div[7]/div[7]/div/button")
	WebElement updok;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div[1]/div[3]/a[1]/div/div[2]")
	WebElement phonepre;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div[1]/div[3]/a[2]/div/div[2]")
	WebElement emailpre;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div[1]/div[3]/a[3]/div/div[2]")
	WebElement websitepre;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div[2]/a")
	WebElement savecontact;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div[3]/button")
	WebElement paymentinfo;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[3]/div/div/div[2]/div/div/div[1]/button")
	WebElement payview;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[4]/a/button")
	WebElement back;
	
	@FindBy(xpath ="/html/body/div[2]/div/div/div[1]/div[2]/input")
	WebElement editcardname;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/img")
	WebElement editimg;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[6]/div/button/span")
	WebElement editallcolor;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[6]/div/ul/div/div/div[15]/div/div")
	WebElement editblack;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")
	WebElement editfrstname;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/input")
	WebElement edittitle;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[3]/input")
	WebElement editedu;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[4]/input")
	WebElement editdep;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[5]/input")
	WebElement editcompany;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[6]/input")
	WebElement editbio;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[7]/input")
	WebElement editcity;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[1]/a[2]")
	WebElement backbefore;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/a[4]")
	              	          //    /html/body/div[2]/div/div/div/div[1]/a[4]
	WebElement delete;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[5]/div/div/div/div[2]/form/button[1]")
	WebElement deletecancel;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[5]/div/div/div/div[2]/form/button[2]")
	WebElement deleteyes;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/div[3]/ul[1]/li[1]/a[1]/i[1]")
	WebElement facebook;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[3]/ul/li[2]/a/i")
	WebElement twitter;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[3]/ul/li[3]/a/i")
	WebElement insta;
	
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[3]/ul/li[4]/a/i")
	WebElement linkedin;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[3]/ul/li[5]/a/i")
	WebElement whatsapp;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[3]/ul/li[6]/a/i")
	WebElement telegram;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[4]/button")
	WebElement copylink;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[4]/a[1]")
	WebElement downQR;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[4]/a[2]")
	WebElement clientpre;
	
	@FindBy(xpath="//*[@id=\'card_height1\']/div[2]/a[1]/div/div[1]")
	WebElement prephnnumber;
	
	@FindBy(xpath="//*[@id=\'card_height1\']/div[2]/a[2]/div/div[1]")
	WebElement premail;
	
	@FindBy(xpath="//*[@id=\'card_height1\']/div[2]/a[3]/div/div[1]")
	WebElement preweb;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/a")
	WebElement presavecontant;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/button")
	WebElement showqr;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[6]/button")
	WebElement payinfo;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/a[5]")
	WebElement design;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/a[2]")
	WebElement choosedesign;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div/div[2]/form/button[1]")
	WebElement designcancel;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div/div[2]/form/button[2]")
	WebElement designok;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/a[1]")
	WebElement designback;
	
	
	
	public void clickloginnumber()
	{
		loginnumber.sendKeys("9962019188");
	}
	public void clickloginpwd()
	{
		loginpwd.sendKeys("dd@29");
	}
	public void clicklogin1()
	{
		loginok.click();
	}
	public void clickchscard()
	{
		chscard.click();
	}
	public void clickedit()
	{
		edit.click();
	}
	public void setphone()
	{
		phone.click();
	}
	public void setEmail()
	{
		Email.click();
	}
	public void setwebsite()
	{
		website.click();
	}
	public void setphnnumber(String number)
	{
		phnnum.clear();
		phnnum.sendKeys(number);
	}
	public void setemailent(String email)
	{ 
		emailent.clear();
		emailent.sendKeys(email);
	}
	public void setwebsite(String website)
	{
		websiteent.clear();
		websiteent.sendKeys(website);
	}
	public void setpresave()
	{
		presave.click();
	}
	public void clickback()
	{
		back.click();
	}
	public void clickupok()
	{
		updok.click();
	}
	public void clickphnpre()
	{
		phonepre.click();
	}
	public void clickemailpre()
	{
		emailpre.click();
	}
	public void clickwebpre()
	{
		websitepre.click();
	}
	public void clicksavecontact()
	{
		savecontact.click();
	}
	public void clickpayinfo()
	{
		paymentinfo.click();
	}
	public void clickpayview()
	{
		payview.click();
	}
	public void seteditcardname(String editcardname1)
	{
		editcardname.clear();
		editcardname.sendKeys(editcardname1);
	}
	public void seteditimg() throws InterruptedException, AWTException
	{
		 Thread.sleep(1000);
		 editimg.click();
		  Thread.sleep(2000);
		   String file="C:\\Users\\91996\\Downloads\\happy life.jpg";
		  StringSelection Selection = new StringSelection(file);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		  
		  Robot rr=new Robot();
			rr.keyPress(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_ENTER);
			rr.keyRelease(KeyEvent.VK_ENTER);
	}
	public void seteditallcolor()
	{
	   editallcolor.click();
	}
	public void clickblack()
	{
		editblack.click();
	}
	public void seteditfrstname(String nameedit)
	{
	   editfrstname.clear();
	   editfrstname.sendKeys(nameedit);
	}
	public void setedittitle(String title)
	{
	   edittitle.clear();
	   edittitle.sendKeys(title);
	}
	public void seteditedu(String education) throws InterruptedException
	{
		Thread.sleep(1000);
		editedu.clear();
		editedu.sendKeys(education);
	}
	public void seteditdep(String department)
	{
		editdep.clear();
		editdep.sendKeys(department);
	}
	public void seteditcomapny(String company) throws InterruptedException
	{
		Thread.sleep(1000);
		editcompany.clear();
		editcompany.sendKeys(company);
	}
	public void seteditbio(String bio) throws InterruptedException
	{
		Thread.sleep(1000);
		editbio.clear();
		editbio.sendKeys(bio);
	}
	public void seteditcity(String city)
	{
		editcity.clear();
		editcity.sendKeys(city);
	}
	public void clickbackbefore()
	{
		backbefore.click();
	}
	public void clickdelete()
	{
		delete.click();
	}
	public void clickdeletecancel()
	{
		deletecancel.click();
	}
	public void clickdeleteyes()
	{
		deleteyes.click();
	}
	public void clickfb() throws InterruptedException
	{
		try
	{
		facebook.click();
	}catch (Exception e){
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
	    executor.executeScript("arguments[0].click();", facebook);
	}
	    String actualTitle = ldriver.getTitle();
		String expectedTitle = "Facebook";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
	}
	public void clicktwitter()
	{
		try {
		twitter.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", twitter);
		}
		String actualTitle = ldriver.getTitle();
		String expectedTitle = "twitter";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
	}
//	public void clickinsta()
//	{
//		try {
//		insta.click();
//		}
//		catch (Exception e)
//		{
//			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
//		    executor.executeScript("arguments[0].click();", insta);
//		}
//		String actualTitle = ldriver.getTitle();
//		String expectedTitle = "";
//		if(actualTitle.equalsIgnoreCase(expectedTitle))
//			System.out.println("Title Matched");
//		else
//			System.out.println("Title didn't match");
//	}
	public void clicklinke()
	{
		try {
		linkedin.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", linkedin);
		}
		String actualTitle = ldriver.getTitle();
		String expectedTitle = "linked login,sign in| linkedin";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
	}
	public void clickwhat()
	{
		try {
		whatsapp.click();
		} catch (Exception e){
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", whatsapp);
		}
		String actualTitle = ldriver.getTitle();
		String expectedTitle = "share on whatsapp";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
	}
	public void clciktelegram()
	{
		try {
		telegram.click();
		} catch(Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", telegram);
		}
		String actualTitle = ldriver.getTitle();
		String expectedTitle = "telegram:share web page";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
	}
	public void clickcopylink()
	{
		try {
		copylink.click();
		}catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", copylink);
		}
	}
	public void clickdownqr()
	{
		try {
		downQR.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", downQR);
		}
	}
	public void clickclientpre()
	{
		try {
		clientpre.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", clientpre);
		}
	}
	public void clickdesign()
	{
		try {
		design.click();
		} catch(Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", design);
		}
	}
	public void clickchsdesign()
	{
		choosedesign.click();
	}
	public void clickdesigncancel()
	{
		try {
		designcancel.click();
		}catch (Exception e){
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", designcancel);
		}
	}
	public void clickdesignok()
	{
		try {
		designok.click();
		} catch(Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", designok);
		}
	}
	public void clickdesignback()
	{
		designback.click();
	}
	public void clickprephnnumber()
	{
		try {
		prephnnumber.click();
		}catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", prephnnumber);
		}
	}
	public void clickpremail()
	{
		try {
		premail.click();
		}catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", premail);
		}
	}
	public void clickpreweb()
	{
		try {
		preweb.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", preweb);
		}
	}
	public void clickpresavecontant()
	{
		presavecontant.click();
	}
	public void clickshowqr()
	{
		showqr.click();
	}
	public void clcpayinfo()
	{
		payinfo.click();
	}

}
