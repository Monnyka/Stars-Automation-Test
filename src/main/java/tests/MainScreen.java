package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Coordinates;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class MainScreen extends BaseClass {

	@Test
	public void mainScreen_TCMC01() {
		//login
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
		
//		Check screen
		MobileElement btnNotification = driver.findElement(By.id("com.pathmazing.stars:id/image_view_notification"));
		btnNotification.click();
		MobileElement navTitle = driver.findElement(By.id("com.pathmazing.stars:id/text_view_titleBar"));
		String navTitleText = navTitle.getText();
		if(navTitleText.equals("Notifications")){

		}
		else{
			setFail();
		}
		clickBtnBack();


	}

	@Test
	public void mainScreen_TCMS01() {
//		Check screen
		scrollUsingTouchAction("down");
		String earnedThisMothText = getText("com.pathmazing.stars:id/text_view_star_rewarded");
		String lastMonthLabelText = getText("com.pathmazing.stars:id/tv_title_last_month");
		MobileElement allTimeLabel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]"));
		String allTimeLabelText=allTimeLabel.getText();
		if(!earnedThisMothText.equals("Earned This Month") && !lastMonthLabelText.equals("Last Month") && !allTimeLabelText.equals("All Time")){
			setFail();
		}
	}

	@Test
	public void mainScreen_TCMS02(){
		String redeemableBalance = getText("com.pathmazing.stars:id/tv_title_redeemable");
		if(!redeemableBalance.equals("Redeemable Balance")){
			setFail();
		}

	}

}
