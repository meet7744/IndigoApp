import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ForgotPassword extends BaseIndigo{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
		
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("abc@gmail.com");
		driver.findElementById("com.shireburn.indigo:id/textLogin").click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Forgot password?'")).click();
		
		driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("mis@narola.email");
		driver.findElementById("com.shireburn.indigo:id/textRecoverPassword").click();
		
		String confirmtxt = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPasswordSentMsg1")).getText();
		Assert.assertEquals("A new link to change your password has been sent to your Indigo account email.", confirmtxt);
		//System.out.println("Reset password link sent on your registered mail successfully");
		

	}

}
