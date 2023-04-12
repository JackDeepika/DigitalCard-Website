package org.muviereck.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VistingCard {
	
	
	WebDriver ldriver;
	
	public VistingCard(WebDriver rdriver)
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
	
	@FindBy(xpath="/html/body/div[1]/div[3]/ul[1]/li[3]/a")
	WebElement visitingcard;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/button[4]")
	WebElement vistcards;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[1]/div")
	WebElement card1;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[2]/div")
	WebElement card2;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div")
	WebElement card3;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[4]/div")
	WebElement card4;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[5]/div")
	WebElement card5;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[6]/div")
	WebElement card6;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[7]/div")
	WebElement card7;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[8]/div")
	WebElement card8;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[9]/div")
	WebElement card9;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[10]/div")
	WebElement card10;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[11]/div")
	WebElement card11;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[12]/div")
	WebElement card12;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[13]/div")
	WebElement card13;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[14]/div")
	WebElement card14;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div[1]/select")
	WebElement selectcards;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div[1]/select/option[2]")
	WebElement detailedcard;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div[1]/select/option[4]")
	WebElement jack;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div[1]/select/option[3]")
	WebElement numbercard;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div[2]/button")
	WebElement requestcard;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div[1]/input[1]")
	WebElement paynow;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div[1]/input[2]")
	WebElement paylater;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div[2]/button[1]")
	WebElement placeorder;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[1]/div[1]/div/div[1]/div[2]/button/svg")
	WebElement amountcancel;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div/div[1]/span")
	WebElement country;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div[2]/div/div[1]")
	WebElement indiacode;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/input")
	WebElement number;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[4]/div/button")
	WebElement proceed;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/button[3]")
    WebElement vistingcardqr;	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[1]/div/img")
	WebElement vcq1;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[2]/div/img")
	WebElement vcq2;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div/img")
	WebElement vcq3;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[4]/div/img")
	WebElement vcq4;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[6]/div/img")
	WebElement vcq5;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[7]/div/img")
	WebElement vcq6;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[8]/div/img")
	WebElement vcq7;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[9]/div/img")
	WebElement vcq8;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[10]/div/img")
	WebElement vcq9;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[11]/div/img")
	WebElement vcq10;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[12]/div/img")
	WebElement vcq11;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[13]/div/img")
	WebElement vcq12;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[14]/div/img")
	WebElement vcq13;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[15]/div/img")
	WebElement vcq14;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[16]/div/img")
	WebElement vcq15;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[17]/div/img")
	WebElement vcq16;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[18]/div/img")
	WebElement vcq17;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[19]/div/img")
	WebElement vcq18;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[20]/div/img")
	WebElement vcq19;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[21]/div/img")
	WebElement vcq20;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[22]/div/img")
	WebElement vcq21;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[23]/div/img")
	WebElement vcq22;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[24]/div/img")
	WebElement vcq23;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[2]/div/img")
	WebElement vcq24;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/button[2]")
	WebElement nfc;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[1]/div/img")
	WebElement vcn1;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[2]/div/img")
	WebElement vcn2;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/button[1]")
	WebElement all;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div/img")
	WebElement vcn3;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[4]/div/img")
	WebElement vcn4;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div[1]/select")
	WebElement selectallcards;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div[2]/button")
	WebElement requestcards;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[1]/input[1]")
	WebElement paynowall;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[1]/input[2]")
	WebElement paylaterall;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div/div[2]/button[1]")
	WebElement palceorderall;
	
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
	public void clickvistingcard()
	{
		visitingcard.click();
	}
	public void clickvistcards()
	{
		vistcards.click();
	}
	public void clickcard1()
	{
		card1.click();
	}
	public void clickcard2()
	{
		card2.click();
	}
	public void clickcard3()
	{
		card3.click();
	}
	public void clickcard4()
	{
		card4.click();
	}
	public void clickcard5()
	{
		card5.click();
	}
	public void clickcard6()
	{
		card6.click();
	}
	public void clickcard7()
	{
		card7.click();
	}
	public void clickcard8()
	{
		card8.click();
	}
	public void clickcard9()
	{
		card9.click();
	}
	public void clickcard10()
	{
		card10.click();
	}
	public void clickcard11()
	{
		card11.click();
	}
	public void clickcard12()
	{
		card12.click();
	}
	public void clickcard13()
	{
		card13.click();
	}
	public void clickcard14()
	{
		card14.click();
	}
	public void clickselectcards()
	{
		selectcards.click();
		
		Select ss = new Select(selectcards);
		ss.selectByVisibleText("Detailed Card");
		
		selectcards.click();
		
		
//		if(choosecard.equalsIgnoreCase("detailedcard"))
//		{
//			detailedcard.click();
//		}
//		else if(choosecard.equals("jack"))
//		{
//			jack.click();
//		}
//		else  if(choosecard.equals("numbercard"))
//		{
//			numbercard.click();
//		}
	}
	public void requestcard()
	{
		requestcard.click();
	}
	public void paymentmode(String paymentmode)
	{
		if(paymentmode.equals("Pay Now")) {
			paynow.click();
		}else if(paymentmode.equals("pay Later")) {
			paylater.click();
		}
	}
	public void clickplaceorder()
	{
		placeorder.click();
	}
	public void clickcancel()
	{
		amountcancel.click();
	}
	public void clickcountry()
	{
		country.click();
	}
	public void clickindia()
	{
		indiacode.click();
	}
	public void clicknumber(String num)
	{
		number.clear();
		number.sendKeys(num);
	}
	public void clickproceed()
	{
		proceed.click();
	}
	public void clickvistcardqr()
	{
		vistingcardqr.click();
	}
	public void clickvcq1()
	{
		vcq1.click();
	}
	public void clickvcq2()
	{
		vcq2.click();
	}
	public void clicknfc()
	{
		nfc.click();
	}
	public void clickvcn1()
	{
		vcn1.click();
	}
	public void clickvcn2()
	{
		vcn2.click();
	}
	public void clickall()
	{
		all.click();
	}
	public void clickvcn3()
	{
		vcn3.click();
	}
	public void clickvcn4()
	{
		vcn4.click();
	}
	public void clickselectallcards()
	{
		selectallcards.click();
		Select ss1 = new Select(selectallcards);
		ss1.selectByVisibleText("Detailed Card");
		
		selectallcards.click();
	}
	public void clickreqcards()
	{
		requestcards.click();
	}
	public void paymentmodeall(String amut)
	{
	     if(amut.equals("pay now"))
	     {
	    	 paynowall.click();
	     }
	     else if(amut.equals("pay later"))
	     {
	    	 paylaterall.click();
	     }
	}
	public void clickplaceorderall()
	{
		palceorderall.click();
	}
	
	
	

}
