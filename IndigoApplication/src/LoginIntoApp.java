import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginIntoApp extends BaseIndigo{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//tagname[@attribute='value']
		
		
		
		//To click on the button "Login with your Indigo username"
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
		
		//driver.findElementByXPath("//*[text='Log in to your Indigo account']").click();
		//Thread.sleep(5000);
		//To click on the Username field on Login with your indigo username screen and insert the value
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("mis@narola.email");
		
		//To click on the "Continue" button
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		//To insert the password
		driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Narol@123!!!");
		
		//To click on the "Continue" button
		//driver.findElementByXPath("//android.widget.Button[@text='Continue'").click();
		driver.findElementById("com.shireburn.indigo:id/btnConstraint").click();
		
		Thread.sleep(20000);
		//To Agree the Terms and Condition
		driver.findElementByXPath("//android.widget.Button[@text='AGREE']").click();
		
		//To Save the password on google
		//driver.findElementByXPath("//android.widget.Button[@text='Not now']").click();
		
		
		//To dial an access code
		driver.findElementById("com.shireburn.indigo:id/etCode1").sendKeys("1");
		driver.findElementById("com.shireburn.indigo:id/etCode2").sendKeys("2");
		driver.findElementById("com.shireburn.indigo:id/etCode3").sendKeys("3");
		driver.findElementById("com.shireburn.indigo:id/etCode4").sendKeys("4");
		
		//To click on the Done button
		driver.findElementByXPath("//android.widget.TextView[@text='Set Access Code']").click();
		
		//To allow access the location permission
		driver.findElementById("com.shireburn.indigo:id/btnAcceptTerms").click();
		
		driver.findElementByXPath("//android.widget.Button[@text='While using the app']").click();
		
		System.out.println("User logged in successfully");
		

	}

}
