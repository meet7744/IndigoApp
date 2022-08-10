import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTestcases extends BaseIndigo{
	
	
	@Test (priority = 1)
	public void LoginWithoutInsertValue() throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		System.out.println(driver.findElement(By.id("com.shireburn.indigo:id/txtUserPlaceHolder")).getText());
	}
	
	@Test (priority = 2)
	public void LoginWithoutPassword() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
		
		//driver.findElementByXPath("//android.widget.TextView[@Text='Log in to your Indigo account']").click();
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("testusername");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		driver.findElementById("com.shireburn.indigo:id/btnConstraint").click();
		System.out.println(driver.findElementById("com.shireburn.indigo:id/txtPasswordPlaceHolder").getText());
		
			
	}
	
	
	@Test (priority = 3)
	public void InvalidCredentials() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
		
		//driver.findElementByXPath("//android.widget.TextView[@Text='Log in to your Indigo account']").click();
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("testusername");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		
		driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("password");
		driver.findElementById("com.shireburn.indigo:id/btnConstraint").click();
		
		//System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Invalid username or password. Please enter your credentials again.'")).getText());
		System.out.println(driver.findElementById("com.shireburn.indigo:id/txtLgnTitle").getText());
			
	}
	
	@Test (priority = 4)
	public void ViewPassword() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
		
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("mis@narola.email");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Narol@123!!!");
		
		//driver.findElement(By.id("com.shireburn.indigo:id/ivPass")).click();
		driver.findElement(By.className("android.widget.ImageView")).click();
		System.out.println("Password shown");
		
	}
	
	
	@Test (priority = 5)
	public void ValidCredentials() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
		
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("mis@narola.email");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		
		driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Narol@123!!!");
		driver.findElementById("com.shireburn.indigo:id/btnConstraint").click();
		
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.Button[@text='AGREE']").click();
		//driver.findElement(By.id("android:id/button1")).click();
		
		Thread.sleep(10000);
		driver.findElementById("com.shireburn.indigo:id/etCode1").sendKeys("1");
		driver.findElementById("com.shireburn.indigo:id/etCode2").sendKeys("2");
		driver.findElementById("com.shireburn.indigo:id/etCode3").sendKeys("3");
		driver.findElementById("com.shireburn.indigo:id/etCode4").sendKeys("4");
		
		driver.findElementById("com.shireburn.indigo:id/textSetAccessCode").click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']")).click();
		
		System.out.println("User logged in successfully in the indigo application");
		
	}
	
	/*
		@Test (priority = 6)
		public void logout() throws MalformedURLException, InterruptedException
		{
			AndroidDriver<AndroidElement> driver = capabilities();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
			
			driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("mis@narola.email");
			driver.findElementById("com.shireburn.indigo:id/textLogin").click();
			
			driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Narol@123!!!");
			driver.findElementById("com.shireburn.indigo:id/btnConstraint").click();
			
			driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']")).click();
			
			driver.findElementById("com.shireburn.indigo:id/etCode1").sendKeys("1");
			driver.findElementById("com.shireburn.indigo:id/etCode2").sendKeys("2");
			driver.findElementById("com.shireburn.indigo:id/etCode3").sendKeys("3");
			driver.findElementById("com.shireburn.indigo:id/etCode4").sendKeys("4");
			
			driver.findElementById("com.shireburn.indigo:id/textSetAccessCode").click();
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']")).click();
			
			//Thread.sleep(10000);
			driver.findElement(By.id("com.shireburn.indigo:id/cvUserImage")).click();
			
			driver.findElement(By.id("com.shireburn.indigo:id/tvLogout")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='LOGOUT']")).click();
			
			System.out.println("User logged out successfully");
			 
						
		}
		*/
		
	
	
}

