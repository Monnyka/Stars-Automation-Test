package Testcase;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseClass {

    @Test //Log in without input authentication
    public void logIn_TCLI01() {
        MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
        btnLogin.click();
        String message = driver.findElementById("android:id/message").getText();
        String expMessage = "Please enter your email address or phone number";
        if (message.equals(expMessage)) {
            driver.findElement(By.id("android:id/button1")).click();
        } else {
            setFail();
        }
    }

    @Test //Log in with incorrect email
    public void logIn_TCLI02() {
        MobileElement emailfield = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_email"));
        emailfield.sendKeys("nykanano");
        MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
        btnLogin.click();
        String message = driver.findElementById("android:id/message").getText();
        String expMessage = "Please enter a valid email address";
        if (message.equals(expMessage)) {
            driver.findElement(By.id("android:id/button1")).click();
        } else {
            setFail();
        }
    }

    @Test //Log in with the incorrect email and password
    public void logIn_TCLI03() {
        MobileElement emailField = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_email"));
        emailField.sendKeys("nykanano1231232@gmail.com");
        MobileElement passwordField = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_password"));
        passwordField.sendKeys("Stars@2019");
        MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
        btnLogin.click();
        //First Time Unsuccessfully Attempt
        MobileElement txtOne = driver.findElement(By.id("com.pathmazing.stars:id/tv_title_first"));
        String firstTimeMessage = txtOne.getText();
        MobileElement txtTwo = driver.findElement(By.id("com.pathmazing.stars:id/tv_title_second"));
        String secondTimeMessage = txtTwo.getText();

        if (firstTimeMessage.equals("Your email/phone number or password is incorrect") && secondTimeMessage.equals("If you are having trouble logging into your STARS app, please contact your HR department")) {
            MobileElement btnOk = driver.findElement(By.id("com.pathmazing.stars:id/button_cancel"));
            btnOk.click();
        } else {
            setFail();
        }

        //Second Time Unsuccessfully Attempt
        btnLogin.click();
        MobileElement txtThree = driver.findElement(By.id("com.pathmazing.stars:id/tv_title_third"));
        String thirdTimeMessage = txtThree.getText();
        if (firstTimeMessage.equals("Your email/phone number or password is incorrect") && secondTimeMessage.equals("If you are having trouble logging into your STARS app, please contact your HR department") && thirdTimeMessage.equals("If you are a company or an organization that is interested in using the STARS app for your employees, please contact us through the following:")) {
            MobileElement btnOk = driver.findElement(By.id("com.pathmazing.stars:id/button_cancel"));
            btnOk.click();
        } else {
            setFail();
        }

    }

    @Test //Log in with incorrect phone number format
    public void logIn_TCLI04() {
        sendKeyById("com.pathmazing.stars:id/edit_text_email","069910");
        sendKeyById("com.pathmazing.stars:id/edit_text_password","Stars@2019");
        clickById("com.pathmazing.stars:id/button_login");
        String message = getText("android:id/message");
        if(!message.equals("Please enter a valid phone number")){
            setFail();
        }
        clickById("android:id/button1");

    }

    @Test //Log in with more than 10 digit phone number
    public void logIn_TCLI05(){
        sendKeyById("com.pathmazing.stars:id/edit_text_email","0699104636457568679685634");
        sendKeyById("com.pathmazing.stars:id/edit_text_password","Stars@2019");
        clickById("com.pathmazing.stars:id/button_login");
        clickById("com.pathmazing.stars:id/button_cancel");
    }

    @Test //Log in with non exist phone number
    public void logIn_TCLI06(){
        sendKeyById("com.pathmazing.stars:id/edit_text_email","79910179");
        sendKeyById("com.pathmazing.stars:id/edit_text_password","Stars@2019");
        clickById("com.pathmazing.stars:id/button_login");
        clickById("com.pathmazing.stars:id/button_cancel");
    }

    @Test //Lig in with the correct Phone number
    public void logIn_TCLI07(){
        sendKeyById("com.pathmazing.stars:id/edit_text_email","069910164");
        sendKeyById("com.pathmazing.stars:id/edit_text_password","Stars@2019");
        clickById("com.pathmazing.stars:id/button_login");
        clickById("com.pathmazing.stars:id/text_view_fingerprint_later");
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[10]/android.view.ViewGroup/android.widget.RelativeLayout");
        String message = getText("android:id/message");
        Assert.assertEquals(message,"Are you sure you want to log out?");
        clickById("android:id/button1");
    }

    @Test
    public void logIn_TCLI08() {
        MobileElement emailField = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_email"));
        emailField.sendKeys("nykanano@gmail.com");
        MobileElement passwordField = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_password"));
        passwordField.sendKeys("Stars@2019");
        MobileElement btnShowPassword = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show password\"]"));
        btnShowPassword.click();
        MobileElement btnLogin = driver.findElement(By.id("com.pathmazing.stars:id/button_login"));
        btnLogin.click();
        logout();
    }

    @Test //Log in First Time
    public void logIn_TCLI09(){
        sendKeyById("com.pathmazing.stars:id/edit_text_email","alvin.pa@mailinator.com");
        sendKeyById("com.pathmazing.stars:id/edit_text_password","6BKE7L");
        clickById("com.pathmazing.stars:id/button_login");
        String navTitle = getText("com.pathmazing.stars:id/text_view_force_set_password_title");
        Assert.assertEquals(navTitle,"Set New Password");
        String newPasswordField = getText("com.pathmazing.stars:id/edit_text_new_password");
        Assert.assertEquals(newPasswordField, "New Password");
        String cnpField = getText("com.pathmazing.stars:id/edit_text_confirm_password");
        Assert.assertEquals(cnpField,"Confirm New Password");

        // validation field password
        clickById("com.pathmazing.stars:id/button_submit");
        String message = getText("android:id/message");
        Assert.assertEquals(message,"Please enter your new password");
        clickById("android:id/button1");

        //Validate field confirm new password
        sendKeyById("com.pathmazing.stars:id/edit_text_new_password","Stars@2019");
        clickById("com.pathmazing.stars:id/button_submit");
        message = getText("android:id/message");
        Assert.assertEquals(message,"Please enter your confirm new password");
        clickById("android:id/button1");

        //Validate
        String termsText = getText("com.pathmazing.stars:id/term_condition");
        Assert.assertEquals(termsText,"By updating your password, you agree to STARS Terms of Use and Privacy Policy");
        clickBtnBack();
        //TODO: Add successful update password check
    }

    @Test //Tap on forget password
    public void logIn_TCLI10(){
        clickById("com.pathmazing.stars:id/text_view_forgot_password");
        clickBtnBack();
    }

}
