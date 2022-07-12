package HomePage;

import org.testng.annotations.Test;

import com.genericlib.BaseClass;
import com.genericlib.DriverUtils;
import com.objectrepo.LoginPage;

import io.appium.java_client.android.AndroidElement;

public class Account extends BaseClass{
	
	@Test
	
	public void account() throws InterruptedException
	{
		DriverUtils utils=new DriverUtils();
//		LoginPage lp=new LoginPage(driver);
		driver.findElementByXPath("//android.widget.Button[@content-desc='Profile, tab, 5 of 5']").click();
		for(int i=2;i<=7;i++)
		{
			AndroidElement accountoptions = (AndroidElement) driver.findElementByXPath("(//android.widget.ScrollView//android.widget.TextView)["+i+"]");
			                                                         
			String accountopttexts = accountoptions.getText();
			accountoptions.click();
			String options_text = driver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView").getText();
			System.out.println("Landed on "+options_text);
			driver.navigate().back();
			Thread.sleep(3000);
		}
		utils.bottomToTopSwipe(driver);
		
		
//		lp.getProfile_button().click();
//		String welcometext = lp.getWelcome_text().getText();
//		System.out.println(welcometext);
//		lp.getMyorders_option().getText();
//		lp.getWishlist_option().getText();
//		lp.getAccountandinformation_option().getText();
//		lp.getAddresses_option().getText();
//		lp.getPantaloonscredit_option().getText();
//		lp.getGreencard_option().getText();
		
		
		
	}
	
	
	
	

}
