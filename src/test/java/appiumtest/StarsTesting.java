package appiumtest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;

public class StarsTesting{

	public static AppiumDriver <MobileElement> driver;
	
	public static void main(String[] args) throws Exception {

			OpenStarApp();
			//logIn();
			//starsLogin();
			forgotPassword();
	}
	
	public static void OpenStarApp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","oneplus" );
		cap.setCapability("udid","88960370" );
		cap.setCapability("platformName","Android" );
		cap.setCapability("platformVersion","10");
		cap.setCapability("appPackage","com.pathmazing.stars" );
		cap.setCapability("appActivity","com.pathmazing.stars.ui.activities.LoginActivity" );
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.print("Application Stared...");
	}
	
	public static void logIn() {

		MobileElement login = driver.findElement(By.id("com.oneplus.calculator:id/digit_7"));
		MobileElement di2 = driver.findElement(By.id("com.oneplus.calculator:id/digit_8"));
		login.click();
		MobileElement addbutton = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
		addbutton.click();
		di2.click();
		MobileElement eq = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
		eq.click();
		
		MobileElement element = (MobileElement) driver.findElement(By.id("com.oneplus.calculator:id/result"));
		String elText = element.getText();
		String results="15";

		if(elText.equals(results)) {
			System.out.print("Adding passed");
		}
		else {
			System.out.print("Adding fail");
		}
		
	}

	public static void starsLogin() {
		MobileElement emailfield = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_email"));
		emailfield.sendKeys("nykanano@gmail.com");
		
		MobileElement passwordfield = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_password"));
		passwordfield.sendKeys("Stars@2019");
		
		MobileElement btnShowPassword = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show password\"]"));
		btnShowPassword.click();
			
		MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
		btnLogin.click();
		
//		MobileElement btncloseFigerPrint = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
//		btncloseFigerPrint.click();
		
//		MobileElement btnForgotPassword = driver.findElement(By.id("com.pathmazing.stars:id/text_view_forgot_password"));
//		btnForgotPassword.click();
	
//		MobileElement btnBack = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
//		btnback.click();
		
		
		
		
	}
	
	public static void forgotPassword() {
		MobileElement btnForgotPassword = driver.findElement(By.id("com.pathmazing.stars:id/text_view_forgot_password"));
		btnForgotPassword.click();
		MobileElement emailToggle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView"));
		emailToggle.click();
		
		MobileElement edEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
		edEmail.click();
		edEmail.sendKeys("nykanano@gmail.com");
		
		MobileElement btnSend = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button"));
		btnSend.click();
	}
}
