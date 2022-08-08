import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;



public class AddClocking extends BaseIndigo{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text='Log in to your Indigo account']").click();
		
		//driver.findElementByXPath("//android.widget.Button[@text='Log in to your Indigo account']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("mis@narola.email");
		driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
		driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Narol@123!!!");
		driver.findElementById("com.shireburn.indigo:id/btnLogin").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@text='Agree']").click();
		
				
		driver.findElementById("com.shireburn.indigo:id/etCode1").sendKeys("1");
		driver.findElementById("com.shireburn.indigo:id/etCode2").sendKeys("2");
		driver.findElementById("com.shireburn.indigo:id/etCode3").sendKeys("3");
		driver.findElementById("com.shireburn.indigo:id/etCode4").sendKeys("4");
		
		driver.findElementByXPath("//android.widget.Button[@text='Done']").click();
		driver.findElementById("com.shireburn.indigo:id/btnAccept").click();
		driver.findElementByXPath("//android.widget.Button[@text='While using the app']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='My Schedule']").click();
		Thread.sleep(5000);
		driver.findElementsById("com.shireburn.indigo:id/imgArrow").get(1).click();
		
		/*
		TouchAction t= new TouchAction(driver);
		WebElement slide= driver.findElementById("com.shireburn.indigo:id/ivSlider");
		t.longPress(longPressOptions().withElement(element(slide)).withDuration(ofSeconds(2))).moveTo(element(slide)).release().perform();
		*/
	
		
		

	}

}
