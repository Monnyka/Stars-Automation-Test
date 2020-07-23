package Testcase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RewardStars extends BaseClass{
    //Staff Reward

    @Test
    public void rewardStars_TCRS00(){
        loginStaff();
    }

    @Test
    public void rewardStars_TCRS01(){
        //Tap on Allocated Balance
        clickById("com.pathmazing.stars:id/image_view_star_reward");
        tap(500,100);
    }

    @Test
    public void rewardStars_TCRS02(){
        //Tap on QR Scan
        clickById("com.pathmazing.stars:id/image_view_star_reward");
        tap(770,1700);

    }

    @Test
    public void rewardStars_TCRS03(){
        //Tap allow permission camera
        Assert.assertEquals(getText("com.android.permissioncontroller:id/permission_message"),"Allow STARS to take pictures and record video?");
        clickById("com.android.permissioncontroller:id/permission_allow_button");
    }

    @Test
    public void rewardStars_TCRS04(){
        //Tap allow permission picture
        Assert.assertEquals(getText("com.android.permissioncontroller:id/permission_message"),"Allow STARS to access photos, media, and files on your device?");
        clickById("com.android.permissioncontroller:id/permission_allow_button");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_titleBar"),"Scan QR Code");
        clickBtnBack();
    }

    @Test
    public void rewardStars_TCRS05(){
        //Tap allow permission picture
        clickById("com.pathmazing.stars:id/image_view_star_reward");
        tap(300,1700);
    }

    @Test
    public void rewardStars_TCRS06(){
        //Check Staff List
        for(int i=1;i<=2;i++){
            Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.TextView"),readExcelFile(11+i,1,"rewardStaff"));
        }
    }

    @Test
    public void rewardStars_TCRS07(){
        //Tap on multi-reward option
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_multi_reward"),"Multi-Reward");
        clickById("com.pathmazing.stars:id/image_check_multi_reward");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_reward"),"Select or Enter Name");
        clickById("com.pathmazing.stars:id/image_check_multi_reward");
    }

    @Test
    public void rewardStars_TCRS08(){
        //Search staff by name
        clickById("com.pathmazing.stars:id/menu_bar_search");
        Assert.assertEquals(getText("com.pathmazing.stars:id/tvSearchEmployee"),"Search");
        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee", "ZXZUSLKJ");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_msg"),"No staff found");
    }

    @Test
    public void rewardStars_TCRS09(){
        //Search staff by name
        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee", "Oliver");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_gird_name_employee"), "Oliver Sovann");
        clickById("com.pathmazing.stars:id/btnCloseSearch");
    }

    @Test
    public void rewardStars_TCRS10(){
        //Tap on Heart icon
        clickById("com.pathmazing.stars:id/menu_bar_favorite");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_gird_name_employee"), "Oliver Sovann");
        clickById("com.pathmazing.stars:id/menu_bar_favorite");
    }


    @Test
    public void rewardStars_TCRS11(){
    clickById("com.pathmazing.stars:id/menu_bar_change");
    }

    @Test
    public void rewardStars_TCRS12(){
        //TODO: Check staff list view
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]"), readExcelFile(12,1,"rewardStaff"));
        clickById("com.pathmazing.stars:id/menu_bar_change");

    }

    @Test
    public void rewardStars_TCRS13(){
        //TODO: Filtering Staff (Wait new update)
    }

    @Test
    public void rewardStars_TCRS14(){
        //TODO: Tap on staff
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout[3]");
    }

    @Test
    public void rewardStars_TCRS15(){
        //Check Staff info
        //TODO: Need Compare Image
        Assert.assertEquals(getText("com.pathmazing.stars:id/tvName"), readExcelFile(12,1,"rewardStaff"));
        Assert.assertEquals(getText("com.pathmazing.stars:id/tvPosition"), readExcelFile(12,2,"rewardStaff"));
    }

    @Test
    public void rewardStars_TCRS16(){
        //TODO: Validation Field

        //Stars
        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_point"),"Stars");

        //Field Suggest Category
        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_category"),"Suggested Reward Category");
        clickById("com.pathmazing.stars:id/button_submit");
        Assert.assertEquals(getText("android:id/message"),"Please select Suggestion Categories");
        clickById("android:id/button1");
        clickById("com.pathmazing.stars:id/edit_text_category");

        int itemCount=0;
        for(int i = 1; true; i++){
            try{
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")).isDisplayed();
                Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"), readExcelFile(2+i,6,"rewardStaff"));
                print("\n"+getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"+" "));
                int j=1;
                if(i==5 || i==6) {
                    j = 2;
                }
                    Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[" + i + "]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[" + j + "]"), readExcelFile(2 + i, 7, "rewardStaff"));
                    print(" " + getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[" + i + "]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[" + j + "]"));
            }catch ( Exception e){
                break;
            }
            itemCount++;
        }
        clickById("com.pathmazing.stars:id/button_cancel");

        //Check After Selection Suggest Categories
        clickById("com.pathmazing.stars:id/edit_text_category");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_category"), readExcelFile(3,6,"rewardStaff"));
        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_point"), readExcelFile(3,7,"rewardStaff"));
        clickById("com.pathmazing.stars:id/edit_text_category");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_category"), readExcelFile(5,6,"rewardStaff"));
        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_point"), readExcelFile(5,7,"rewardStaff"));

        //Progress Bar
        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_to_reward_balance"),readExcelFile(18,1,"userData") + " Stars");

        //Reason
        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_reason"),"Reason");

        //Button
        Assert.assertEquals(getText("com.pathmazing.stars:id/button_submit"),"Send");

    }

    @Test
    public void rewardStars_TCRS16_1(){
        //Validate field stars
        driver.findElement(By.id("com.pathmazing.stars:id/edit_text_point")).clear();
        clickById("com.pathmazing.stars:id/button_submit");
        Assert.assertEquals(getText("android:id/message"),"Please enter the number of stars to reward");
        clickById("android:id/button1");

        //Reward with 0 Stars
        sendKeyById("com.pathmazing.stars:id/edit_text_point","0");
        clickById("com.pathmazing.stars:id/button_submit");
        Assert.assertEquals(getText("android:id/message"),"The Reward Star must be greater than 0");
        clickById("android:id/button1");

    }

    public void checkProgressValue(){
        int progressValue = Integer.parseInt(getText("com.pathmazing.stars:id/text_view_selected_point"));
        int enterValue = Integer.parseInt(getText("com.pathmazing.stars:id/edit_text_point"));
        int expValue = Integer.parseInt(readExcelFile(18,1,"userData")) - enterValue;
        System.out.println(progressValue);
        Assert.assertEquals(progressValue,expValue);
    }

    @Test
    public void rewardStars_TCRS16_2() throws InterruptedException {
        sendKeyById("com.pathmazing.stars:id/edit_text_point","10");
        Thread.sleep(4000);
        checkProgressValue();
        sendKeyById("com.pathmazing.stars:id/edit_text_point","20");
        Thread.sleep(4000);
        checkProgressValue();
        sendKeyById("com.pathmazing.stars:id/edit_text_point","50");
        Thread.sleep(4000);
        checkProgressValue();
        sendKeyById("com.pathmazing.stars:id/edit_text_point","10");
    }

    @Test
    public void rewardStars_TCRS16_3(){
        //Validate Reason
        clickById("com.pathmazing.stars:id/button_submit");
        Assert.assertEquals(getText("android:id/message"),"Please provide the reason");
        clickById("android:id/button1");

        sendKeyById("com.pathmazing.stars:id/edit_text_reason","     ");
        clickById("com.pathmazing.stars:id/button_submit");
        Assert.assertEquals(getText("android:id/message"),"Please provide the reason");
        clickById("android:id/button1");

        sendKeyById("com.pathmazing.stars:id/edit_text_reason",readExcelFile(9,1,"rewardStaff")
                + readExcelFile(10,1,"rewardStaff"));
        clickById("com.pathmazing.stars:id/button_submit");
    }

    @Test
    public void rewardStars_TCRS16_4(){
        //Check Pop up Confirm
        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewVipName"), readExcelFile(12,1,"rewardStaff"));
        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewVipPosition"),readExcelFile(12,2,"rewardStaff"));
        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewRewardQuantity"), readExcelFile(5,7,"rewardStaff"));
        Assert.assertEquals(getText("com.pathmazing.stars:id/button_ok_label"),"Submit");
        //dismiss pop up
        tap(500,200);
        clickById("com.pathmazing.stars:id/button_submit");
    }


    @Test
    public void rewardStars_TCRS17(){
        //TODO: Verify Category List
    }

    @Test
    public void rewardStars_TCRS18(){
        //TODO: Check limitation of category
    }

    @Test
    public void rewardStars_TCRS19(){
        //TODO: History Bottom sheet
    }

    @Test
    public void rewardStars_TCRS20(){
        //TODO: Successfully Send Reward Peer
    }

    @Test
    public void rewardStars_TCRS21(){
        //TODO: Successfully Send Reward Subordinate
    }

    @Test
    public void rewardStars_TCRS22(){
        //TODO: Successfully Send Reward Superior
    }

    @Test
    public void rewardStars_TCRS23(){
        //TODO: Open Account Receiver
    }

    @Test
    public void rewardStars_TCRS24(){
        //TODO: Check receiver balance
    }


}
