package finaltest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabilities {
	 public static AndroidDriver<AndroidElement> T1() throws MalformedURLException {
   	  
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.royalbrothers");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.royalbrothers.MainActivity");
			//automation name for ANDROID AUTOMATOR
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(MobileCapabilityType.NO_RESET,true);
			
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL ("http://0.0.0.0:4723/wd/hub"),dc);
			return driver;
		      }
		}


