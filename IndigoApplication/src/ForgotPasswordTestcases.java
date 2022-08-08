import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ForgotPasswordTestcases extends BaseIndigo{


	@Test (priority = 1)
	public void Insertwithoutusername() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
		
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("abc@gmail.com");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Forgot password?'")).click();
		driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPassword")).click();
		
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		System.out.println(driver.findElement(By.id("com.shireburn.indigo:id/txtUserNameError")).getText());
		/*
		String Confirmtext = driver.findElement(By.xpath("//android.widget.TextView[@text='Username is required.'")).getText();
		Assert.assertEquals("Username is required.", Confirmtext);
		*/
	}
	
	@Test (priority = 2)
	public void Recoverpassword() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
		
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("abc@gmail.com");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPassword")).click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Username']")).sendKeys("mis@narola.email");
		driver.findElementById("com.shireburn.indigo:id/textRecoverPassword").click();
		System.out.println(driver.findElementById("com.shireburn.indigo:id/txtRecoverPasswordSentMsg1").getText());
		
		/*
		String confirmtxt = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPasswordSentMsg1")).getText();
		Assert.assertEquals("A new link to change your password has been sent to your Indigo account email.", confirmtxt);
	*/
	}
	

}
