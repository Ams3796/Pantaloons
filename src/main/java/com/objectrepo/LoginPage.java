package com.objectrepo;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.genericlib.AutoConstant;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;

public class LoginPage {
	
	public LoginPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@AndroidBy(xpath="//android.widget.Button[@content-desc='Profile, tab, 5 of 5']")
	private AndroidElement profile_button;

	@AndroidBy(xpath="//android.widget.EditText[@text='Enter mobile number']")
	private AndroidElement mobilenumber_field;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='GET OTP']")
	private AndroidElement getotp_button;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='START SHOPPING']")
	private AndroidElement startshopping_button;
	
	@AndroidBy(xpath="//android.widget.TextView[contains(@text,'Welcome, Amaya !')]")
	private AndroidElement welcome_text;
	
	@AndroidBy(xpath="//android.widget.Button[@content-desc=', tab, 3 of 5']")
	private AndroidElement Home_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='MY ORDERS']")
	private AndroidElement myorders_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='WISHLIST']")
	private AndroidElement wishlist_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='ACCOUNT & INFORMATION']")
	private AndroidElement accountandinformation_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='ADDRESSES']")
	private AndroidElement addresses_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='PANTALOONS CREDITS']")
	private AndroidElement pantaloonscredit_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='GREENCARD']")
	private AndroidElement greencard_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='CUSTOMER SUPPORT']")
	private AndroidElement customersupport_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='SETTINGS']")
	private AndroidElement settings_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='REFER A FRIEND']")
	private AndroidElement referafriend_option;
	

	public AndroidElement getProfile_button() {
		return profile_button;
	}

	public AndroidElement getMobilenumber_field() {
		return mobilenumber_field;
	}

	public AndroidElement getGetotp_button() {
		return getotp_button;
	}

	public AndroidElement getStartshopping_button() {
		return startshopping_button;
	}

	public AndroidElement getWelcome_text() {
		return welcome_text;
	}

	public AndroidElement getHome_button() {
		return Home_button;
	}
	
	public AndroidElement getMyorders_option() {
		return myorders_option;
	}

	public AndroidElement getWishlist_option() {
		return wishlist_option;
	}

	public AndroidElement getAccountandinformation_option() {
		return accountandinformation_option;
	}

	public AndroidElement getAddresses_option() {
		return addresses_option;
	}

	public AndroidElement getPantaloonscredit_option() {
		return pantaloonscredit_option;
	}

	public AndroidElement getGreencard_option() {
		return greencard_option;
	}
	
	public void loginmethod(String mobilenumber)
	{
		profile_button.click();
		mobilenumber_field.sendKeys(AutoConstant.mobilenumber);
		getotp_button.click();
		startshopping_button.click();
		String text = welcome_text.getText();
		Assert.assertEquals(text, "Welcome, Amaya !");
		Home_button.click();
	}
	
	
	
	
}
