package com.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;

public class HomePageMenuBarPage {
	public AndroidDriver<AndroidElement> driver;
	
//	public HomePageMenuBarPage(AndroidDriver<AndroidElement> driver)
//	{
//		
//		PageFactory.initElements(driver, this);
//	}
	@FindBy(xpath="//android.widget.HorizontalScrollView/android.view.ViewGroup//android.widget.TextView")
	private WebElement mainCat;
	
	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup//android.widget.TextView")
	private WebElement subCat;
	
	
	public WebElement getMainCat() {
		return mainCat;
	}

	public WebElement getSubCat() {
		return subCat;
	}

	@FindBy(xpath="//android.widget.TextView[@text='1st time on Discount")
	private WebElement firsttime_discount;
	
	public WebElement getFirsttime_discount() {
		return firsttime_discount;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='BLACK FRIDAY SALE - FIRST TIME ON SALE']")
	private WebElement firsttimediscount_subCat;

	public WebElement getFirsttimediscount_subCat() {
		return firsttimediscount_subCat;
	}

	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement pantaloons_logo;

	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView[1]")
	private WebElement search_icon;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView[2]")
	private WebElement notification_icon;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
	private WebElement wishlist_icon;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]")
	private WebElement mybag_icon;
	
	@FindBy(xpath="//android.widget.TextView[@text='New Arrivals']")
	private WebElement newarrivals_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='Women']")
	private WebElement womens_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='Men']")
	private WebElement men_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='Kids']")
	private WebElement kids_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='Home Decor']")
	private WebElement homedecor_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='Accessories']")
	private WebElement accessories_option;
	
	@FindBy(xpath="//android.widget.TextView[@text='Online Only']")
	private WebElement onlineonly_option;
	
	public WebElement getPantaloons_logo() {
		return pantaloons_logo;
	}

	public WebElement getSearch_icon() {
		return search_icon;
	}

	public WebElement getNotification_icon() {
		return notification_icon;
	}

	public WebElement getWishlist_icon() {
		return wishlist_icon;
	}

	public WebElement getMybag_icon() {
		return mybag_icon;
	}

	public WebElement getNewarrivals_option() {
		return newarrivals_option;
	}

	public WebElement getWomens_option() {
		return womens_option;
	}

	public WebElement getMen_option() {
		return men_option;
	}

	public WebElement getKids_option() {
		return kids_option;
	}

	public WebElement getHomedecor_option() {
		return homedecor_option;
	}

	public WebElement getAccessories_option() {
		return accessories_option;
	}

	public WebElement getOnlineonly_option() {
		return onlineonly_option;
	}
	
	public void clickwomen()
	{
		womens_option.click();
	}
	
	@AndroidBy(xpath="//android.widget.TextView[@text='New Arrivals']")
	private WebElement newarrivals_women;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='T Shirts']")
	private WebElement tshirts_women;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Dress']")
	private WebElement dress_women;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Kurta']")
	private WebElement kurta_women;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Jeans']")
	private WebElement jeans_women;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Sleepwear']")
	private WebElement sleepwear_women;
	
	

	public WebElement getNewarrivals_women() {
		return newarrivals_women;
	}

	public WebElement getTshirts_women() {
		return tshirts_women;
	}

	public WebElement getDress_women() {
		return dress_women;
	}

	public WebElement getKurta_women() {
		return kurta_women;
	}

	public WebElement getJeans_women() {
		return jeans_women;
	}

	public WebElement getSleepwear_women() {
		return sleepwear_women;
	}

	@FindBy(xpath="//android.widget.TextView[@text='New Arrivals']")
	private WebElement newarrivals_men;
	
	@FindBy(xpath="//android.widget.TextView[@text='T Shirts']")
	private WebElement tshirts_men;
	
	@FindBy(xpath="//android.widget.TextView[@text='Shirts']")
	private WebElement shirts_men;
	
	@FindBy(xpath="//android.widget.TextView[@text='Jeans']")
	private WebElement jeans_men;
	
	@FindBy(xpath="//android.widget.TextView[@text='Kurta']")
	private WebElement kurta_men;
	
	@FindBy(xpath="//android.widget.TextView[@text='Online Only']")
	private WebElement onlineonly_men;

	public WebElement getNewarrivals_men() {
		return newarrivals_men;
	}

	public WebElement getTshirts_men() {
		return tshirts_men;
	}

	public WebElement getShirts_men() {
		return shirts_men;
	}

	public WebElement getJeans_men() {
		return jeans_men;
	}

	public WebElement getKurta_men() {
		return kurta_men;
	}

	public WebElement getOnlineonly_men() {
		return onlineonly_men;
	}
	
	@AndroidBy(xpath="//android.widget.TextView[@text='New Arrivals']")
	private WebElement newarrivals_kids;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Dresses']")
	private WebElement dresses_kids;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Jeans']")
	private WebElement jeans_kids;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Shorts']")
	private WebElement shorts_kids;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Baby']")
	private WebElement baby_kids;
	
	@AndroidBy(xpath="//android.widget.TextView[@text='Online Only']")
	private WebElement onlineonly_kids;

	public WebElement getNewarrivals_kids() {
		return newarrivals_kids;
	}

	public WebElement getDresses_kids() {
		return dresses_kids;
	}

	public WebElement getJeans_kids() {
		return jeans_kids;
	}

	public WebElement getShorts_kids() {
		return shorts_kids;
	}

	public WebElement getBaby_kids() {
		return baby_kids;
	}

	public WebElement getOnlineonly_kids() {
		return onlineonly_kids;
	}
	
	public void mainCat(int i)
	{
		String mainCat=driver.findElementByXPath("(//android.widget.HorizontalScrollView/android.view.ViewGroup//android.widget.TextView)["+i+"]").getText();
	}
	
	public void subCat(int j)
	{
		driver.findElementByXPath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup//android.widget.TextView)["+j+"]");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
}
