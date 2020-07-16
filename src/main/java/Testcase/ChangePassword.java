package Testcase;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChangePassword extends BaseClass {

    @Test
    public void ChangePassword_TCCP01() {
        //login
        loginStaff();
        MobileElement mainScreenMenu = driver.findElement(By.id("com.pathmazing.stars:id/image_view_menu"));
        mainScreenMenu.click();

        MobileElement viewBlockProfile = driver.findElement(By.id("com.pathmazing.stars:id/view_block_profile"));
        viewBlockProfile.click();

        MobileElement menuEdit = driver.findElement(By.id("com.pathmazing.stars:id/menu_bar_edit"));
        menuEdit.click();

        //Validate Current Password Field
        MobileElement btnSubmit = driver.findElement(By.id("com.pathmazing.stars:id/button_submit"));
        btnSubmit.click();
        MobileElement popMessage = driver.findElement(By.id("android:id/message"));
        String message = popMessage.getText();
        if (message.equals("Please enter your current password")) {
            MobileElement btnOk = driver.findElement(By.id("android:id/button1"));
            btnOk.click();
        } else {
            setFail();
        }

        //Enter Current Password
        MobileElement edCurrentPassword = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_current_password"));
        edCurrentPassword.sendKeys("Stars@2019");

        //Validation Filed New Password
        btnSubmit.click();
        MobileElement newPassWordMessage = driver.findElement(By.id("android:id/message"));
        String nMessage = newPassWordMessage.getText();
        if (nMessage.equals("Please enter your new password")) {
            MobileElement btnOk = driver.findElement(By.id("android:id/button1"));
            btnOk.click();
        } else {
            setFail();
        }

        //Enter New Password
        MobileElement edNewPassword = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_new_password"));
        edNewPassword.sendKeys("Stars@2019");


        //Validate Confirm New Password Field
        btnSubmit.click();
        MobileElement confirmPassWordMessage = driver.findElement(By.id("android:id/message"));
        String cMessage = confirmPassWordMessage.getText();
        print(cMessage);
        if (cMessage.equals("Please enter confirm new password")) {
            MobileElement btnOk = driver.findElement(By.id("android:id/button1"));
            btnOk.click();
        } else {
            setFail();
        }

        //Enter Confirm New Password
        MobileElement edConfirmNewPassword = driver.findElement(By.id("com.pathmazing.stars:id/edit_text_confirm_password"));
        edConfirmNewPassword.sendKeys("Stars@2019");
        btnSubmit.click();

        //Submit New Password
        btnSubmit.click();
        MobileElement successPassWordMessage = driver.findElement(By.id("android:id/message"));
        String sMessage = successPassWordMessage.getText();
        if (sMessage.equals("Your password has been updated successfully.")) {
            MobileElement btnOk = driver.findElement(By.id("android:id/button1"));
            btnOk.click();
        } else {
            setFail();
        }

    }

}
