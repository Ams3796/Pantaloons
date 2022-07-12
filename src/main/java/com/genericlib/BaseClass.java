package com.genericlib;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.objectrepo.LoginPage;

import io.appium.java_client.android.AndroidDriver;



public class BaseClass implements AutoConstant {

	public AndroidDriver<WebElement> driver;
	public static AndroidDriver<WebElement> staticdriver;
	DriverUtils util=new DriverUtils();
	ReadData_PropertyFile prop=new ReadData_PropertyFile();
	DesiredCapabilities dc=new DesiredCapabilities();
	
	@BeforeClass
	public void setUp() throws IOException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "realme 8i");
		dc.setCapability("automationName", "UiAutomator2");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11");
		dc.setCapability("UDID", "BUNN895T69TSIZPR");
		dc.setCapability("appPackage", "com.justdial.search");
		dc.setCapability("appActivity", "com.pantaloons.MainActivity");
		dc.setCapability("noReset", "true");
		dc.setCapability("autoGrantPermissions", "true");
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver<WebElement>(url,dc);
		util.implicitwait(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		//LoginPage lp=new LoginPage(driver);
		//lp.getProfile_button().click();
        //lp.getMobilenumber_field().sendKeys(AutoConstant.mobilenumber);
        //lp.getGetotp_button().click();
        //lp.getStartshopping_button().click();
        //String text=lp.getWelcome_text().getText();
        //Assert.assertEquals(text, "Welcome, Amaya !");
        //lp.getHome_button().click();
		
//		driver.findElementByXPath("//android.widget.Button[@content-desc='Profile, tab, 5 of 5']").click();
//		driver.findElementByXPath("//android.widget.EditText[@text='Enter mobile number']").sendKeys(AutoConstant.mobilenumber);
//		driver.findElementByXPath("//android.widget.TextView[@text='GET OTP']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='START SHOPPING']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='START SHOPPING']").click();
//		String text = driver.findElementByXPath("//android.widget.TextView[contains(@text,'Welcome')]").getText();
//		System.out.println(text);
//		driver.findElementByXPath("//android.widget.Button[@content-desc=', tab, 3 of 5']").click();
		System.out.println("Started");
	}
	
	
    @AfterMethod
    public void afterMethod()
    {
    	System.out.println("Closed");
    }
    
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }

}
