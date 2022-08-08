import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Addaccounttestcases extends BaseIndigo{
	
	
	@Test (priority = 1)
	public void Trytoaddwithoutusername() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Add Account'")).click();
		driver.findElementById("com.shireburn.indigo:id/ivAddAccount").click();
		
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		 System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Username is required.']")).getText());
		
	}
	
	@Test (priority = 2)
	public void trytoaddwithoutpassword() throws MalformedURLException
	{
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Add Account'")).click();
		driver.findElementById("com.shireburn.indigo:id/ivAddAccount").click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Username']")).sendKeys("abc@gmail.com");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		System.out.println(driver.findElementById("com.shireburn.indigo:id/txtPasswordPlaceHolder").getText());
		
	}
	
	@Test (priority = 3)
	public void addnewaccount() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Add Account'")).click();
		driver.findElementById("com.shireburn.indigo:id/ivAddAccount").click();
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Username']")).sendKeys("pdg@narola.email");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Check@123");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		
		System.out.println("New account added successfully");
		
	}
	

}
