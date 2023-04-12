package org.muviereck.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrder {
	
   WebDriver ldriver;
	
	public MyOrder(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[1]/div/input")
	WebElement loginnumber;
	
    @FindBy(xpath="/html/body/div/div/section/div/div/div/div/div/div[2]/div[2]/div[3]/input")
	WebElement loginpwd;
	
	@FindBy(xpath="/html/body/div[1]/div/section/div/div/div/div/div/div[2]/div[2]/div[5]/button")
	WebElement loginok;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/ul[1]/li[4]/a")
	WebElement myorder;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/form/input")
	WebElement date;
	
	@FindBy(xpath="/html/body/div[6]/div[2]/div/div[2]/div/span[9]")
	WebElement datepic;
	
	@FindBy(xpath="/html/body/div[6]/div[2]/div/div[2]/div/span[11]")
	WebElement posdatepic;
	
	@FindBy(xpath="/html/body/div[6]/div[2]/div/div[2]/div/span[19]")
	WebElement datepic1;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select")
	WebElement cardname;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[1]")
	WebElement contain;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[2]")
	WebElement containsnot;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[3]")
	WebElement is;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[4]")
	WebElement isnot;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[5]")
	WebElement startwith;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[6]")
	WebElement endwith;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[7]")
	WebElement empty;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[8]")
	WebElement notempty;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[9]")
	WebElement isnull;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[10]")
	WebElement notnull;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[11]")
	WebElement blank;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[12]")
	WebElement notblank;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select")
	WebElement vistcontain;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[1]")
	WebElement containvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[2]")
	WebElement notcontainvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[3]")
	WebElement isvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[4]")
	WebElement isnotvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[5]")
	WebElement startwithvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[6]")
	WebElement endwithvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[7]")
	WebElement emptyvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[8]")
	WebElement notemptyvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[9]")
	WebElement isnullvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[10]")
	WebElement notnullvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[11]")
	WebElement blankvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[12]")
	WebElement notblankvt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select")
	WebElement oderstatus;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[1]")
	WebElement containod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[2]")
	WebElement containnotod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[3]")
	WebElement isod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[4]")
	WebElement isnotod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[5]")
	WebElement startwithod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[6]")
	WebElement endwithod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[7]")
	WebElement emptyod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[8]")
	WebElement notemptyod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[9]")
	WebElement isnullod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[10]")
	WebElement notnullod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[11]")
	WebElement blankod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select/option[12]")
	WebElement notblankod;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/select")
	WebElement cardstatus;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/select/option[1]")
	WebElement all;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/select/option[2]")
	WebElement active;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/select/option[3]")
	WebElement inactive;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[2]/input")
	WebElement cardnameent;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[2]/input")
	WebElement vistcardent;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[2]/input")
	WebElement orderstatus;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[8]/div/button")
	WebElement eye;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div/div[3]/a")
	WebElement savetocontact;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[3]/button")
	WebElement showqr;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[5]/button")
	WebElement paymentinfo;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[6]/ul/li[1]/a/i")
	WebElement fb;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[6]/ul/li[2]/a/i")
	WebElement twitter;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[6]/ul/li[3]/a/i")
	WebElement linkedin;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[6]/ul/li[4]/a/i")
	WebElement wp;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[6]/ul/li[5]/a/i")
	WebElement telegram;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div/footer/div[1]/div/label/select/option[1]")
	WebElement ten;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div/footer/div[1]/div/label/select/option[2]")
	WebElement twentyfive;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div/footer/div[1]/div/label/select/option[3]")
	WebElement fifty;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div/footer/div[1]/div/label/select/option[4]")
	WebElement hundred;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div/footer/div[1]/div/label/select/option[5]")
	WebElement zero;
	
	@FindBy(xpath="//*[@id=\'card_height1\']/div[2]/a[1]/div/div[1]")
	WebElement orderphn;
	
	@FindBy(xpath="//*[@id=\'card_height1\']/div[2]/a[2]/div/div[1]")
	WebElement orderemail;
	
	@FindBy(xpath="//*[@id=\'card_height1\']/div[2]/a[3]/div/div[1]")
	WebElement orderwebsite;
	
	
	
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
	public void clickmyorder()
	{
		myorder.click();
	}
	public void clickdate()
	{
		date.click();
	}
	public void clickdatepic()
	{
		datepic.click();
	}
	public void clickposdatepic()
	{
		posdatepic.click();
	}
	public void clickcardname(String value)
	{
		if(value.equals("contains"))
		{
			contain.click();
		}
		else if(value.equals("not contains"))
		{
			containsnot.click();
		}
		else if(value.equals("is"))
		{
			is.click();
		}
		else if(value.equals("is not"))
		{
			isnot.click();
		}
		else if(value.equals("startwith"))
		{
			startwith.click();
		}
		else if(value.equals("endwith"))
		{
			endwith.click();
		}
		else if(value.equals("empty"))
		{
			empty.click();
		}
		else if(value.equals("not empty"))
		{
			notempty.click();
		}
		else if(value.equals("is null"))
		{
			isnull.click();
		}
		else if(value.equals("not null"))
		{
			notnull.click();
		}
		else if(value.equals("blank"))
		{
			blank.click();
		}
		else if(value.equals("not blank"))
		{
			notblank.click();
		}
	}
	public void clickvistcard(String valuevt)
	{
		if(valuevt.equals("contains"))
		{
			containvt.click();
		}
		else if(valuevt.equals("not contains"))
		{
			notcontainvt.click();
		}
		else if(valuevt.equals("is"))
		{
			isvt.click();
		}
		else if(valuevt.equals("is not"))
		{
			isnotvt.click();
		}
		else if(valuevt.equals("startwith"))
		{
			startwithvt.click();
		}
		else if(valuevt.equals("endwith"))
		{
			endwithvt.click();
		}
		else if(valuevt.equals("empty"))
		{
			emptyvt.click();
		}
		else if(valuevt.equals("not empty"))
		{
			notemptyvt.click();
		}
		else if(valuevt.equals("is null"))
		{
			isnullvt.click();
		}
		else if(valuevt.equals("not null"))
		{
			notnullvt.click();
		}
		else if(valuevt.equals("blank"))
		{
			blankvt.click();
		}
		else if(valuevt.equals("not blank"))
		{
			notblankvt.click();
		}
	}
	public void clickorderstatus(String valueod)
	{
		if(valueod.equals("contains"))
		{
			containod.click();
		}
		else if(valueod.equals("not contains"))
		{
			containnotod.click();
		}
		else if(valueod.equals("is"))
		{
			isod.click();
		}
		else if(valueod.equals("is not"))
		{
			isnotod.click();
		}
		else if(valueod.equals("startwith"))
		{
			startwithod.click();
		}
		else if(valueod.equals("endwith"))
		{
			endwithod.click();
		}
		else if(valueod.equals("empty"))
		{
			emptyod.click();
		}
		else if(valueod.equals("not empty"))
		{
			notemptyod.click();
		}
		else if(valueod.equals("is null"))
		{
			isnullod.click();
		}
		else if(valueod.equals("not null"))
		{
			notnullod.click();
		}
		else if(valueod.equals("blank"))
		{
			blankod.click();
		}
		else if(valueod.equals("not blank"))
		{
			notblankod.click();
		}
	}
	public void clickstatus(String status)
	{
		if(status.equals("all"))
		{
			all.click();
		}
		else if(status.equals("active"))
		{
			active.click();
		}
		else if(status.equals("inactive"))
		{
			inactive.click();
		}
	}
	public void clickcardnameent(String vl)
	{
		cardnameent.sendKeys(vl);
	}
	public void clickvistcardname(String name)
	{
		vistcardent.sendKeys(name);
	}
	public void clickorderstatuse(String name1)
	{
		orderstatus.sendKeys(name1);
	}
	public void clickeye()
	{
		eye.click();
	}
	public void clicksavetocontant()
	{
		try {
		savetocontact.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", savetocontact);
		}
	}
	public void clickshowqr()
	{
		try {
		showqr.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", showqr);
		}
	}
	public void clickpaymentinfo()
	{
		try {
		paymentinfo.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", paymentinfo);
		}
	}
	
	public void clickfb()
	{
		try {
		fb.click();
		} catch(Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", fb);
		}
	}
	public void clicktwit()
	{
		try {
		twitter.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", twitter);
		}
	}
	public void clicklinked()
	{
		try {
		linkedin.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", linkedin);
		}
	}
	public void clickwhatsapp()
	{
		try {
		wp.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
			 executor.executeScript("arguments[0].click();", wp);
		}
	}
	public void clicktelegram()
	{
		try {
		telegram.click();
		} catch (Exception e){
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
			 executor.executeScript("arguments[0].click();", telegram);
		}
	}
	public void clickrecordpage(String page)
	{
		record.click();
		if(page.equals("10"))
		{
			ten.click();
		}
		else if(page.equals("25"))
		{
			twentyfive.click();
		}
		else if(page.equals("50"))
		{
			fifty.click();
		}
		else if(page.equals("100"))
		{
			hundred.click();
		}
		else if(page.equals("0"))
		{
			zero.click();
		}
	}
	public void clicknumber()
	{
		try {
		orderphn.click();
		}catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
			 executor.executeScript("arguments[0].click();", orderphn);
		}
		
	}
	public void clickemail()
	{
		try {
		orderemail.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
			 executor.executeScript("arguments[0].click();", orderemail);
		}
	}
	public void clickweb()
	{
		try {
		orderwebsite.click();
		} catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
			 executor.executeScript("arguments[0].click();", orderwebsite);
		}
	}

}
