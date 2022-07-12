package com.genericlib;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DriverUtils {
	
	TouchAction<?> action;
	Dimension size;
	DesiredCapabilities dc=new DesiredCapabilities();
	
	
	public boolean isAppInstalled(AndroidDriver<?> driver,String appPackage)
	{
		  return driver.isAppInstalled(appPackage);
	}
	
	public void uninstall_App(AndroidDriver<?> driver,String appPackage)
	{
		  driver.removeApp(appPackage);
	}
	
	public void switchApp(AndroidDriver<?> driver,String appPackage, String appActivity) 
	{
		
		  //driver.startActivity(appPackage, appActivity);
	} 
	
	public void bottomToTopSwipe(AndroidDriver<?> driver) 
	{
		Dimension dimension = driver.manage().window().getSize();
        int start_x =(int) (dimension.width * 0.5);
        int start_y =(int) (dimension.height * 0.8);
        
        int end_x=(int) (dimension.width * 0.5);
        int end_y=(int) (dimension.height * 0.2);
        
        TouchAction action=new TouchAction(driver);
        action.press(PointOption.point(start_x,start_y))
        		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        		.moveTo(PointOption.point(end_x,end_y)).release().perform();
	}
	
	public void topToBottomSwipe(AndroidDriver<?> driver)
	{
		size = driver.manage().window().getSize();
        int start_x = (int) (size.width * 0.5);
        int start_y = (int) (size.height * 0.2);
        
        int end_x = (int) (size.width * 0.5);
        int end_y = (int) (size.height * 0.8);
        TouchAction act=new TouchAction(driver);
        act.press(PointOption.point(start_x, start_y))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(PointOption.point(end_x, end_y)).release().perform();
	 }
	
	public void rightLeftSwipe(AndroidDriver<?> driver,int timeduration) 
	{
          size = driver.manage().window().getSize();
		  System.out.println(size);
		  int startx = (int) (size.width * 0.70);
		  int endx = (int) (size.width * 0.30);
		  int starty = size.height / 2;
		  System.out.println("Start swipe operation");
		  //driver.swipe(startx, starty, endx, starty, timeduration);
		  
    }
	
	public void leftRightSwipe(AndroidDriver<?> driver,int timeduration)
	{
		  // duration should be in milliseconds
		  size = driver.manage().window().getSize();
		  System.out.println(size);
		  int startx = (int) (size.width * 0.70);
		  int endx = (int) (size.width * 0.30);
		  int starty = size.height / 2;
		  System.out.println("Start swipe operation");
		  //driver.swipe(endx, starty, startx, starty, timeduration);
    }
	
	public void swipelByPercentage(AndroidDriver driver,double d,double e,double f,double g)
	{
	Dimension dimension = driver.manage().window().getSize();
    int start_x =(int) (dimension.width * d);
    int start_y =(int) (dimension.height * e);
    
    int end_x=(int) (dimension.width * f);
    int end_y=(int) (dimension.height * g);
    
    TouchAction action=new TouchAction(driver);
    action.press(PointOption.point(start_x,start_y))
    		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
    		.moveTo(PointOption.point(end_x,end_y)).release().perform();
	}
	
	public MobileElement swipeHorizontalyToEnd(AndroidDriver driver, String locatorType, String viewIdentificator)
	{
	    WebElement element = driver.findElement(MobileBy
	            .AndroidUIAutomator("new UiScrollable(new UiSelector()."+locatorType+"(\""+viewIdentificator+"\")).setAsHorizontalList()." +
	                    "scrollToEnd();"));
	    return (MobileElement) element;
	}
	
	public void scrollToElement(AndroidDriver driver,String text)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).new UiSelector().textContains(\"" + text + "\").instance(0))").click();
	}
	
	public void hidekeyboard(AndroidDriver driver)
	{
		driver.hideKeyboard();
	}
	
	public void tapOnElement(AndroidDriver driver,WebElement element)
	{
		TouchActions action = new TouchActions(driver);
		action.singleTap(element);
		action.perform();
    }
	
    public void taByCoordinates(AndroidDriver driver,int x, int y, long seconds)
    {
    	action=new TouchAction(driver);
				action.press(PointOption.point(x, y))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))
				.release()
				.perform();
				
	}
	
	public void doubleClick(AndroidDriver driver,WebElement element) 
	{
		TouchActions action = new TouchActions(driver);
		action.doubleClick(element);
		action.perform();
	}
	
	public void pressKeyCode(AndroidKey code)
	{
	    PressesKey androidDriver = null;
		androidDriver.pressKey(new KeyEvent(code));
    }
	
	public void longPressKeyCode(AndroidKey code)
	{
        PressesKey androidDriver = null;
		androidDriver.longPressKey(new KeyEvent(code));
    }
	
	public void multiTouchAction(AndroidDriver driver)
	{
	TouchAction actionOne = new TouchAction(driver);
	actionOne.press(PointOption.point(10, 10));
	actionOne.moveTo(PointOption.point(10, 100));
	actionOne.release();
	TouchAction actionTwo = new TouchAction(driver);
	actionTwo.press(PointOption.point(20, 20));
	actionTwo.moveTo(PointOption.point(20, 200));
	actionTwo.release();
	MultiTouchAction action = new MultiTouchAction(driver);
	action.add(actionOne);
	action.add(actionTwo);
	action.perform();
	}
	
	public void dragAndDrop(AndroidDriver driver,int start_x,int start_y,int end_x,int end_y)
	{
		TouchAction act=new TouchAction(driver);
		act.press(PointOption.point(start_x, start_y))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(PointOption.point(end_x, end_y)).release().perform();
	}
	
    public void runAppInBackgroung(AndroidDriver driver,Duration value)
    {
    	driver.runAppInBackground(value);
    }
    
    public void openNotifications(AndroidDriver driver)
    {
    	driver.openNotifications();
    }
    
    public void toastMessage(AndroidDriver driver,String text)
    {
    	driver.findElementByXPath("//android.widget.Toast[1]").getAttribute(text);
    }
    
    public void openWebApp(AndroidDriver<?> driver,String browserName,String url)
    {
    	dc.setCapability("browserName",browserName);
    	driver.get(url);
    }
    
    public void switchFromlocalToWebApp(AndroidDriver<?> driver,String appPackage)
    {
    	Set<String> windows = driver.getContextHandles();
        for(String win:windows)
        {
        	System.out.println(win);
        }
        driver.context("WEBVIEW_"+appPackage);
    }
    
    public void logs()
    {
    	AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
    	service.start();
    	service.stop();
    }
    
    public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(AutoConstant.implicitwait,TimeUnit.SECONDS);
	}
	
	
	
	
}

