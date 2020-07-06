package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Login extends BaseClass{

	@Test
	public void logIn_TCLI01() {
		//Log in without input authentication
		MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
		btnLogin.click();
    	String message = driver.findElementById("android:id/message").getText();
		String expMessage="Please enter your email address or phone number";
		if(message.equals(expMessage)) {
			driver.findElement(By.id("android:id/button1")).click();
		}
		else {
			ITestResult result = null;
			result.setStatus(ITestResult.FAILURE);
			Reporter.setCurrentTestResult(result);
		}
	}

	@Test
	public void logIn_TCLI02() {
		//Log in with incorrect email
		MobileElement emailfield = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_email"));
		emailfield.sendKeys("nykanano");
		MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
		btnLogin.click();
    	String message = driver.findElementById("android:id/message").getText();
		String expMessage="Please enter a valid email address";
		if(message.equals(expMessage)) {
			driver.findElement(By.id("android:id/button1")).click();
		}
		else {
			ITestResult result = null;
			result.setStatus(ITestResult.FAILURE);
			Reporter.setCurrentTestResult(result);
		}
	}

	@Test
	public void logIn_TCLI03() {
		//Log in with incorrect email
		MobileElement emailfield = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_email"));
		emailfield.sendKeys("nykanano1231231@gmail.com");
		MobileElement passwordfield = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_password"));
		passwordfield.sendKeys("Stars@2019");
		MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
		btnLogin.click();
		//First Time Unsuccessfully Attempt
		MobileElement txtOne = driver.findElement(By.id("com.pathmazing.stars:id/tv_title_first"));
		String firstTimeMessage = txtOne.getText();
		MobileElement txtTwo = driver.findElement(By.id("com.pathmazing.stars:id/tv_title_second"));
		String secondTimeMessage = txtTwo.getText();

		if(firstTimeMessage.equals("Your email/phone number or password is incorrect")&&secondTimeMessage.equals("If you are having trouble logging into your STARS app, please contact your HR department")) {
			MobileElement btnOk = driver.findElement(By.id("com.pathmazing.stars:id/button_cancel"));
			btnOk.click();
		}
		else {
			ITestResult result = null;
			result.setStatus(ITestResult.FAILURE);
			Reporter.setCurrentTestResult(result);
		}

		//Second Time Unsuccessfully Attempt
		btnLogin.click();
		MobileElement txtThree = driver.findElement(By.id("com.pathmazing.stars:id/tv_title_third"));
		String thirdTimeMessage = txtThree.getText();
		if(firstTimeMessage.equals("Your email/phone number or password is incorrect")&&secondTimeMessage.equals("If you are having trouble logging into your STARS app, please contact your HR department")&&thirdTimeMessage.equals("If you are a company or an organization that is interested in using the STARS app for your employees, please contact us through the following:")) {
			MobileElement btnOk = driver.findElement(By.id("com.pathmazing.stars:id/button_cancel"));
			btnOk.click();
		}
		else {
			ITestResult result = null;
			result.setStatus(ITestResult.FAILURE);
			Reporter.setCurrentTestResult(result);
		}
	}

	@Test
	public void logIn_TCLI04() {
		MobileElement emailField = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_email"));
		emailField.sendKeys("nykanano@gmail.com");
		MobileElement passwordField = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_password"));
		passwordField.sendKeys("Stars@2019");
		MobileElement btnShowPassword = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show password\"]"));
		btnShowPassword.click();
		MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
		btnLogin.click();
		MobileElement textViewFingerPrintLater = driver.findElement(By.id("com.pathmazing.stars:id/text_view_fingerprint_later"));
		textViewFingerPrintLater.click();
	}
	
	
	
}
