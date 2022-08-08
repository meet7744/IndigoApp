import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Logout extends BaseIndigo{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text='Log in to your Indigo account']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("mis@narola.email");
		driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
		driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Narol@123!!!");
		driver.findElementById("com.shireburn.indigo:id/btnLogin").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Agree']").click();
		
		/*
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		*/
		
		driver.findElementById("com.shireburn.indigo:id/etCode1").sendKeys("1");
		driver.findElementById("com.shireburn.indigo:id/etCode2").sendKeys("2");
		driver.findElementById("com.shireburn.indigo:id/etCode3").sendKeys("3");
		driver.findElementById("com.shireburn.indigo:id/etCode4").sendKeys("4");
		
		driver.findElementByXPath("//android.widget.Button[@text='Done']").click();
		driver.findElementById("com.shireburn.indigo:id/btnAccept").click();
		driver.findElementByXPath("//android.widget.Button[@text='While using the app']").click();
		
		
		driver.findElementById("com.shireburn.indigo:id/cvUserImage").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Logout']").click();
		driver.findElementById("android:id/button1").click();
		
		
		System.out.println("User logged out successfully");
		

	}

}
