package HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericlib.BaseClass;
import com.genericlib.DriverUtils;
import com.objectrepo.HomePageMenuBarPage;

public class Menu extends BaseClass {
	
	DriverUtils utils=new DriverUtils();
	HomePageMenuBarPage hpm;
	@Test
	public void homePagemenu() throws InterruptedException
	{
//		hpm = new HomePageMenuBarPage(driver);
		hpm = PageFactory.initElements(driver, HomePageMenuBarPage.class);
		Thread.sleep(3000);
		
//		hpm.clickwomen();
//		driver.findElementByXPath("//android.widget.TextView[@text='Women']").click();
//		Assert.assertTrue(hpm.getPantaloons_logo().isDisplayed());
//		System.out.println("Pantaloons logo is displayed");
//		
//		Assert.assertTrue(hpm.getSearch_icon().isDisplayed());
//		System.out.println("Search icon is displayed");
//		
//		Assert.assertTrue(hpm.getNotification_icon().isDisplayed());
//		System.out.println("Notification icon is displayed");
//
//		Assert.assertTrue(hpm.getWishlist_icon().isDisplayed());
//		System.out.println("Wishlist icon is displayed");
//
//		Assert.assertTrue(hpm.getMybag_icon().isDisplayed());
//		System.out.println("My bag icon is displayed");
//		
//		String newarrivals=hpm.getNewarrivals_option().getText();
//		Assert.assertEquals(newarrivals, "New Arrivals");
//		System.out.println("New Arrivals option is present");
		
		String womens = hpm.getWomens_option().getText();
		Assert.assertEquals(womens, "Women");
		System.out.println("Women option is present "+ womens);
		
		String men = hpm.getMen_option().getText();
		Assert.assertEquals(men, "Men");
		System.out.println("Men option is present "+ men);
		
//		utils.swipeHorizontalyToEnd(driver, "text", "Kids");
//		
//		String kids = hpm.getKids_option().getText();
//		Assert.assertEquals(kids, "Kids");
//		System.out.println("Kids option is present");
//		
//		String homedecor = hpm.getHomedecor_option().getText();
//		Assert.assertEquals(homedecor, "Home Decor");
//		System.out.println("Home Decor option is present");
//		
//		String accessories = hpm.getAccessories_option().getText();
//		Assert.assertEquals(accessories, "Accessories");
//		System.out.println("Accessories option is present");
//		
//		String onlineonly = hpm.getOnlineonly_option().getText();
//		Assert.assertEquals(onlineonly, "Online Only");
		System.out.println("Online Only option is present");
		}
	
}
