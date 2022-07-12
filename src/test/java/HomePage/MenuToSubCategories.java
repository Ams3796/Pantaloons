package HomePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericlib.BaseClass;
import com.genericlib.DriverUtils;
import com.objectrepo.HomePageMenuBarPage;

import io.appium.java_client.android.AndroidElement;

public class MenuToSubCategories extends BaseClass {
	
	HomePageMenuBarPage hpm;
	@Test
	public void subcategory() throws InterruptedException
	{
		DriverUtils utils=new DriverUtils();
		hpm = PageFactory.initElements(driver, HomePageMenuBarPage.class);
		
		hpm.getFirsttime_discount().click();
		String firsttimediscount_subCat = hpm.getFirsttimediscount_subCat().getText();
		Assert.assertEquals(firsttimediscount_subCat, "BLACK FRIDAY SALE - FIRST TIME ON SALE'");
		driver.navigate().back();
				
//		Thread.sleep(5000);
//		AndroidElement firstCat=driver.findElementByXPath("//android.widget.TextView[@text='1st time on Discount']");
//		firstCat.click();
//		String firstsubtext = driver.findElementByXPath("//android.widget.TextView[@text='BLACK FRIDAY SALE - FIRST TIME ON SALE']").getText();
//		Assert.assertEquals(firstsubtext, "BLACK FRIDAY SALE - FIRST TIME ON SALE");
//		driver.navigate().back();
				
		for(int i=2;i<=4;i++)
		{
			//hpm.mainCat(i);
			
			AndroidElement mainCat = (AndroidElement) driver.findElementByXPath("(//android.widget.HorizontalScrollView/android.view.ViewGroup//android.widget.TextView)["+i+"]");
			String mainName=mainCat.getText();
			mainCat.click();
			Thread.sleep(5000);
			List l= new ArrayList();
			for(int j=1;j<=6;j++)
			{
				String text=driver.findElementByXPath("(//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup//android.widget.TextView)["+j+"]").getText();
				l.add(text);
			}
			driver.navigate().back();
			Thread.sleep(5000);
		    System.out.println("subcategories available under "+mainName+" are "+l);	
		}
		
		Thread.sleep(10000);
        for(int i=1;i<=2;i++)
        {
        	utils.swipelHorizontallyByPercentage(driver, 0.95, 0.25, 0.05, 0.25);
            System.out.println("Swipped");	
//			Dimension dimension = driver.manage().window().getSize();
//	        int start_x =(int) (dimension.width * 0.95);
//	        int start_y =(int) (dimension.height * 0.25);
//	        
//	        int end_x=(int) (dimension.width * 0.05);
//	        int end_y=(int) (dimension.height * 0.25);
//	        
//	        TouchAction action=new TouchAction(driver);
//	        action.press(PointOption.point(start_x,start_y))
//	        		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
//	        		.moveTo(PointOption.point(end_x,end_y)).release().perform();
//            System.out.println("Swipped");
//            Thread.sleep(5000);
        }
            
        for(int i=2;i<=3;i++)
         {
        	AndroidElement mainCat = (AndroidElement) driver.findElementByXPath("(//android.widget.HorizontalScrollView/android.view.ViewGroup//android.widget.TextView)["+i+"]");
        	String mainName = mainCat.getText();
        	mainCat.click();
        	List l=new ArrayList();
        	for(int j=1;j<=6;j++)
        	{
        		String text=driver.findElementByXPath("(//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup//android.widget.TextView)["+j+"]").getText();
				l.add(text);
        	}
        	driver.navigate().back();
        	Thread.sleep(3000);
        	System.out.println("Sub Categories in "+mainName+" : "+l);
         }
	}
}

