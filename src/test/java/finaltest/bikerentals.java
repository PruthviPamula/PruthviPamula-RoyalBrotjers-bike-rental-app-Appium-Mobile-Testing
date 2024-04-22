package finaltest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class bikerentals extends capabilities {
	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void t1() throws MalformedURLException {
     driver = T1();
     
	}
     @Test
     public void test1() throws InterruptedException, IOException {
    	 System.out.println("Royal Brothers App opened");
    	 Thread.sleep(10000);
    	 driver.findElementByClassName("android.widget.TextView").click();
    	 Thread.sleep(10000);
    	 driver.findElement(MobileBy.xpath("//*[@text='BANGALORE']")).click();
    	 Thread.sleep(5000);
    	 AndroidElement a1= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VIEW ALL\"))");
    	 Thread.sleep(10000);
    	 a1.click();
    	 Thread.sleep(3000);
    	 driver.findElement(MobileBy.xpath("//*[@text='7 DAYS']")).click();
    	 Thread.sleep(3000);
    	 AndroidElement ae = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"BOOK NOW\"))");
    	 Thread.sleep(3000);
    	 ae.click();
    	 Thread.sleep(3000);
    	 List<AndroidElement> select = driver.findElements(By.className("android.widget.TextView"));
    	 System.out.println(select.size());
 		 select.get(2).click();
 		 Thread.sleep(3000);
 		 List<AndroidElement> select1=driver.findElements(By.className("android.view.ViewGroup"));
 		 System.out.println(select1.size());
 		 select1.get(4).click();
 		 driver.findElement(MobileBy.xpath("//*[@text='4']")).click();
 		 Thread.sleep(3000);
 		 driver.findElement(MobileBy.xpath("//*[@text='08:00 AM']")).click();
 		 Thread.sleep(3000);
 		 driver.findElement(MobileBy.xpath("//*[@text='10']")).click();
 		 Thread.sleep(3000);
 		 driver.findElement(MobileBy.xpath("//*[@text='09:00 AM']")).click();
 		 Thread.sleep(3000);
 		 driver.findElement(MobileBy.xpath("//*[@text='CHECK AVAILABILITY']")).click();      
 		 Thread.sleep(3000);
 		 driver.pressKey(new KeyEvent(AndroidKey.BACK)); 
		 Thread.sleep(3000); 
		 driver.findElement(MobileBy.xpath("//*[@text='HOME']")).click();
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.xpath("//*[@text='Offers']")).click();
		 Thread.sleep(3000);
		 driver.pressKey(new KeyEvent(AndroidKey.BACK)); 
		 Thread.sleep(3000); 
		 driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();          
		 Thread.sleep(3000); 
		 AndroidElement  ae1= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Search by Model\"))");
		 ae1.click();
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//*[@text='Honda Activa 6G']")).click();
		 TakesScreenshot ss=(TakesScreenshot)driver; //telling the webdriver to take a screenshot
		 File jpnng=ss.getScreenshotAs(OutputType.FILE);//storing the screenshot taken in a file
		 FileUtils.copyFile(jpnng, new File("C:\\Users\\pruth\\Pictures\\raama.png"));
		 Thread.sleep(3000);
		 driver.pressKey(new KeyEvent(AndroidKey.HOME));
 		
}

} 

