package org.muviereck.TestCase;

import org.apache.commons.lang3.RandomStringUtils;
import org.muviereck.pageObjects.SignUpLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseurl="https://digitalcard.yetloapps.com/user-login";
	public static WebDriver driver;
	public SignUpLogin sp;
	
	@BeforeClass
    public void setup()
    {
		ChromeOptions co =new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver2.exe");
		driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		
    }

	public static String randomestring(){
		
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}
	
    public static String randomestring1(){
		
		String generatedString2=RandomStringUtils.random(5);
		return(generatedString2);
	}

//	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}

}
