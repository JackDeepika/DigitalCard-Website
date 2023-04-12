package org.muviereck.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewCards {
	
	WebDriver ldriver;
	public NewCards(WebDriver rdriver)
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
	
	@FindBy(xpath="/html/body/div[1]/div[3]/ul[1]/li[2]/a/span")
	WebElement newcard;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/input")
	WebElement cardname;
	
	@FindBy(xpath="//*[@id=\'profileImage\']")
	WebElement photo;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement color;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/button[1]")
	WebElement allcolor;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/div[1]/div[1]/div[8]/div[1]/div[1]")
	WebElement yellow;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[1]/input")
	WebElement firstname;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[2]/input")
	WebElement title;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[3]/input")
	WebElement education;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[4]/input")
	WebElement department;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[5]/input")
	WebElement company;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[6]/input")
	WebElement bio;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[7]/input")
	WebElement city;
	
	@FindBy(id="hide_bank_details")
	WebElement payment;
	
	@FindBy(xpath="//*[@id=\'show_bank_details\']/div[1]/input")
	WebElement upiname;
	
	@FindBy(xpath="//*[@id=\'show_bank_details\']/div[2]/input")
	WebElement upiid;
	
	@FindBy(xpath="//*[@id=\'show_bank_details\']/div[3]/input")
	WebElement vpaid;
	
	@FindBy(xpath="//*[@id=\'show_bank_details\']/div[4]/input")
	WebElement gpnum;
	
	@FindBy(xpath="//*[@id=\'show_bank_details\']/div[5]/input")
	WebElement phnpe;
	
	@FindBy(xpath="//*[@id=\'show_bank_details\']/div[6]/input")
	WebElement ptm;
	
	@FindBy(xpath="//*[@id=\'show_bank_details\']/div[7]/input")
	WebElement Acnum;
	
	@FindBy(xpath="//*[@id=\'show_bank_details\']/div[8]/input")
	WebElement ifsc;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[4]/button")
	WebElement preview;
	
	@FindBy(xpath="//i[@class='fa fa-phone icon']")
	WebElement phone;
	
	@FindBy(xpath="//i[@class='fa fa-envelope icon']")
	WebElement Email;
	
	@FindBy(xpath="//i[@class='fa fa-globe icon']")
	WebElement website;
	
	@FindBy(xpath="//i[@class='fa fa-whatsapp icon']")
	WebElement whatsapp;
	
	@FindBy(xpath="//i[@class='fa fa-map-marker icon']")
	WebElement location;
	
	@FindBy(xpath="//i[@class='fa fa-map icon']")
	WebElement map;
	
	@FindBy(xpath="//i[@class='fa fa-facebook-official icon']")
	WebElement fb;
	
	@FindBy(xpath="//i[@class='fa fa-instagram icon']")
	WebElement insta;
	
	@FindBy(xpath="//i[@class='fa fa-twitter icon']")
	WebElement twitter;
	
	@FindBy(xpath="//i[@class='fa fa-youtube icon']")
	WebElement youtube;
	
	@FindBy(xpath="//i[@class='fa fa-linkedin icon']")
	WebElement linkedin;
	
	@FindBy(xpath="//i[@class='fa fa-skype icon']")
	WebElement skype;
	
	@FindBy(xpath="//i[@class='fa fa-telegram icon']")
	WebElement telegram;
	
	@FindBy(xpath="//i[@class='fa fa-snapchat icon']")
	WebElement snap;
	
	@FindBy(xpath="//i[@class='fa fa-pinterest icon']")
	WebElement pinterest;
	
	@FindBy(xpath="//i[@class='fa fa-reddit icon']")
	WebElement reddit;
	
	@FindBy(xpath="//i[@class='fa fa-quora icon']")
	WebElement quora;
	
	@FindBy(xpath="//i[@class='fa fa-dribbble icon']")
	WebElement dribble;
	
	@FindBy(xpath="//i[@class='fa fa-vimeo icon']")
	WebElement vimeo;
	
	@FindBy(xpath="//i[@class='fa fa-spotify icon']")
	WebElement spotify;
	
	@FindBy(xpath="//div[@class='icon me-auto ms-auto']")
	WebElement playstore;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div/div[24]")
	WebElement appstore;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div/div[6]/i")
	WebElement address;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[1]/div[2]/div/input")
	WebElement phnnum;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[2]/div[2]/div/input")
	WebElement emailent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[3]/div[2]/div/input")
	WebElement websiteent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[4]/div[2]/div/input")
	WebElement whatent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[5]/div[2]/div/input")
	WebElement locationent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[6]/div[2]/div/input")
	WebElement mapent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[7]/div[2]/div/input")
	WebElement fbent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[8]/div[2]/div/input")
	WebElement instaent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[9]/div[2]/div/input")
	WebElement twitterent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[10]/div[2]/div/input")
    WebElement youtubeent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[11]/div[2]/div/input")
	WebElement linkedent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[12]/div[2]/div/input")
	WebElement skypeent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[13]/div[2]/div/input")
	WebElement telegrament;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[14]/div[2]/div/input")
	WebElement snapent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[15]/div[2]/div/input")
	WebElement pinterestent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[16]/div[2]/div/input")
	WebElement redditent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[17]/div[2]/div/input")
	WebElement quoraent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[18]/div[2]/div/input")
	WebElement dribbleent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[19]/div[2]/div/input")
	WebElement vimeoent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[20]/div[2]/div/input")
	WebElement spotifyent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[21]/div[2]/div/input")
	WebElement playstoreent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/form/div/div[2]/div/input")
	WebElement appstoreent;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div/div[26]/img")
	WebElement bank;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div/div[27]/img")
	WebElement gp;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div/div[28]/img")
	WebElement phpe;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div/div[29]/img")
	WebElement paytm;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div/div/div[30]/img")
	WebElement qrcode;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/div[1]/div/div[1]/input")
	WebElement accounttype;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/div[1]/div/div[2]/input")
	WebElement bankname;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/div[1]/div/div[3]/input")
	WebElement acnumber;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/div[1]/div/div[4]/input")
	WebElement acifsc;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/div[1]/div/div[5]/input")
	WebElement branch;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/div[2]/div/div/input")
	WebElement gpnumber;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/div[3]/div/div/input")
	WebElement phnpenumber;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/div[4]/div/div/input")
	WebElement paytym;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/form/div/div/div[1]/input")
	WebElement qrname;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div/div[3]/div[8]/div[22]/div/form/div/div/div[2]/input")
	WebElement qrupiid;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/a[2]")
	WebElement design;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[1]/div[1]/div/div/div")
	WebElement choose1;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/div/div")
	WebElement choose2;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[3]/div[1]/div/div/div/div")
	WebElement choose3;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[4]/div[1]/div/div/div/div")
	WebElement choose4;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[5]/div[1]/div/div/div/div")
	WebElement choose5;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[6]/div[1]/div/div/div/div")
	WebElement choose6;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[7]/div[1]/div/div/div/div")
	WebElement choose7;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[8]/div[1]/div/div/div/div")
	WebElement choose8;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[9]/div[1]/div/div/div/div")
	WebElement choose9;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[10]/div[1]/div/div/div/div")
	WebElement choose10;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[11]/div[1]/div/div/div/div")
	WebElement choose11;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[12]/div[1]/div/div/div/div")
	WebElement choose12;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[13]/div[1]/div/div/div/div")
	WebElement choose13;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[14]/div[1]/div/div/div/div")
	WebElement choose14;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[15]/div[1]/div/div/div/div")
	WebElement choose15;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[16]/div[1]/div/div/div/div")
	WebElement choose16;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[17]/div[1]/div/div/div/div")
	WebElement choose17;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[18]/div[1]/div/div/div/div")
	WebElement choose18;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[19]/div[1]/div/div/div/div")
	WebElement choose19;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[20]/div[1]/div/div/div/div")
	WebElement choose20;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[21]/div[1]/div/div/div/div")
	WebElement choose21;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[22]/div[1]/div/div/div/div")
	WebElement choose22;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[23]/div[1]/div/div/div/div")
	WebElement choose23;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[24]/div[1]/div/div/div/div")
	WebElement choose24;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[25]/div[1]/div/div/div/div")
	WebElement choose25;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[26]/div[1]/div/div/div/div")
	WebElement choose26;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[27]/div[1]/div/div/div/div")
	WebElement choose27;
	
	@FindBy(xpath="//div[@class='text-end']//button[1]")
	WebElement chscancel;
	
	@FindBy(xpath="//div[@class='text-end']//button[2]")
	WebElement chsok;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/a[1]/span")
    WebElement back;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/a[2]")
	WebElement back2;
	
	
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
	
	public void Clicknewcard()
	{
		try {
		newcard.click();
		}catch(Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", newcard);
		}
	}
	public void setcardname(String crdname)
	{
		cardname.sendKeys(crdname);
	}
	
	public void setphoto() throws InterruptedException, AWTException
	{
		 Thread.sleep(1000);
		  photo.click();
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
	public void setpdf() throws InterruptedException, AWTException
	{
		 Thread.sleep(2000);
		  photo.click();
		  Thread.sleep(2000);
		   String file="J:\\Testing\\Manual Testing Questions.pdf";
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
	public void clickcolor()
	{
		color.click();
	}
	public void clickallcolor()
	{
		allcolor.click();
	}
	public void clickyellow()
	{
		yellow.click();
	}
	public void setfirstname(String frstname)
	{
		firstname.sendKeys(frstname);
	}
	
	public void settitle(String title1)
	{
		title.sendKeys(title1);
	}
	
	public void seteducation(String edu)
	{
		education.sendKeys(edu);
	}
	
	public void setdepartment(String dep)
	{
		department.sendKeys(dep);
	}
	
	public void Setcompany(String company1)
	{
		company.sendKeys(company1);
	}
	
	public void setbio(String bio1)
	{
		bio.sendKeys(bio1);
	}
	
	public void setcity(String city1)
	{
		city.sendKeys(city1);
	}
	

	public void setpreview()
	{
		preview.click();
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
	public void setwhatsapp()
	{
		whatsapp.click();
	}
	public void setplaystore()
	{
		playstore.click();
	}
	public void setappstore()
	{
		appstore.click();
	}
	public void setaddress()
	{
		address.click();
	}
	public void setmap()
	{
		map.click();
	}
	public void setfb()
	{
		fb.click();
	}
	public void setinsta()
	{
		insta.click();
	}
	public void setlinkedin()
	{
		linkedin.click();
	}
	public void setyoutube()
	{
		youtube.click();
	}
	public void settwitter()
	{
		twitter.click();
	}
	public void setskype()
	{
		skype.click();
	}
	public void settelegram()
	{
		telegram.click();
	}
	public void setsnap()
	{
		snap.click();
	}
	public void setquora()
	{
		quora.click();
	}
	public void setreddit()
	{
		reddit.click();
	}
	public void pinterest()
	{
		pinterest.click();
	}
	public void setdribble()
	{
		dribble.click();
	}
	public void setvimeo()
	{
		vimeo.click();
	}
	public void setspotify()
	{
		spotify.click();
	}
	public void setphnnum(String phnum)
	{
		phnnum.sendKeys(phnum);
	}
	public void setemailent(String mail)
	{
		emailent.sendKeys(mail);
	}
	public void setwebsiteent(String web)
	{
		websiteent.sendKeys(web);
	}
	public void setwhatent(String wp)
	{
		whatent.sendKeys(wp);
	}
	public void setplaystoreent(String play)
	{
		playstoreent.sendKeys(play);
	}
	public void setappstoreent(String app)
	{
		appstoreent.sendKeys(app);
	}
	public void setlocation(String loc)
	{
		locationent.sendKeys(loc);
	}
	public void setmapent(String map)
	{
		mapent.sendKeys(map);
	}
	public void setfbent(String fb)
	{
		fbent.sendKeys(fb);
	}
	public void setinsent(String insta)
	{
		instaent.sendKeys(insta);
	}
	public void setlinkedent(String linkin)
	{
		linkedent.sendKeys(linkin);
	}
    public void setyoutubeent(String yp)
    {
    	youtubeent.sendKeys(yp);
    }
    public void settwitterent(String twit)
    {
    	twitterent.sendKeys(twit);
    }
    public void setskypeent(String skype)
    {
    	skypeent.sendKeys(skype);
    }
    public void settelegrament(String tel)
    {
    	telegrament.sendKeys(tel);
    }
    public void setsnapent(String snap)
    {
    	snapent.sendKeys(snap);
    }
    public void setquoraent(String quor)
    {
    	quoraent.sendKeys(quor);
    }
    public void setredditent(String reddit)
    {
    	redditent.sendKeys(reddit);
    }
    public void setpinterestent(String pin)
    {
    	pinterestent.sendKeys(pin);
    }
    public void setdribbleent(String drible)
    {
    	dribbleent.sendKeys(drible);
    }
    public void setvimeoent(String vime)
    {
    	vimeoent.sendKeys(vime);
    }
    public void setspotifyent(String spot)
    {
    	spotifyent.sendKeys(spot);//
    }
    public void setbank()
    {
    	bank.click();
    }
    public void setgp()
    {
    	gp.click();
    }
    public void setphnpe()
    {
    	phpe.click();
    }
    public void setpaytm()
    {
    	paytm.click();
    }
    public void setqrcode()
    {
    	qrcode.click();
    }
    public void setactype(String ac)
    {
    	accounttype.sendKeys(ac);
    }
    public void setbankname(String banknam)
    {
    	bankname.sendKeys(banknam);
    }
    public void setacnumber(String acnum)
    {
    	acnumber.sendKeys(acnum);
    }
    public void setacifsc(String ifsc)
    {
    	acifsc.sendKeys(ifsc);
    }
    public void setbranch(String branchs)
    {
    	branch.sendKeys(branchs);
    }
    public void setgpnumber(String gpnum)
    {
    	gpnumber.sendKeys(gpnum);
    }
    public void setphnpenumber(String phpenumbers)
    {
    	phnpenumber.sendKeys(phpenumbers);
    }
    public void setpaytym(String paytm)
    {
    	paytym.sendKeys(paytm);
    }
    public void setqrname(String name)
    {
    	qrname.sendKeys(name);
    }
    public void setqrupi(String up)
    {
    	qrupiid.sendKeys(up);
    }
    public void setdesign()
    {
    	design.click();
    }
    public void click1()
    {
    	choose1.click();
    	
    }
    public void click2()
    {
    	choose2.click();
    }
    public void click3()
    {
    	choose3.click();
    }
    public void click4()
    {
    	choose4.click();
    }
    public void click5()
    {
    	choose5.click();
    }
    public void click6()
    {
    	choose6.click();
    }
    public void click7()
    {
    	choose7.click();
    }
    public void click8()
    {
    	choose8.click();
    }
    public void click9()
    {
    	choose9.click();
    }
    public void click10()
    {
    	choose10.click();
    }
    public void click11()
    {
    	choose11.click();
    }
    public void click12()
    {
    	choose12.click();
    }
    public void click13()
    {
    	choose13.click();
    }
    public void click14()
    {
    	choose14.click();
    }
    public void click15()
    {
    	choose15.click();
    }
    public void click16()
    {
    	choose16.click();
    }
    public void click17()
    {
    	choose17.click();
    }
    public void click18()
    {
    	choose18.click();
    }
    public void click19()
    {
    	choose19.click();
    }
    public void click20()
    {
    	choose20.click();
    }
    public void click21()
    {
    	choose21.click();
    }
    public void click22()
    {
    	choose22.click();
    }
    public void click23()
    {
    	choose23.click();
    }
    public void click24()
    {
    	choose24.click();
    }
    public void click25()
    {
    	choose25.click();
    }
    public void click26()
    {
    	choose26.click();
    }
    public void click27()
    {
    	choose27.click();
    }
    public void setchscancel()
    {
    	try {
    	chscancel.click();
    	} catch(Exception e) {
    		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", chscancel);
    	}

    }
    public void setchsok()
    {
    	try {
    	chsok.click();
    	} catch (Exception e)
    	{
    		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", chsok);
    	}
    }
    public void clickback()
    {
    	back.click();
    }
    public void clickback2()
    {
    	back2.click();
    }

}
