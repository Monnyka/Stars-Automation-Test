package Testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RewardStars extends BaseClass{

//TODO Reward peer......................................................................................................

//    @Test
//    public void rewardStars_TCRS00(){
//        loginStaff();
//    }
//
//    @Test
//    public void rewardStars_TCRS01(){
//        //Tap on Allocated Balance
//        clickById("com.pathmazing.stars:id/image_view_star_reward");
//        tap(500,100);
//    }
//
//    @Test
//    public void rewardStars_TCRS02(){
//        //Tap on QR Scan
//        clickById("com.pathmazing.stars:id/image_view_star_reward");
//        tap(770,1700);
//    }
//
//    @Test
//    public void rewardStars_TCRS03(){
//        //Tap allow permission camera
//        Assert.assertEquals(getText("com.android.permissioncontroller:id/permission_message"),"Allow STARS to take pictures and record video?");
//        clickById("com.android.permissioncontroller:id/permission_allow_button");
//    }
//
//    @Test
//    public void rewardStars_TCRS04(){
//        //Tap allow permission picture
//        Assert.assertEquals(getText("com.android.permissioncontroller:id/permission_message"),"Allow STARS to access photos, media, and files on your device?");
//        clickById("com.android.permissioncontroller:id/permission_allow_button");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_titleBar"),"Scan QR Code");
//        clickBtnBack();
//    }
//
//    @Test
//    public void rewardStars_TCRS05(){
//        //Tap allow permission picture
//        clickById("com.pathmazing.stars:id/image_view_star_reward");
//        tap(300,1700);
//    }
//
//    @Test
//    public void rewardStars_TCRS06(){
//        //Check Staff List
//        for(int i=1;i<=2;i++){
//            Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.TextView"),readExcelFile(11+i,1,"rewardStaff"));
//        }
//    }
//
//    @Test
//    public void rewardStars_TCRS07(){
//        //Tap on multi-reward option
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_multi_reward"),"Multi-Reward");
//        clickById("com.pathmazing.stars:id/image_check_multi_reward");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_reward"),"Select or Enter Name");
//        clickById("com.pathmazing.stars:id/image_check_multi_reward");
//    }
//
//    @Test
//    public void rewardStars_TCRS08(){
//        //Search staff by name
//        clickById("com.pathmazing.stars:id/menu_bar_search");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tvSearchEmployee"),"Search");
//        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee", "ZXZUSLKJ");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_msg"),"No staff found");
//    }
//
//    @Test
//    public void rewardStars_TCRS09(){
//        //Search staff by name
//        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee", "Oliver");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_gird_name_employee"), "Oliver Sovann");
//        clickById("com.pathmazing.stars:id/btnCloseSearch");
//    }
//
//    @Test
//    public void rewardStars_TCRS10(){
//        //Tap on Heart icon
//        clickById("com.pathmazing.stars:id/menu_bar_favorite");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_gird_name_employee"), "Oliver Sovann");
//        clickById("com.pathmazing.stars:id/menu_bar_favorite");
//    }
//
//    @Test
//    public void rewardStars_TCRS11(){
//    clickById("com.pathmazing.stars:id/menu_bar_change");
//    }
//
//    @Test
//    public void rewardStars_TCRS12(){
//        //TODO: Check staff list view
//        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]"), readExcelFile(12,1,"rewardStaff"));
//        clickById("com.pathmazing.stars:id/menu_bar_change");
//    }
//
//    @Test
//    public void rewardStars_TCRS13(){
//        //TODO: Filtering Staff (Wait new update)
//    }
//
//    @Test
//    public void rewardStars_TCRS14(){
//        //Tap on staff
//        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout[3]");
//    }
//
//    @Test
//    public void rewardStars_TCRS15(){
//        //Check Staff info
//        //TODO: Need Compare Image
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tvName"), readExcelFile(12,1,"rewardStaff"));
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tvPosition"), readExcelFile(12,2,"rewardStaff"));
//    }
//
//    @Test
//    public void rewardStars_TCRS16(){
//        //TODO: Validation Field
//
//        //Stars
//        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_point"),"Stars");
//        //Field Suggest Category
//        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_category"),"Suggested Reward Category");
//        clickById("com.pathmazing.stars:id/button_submit");
//        Assert.assertEquals(getText("android:id/message"),"Please select Suggestion Categories");
//        clickById("android:id/button1");
//        clickById("com.pathmazing.stars:id/edit_text_category");
//
//        int itemCount=0;
//        for(int i = 1; true; i++){
//            try{
//                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/" +
//                        "android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")).isDisplayed();
//                Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"), readExcelFile(2+i,1,"rewardCat"));
//                 int j=1;
//                if(i==5 || i==6) {
//                    j = 2;
//                }
//                    Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[" + i + "]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[" + j + "]"), readExcelFile(2 + i, 2, "rewardCat"));
//            }catch ( Exception e){
//                break;
//            }
//            itemCount++;
//        }
//        //Click on button Cancel
//        clickById("com.pathmazing.stars:id/button_cancel");
//        //Check After Selection Suggest Categories
//        clickById("com.pathmazing.stars:id/edit_text_category");
//        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
//        //Check select categories
//        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_category"), readExcelFile(3,1,"rewardCat"));
//        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_point"), readExcelFile(3,2,"rewardCat"));
//        //Select new Categories
//        clickById("com.pathmazing.stars:id/edit_text_category");
//        //Select Effort: Good
//        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
//        //Check position title
//        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_category"), readExcelFile(5,1,"rewardCat"));
//        //Check position point
//        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_point"), readExcelFile(5,2,"rewardCat"));
//        //Progress Bar
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_to_reward_balance"),readExcelFile(19,1,"userData") + " Stars");
//        //Reason
//        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_reason"),"Reason");
//        //Button
//        Assert.assertEquals(getText("com.pathmazing.stars:id/button_submit"),"Send");
//    }
//
//    @Test
//    public void rewardStars_TCRS16_1(){
//        //Validate field stars
//        driver.findElement(By.id("com.pathmazing.stars:id/edit_text_point")).clear();
//        clickById("com.pathmazing.stars:id/button_submit");
//        Assert.assertEquals(getText("android:id/message"),"Please enter the number of stars to reward");
//        clickById("android:id/button1");
//
//        //Reward with 0 Stars
//        sendKeyById("com.pathmazing.stars:id/edit_text_point","0");
//        clickById("com.pathmazing.stars:id/button_submit");
//        Assert.assertEquals(getText("android:id/message"),"The Reward Star must be greater than 0");
//        clickById("android:id/button1");
//    }
//
//    @Test
//    public void rewardStars_TCRS16_2(){
//        //TODO: Check limitation of category
//        sendKeyById("com.pathmazing.stars:id/edit_text_point","55");
//        sendKeyById("com.pathmazing.stars:id/edit_text_reason","Testing");
//        clickById("com.pathmazing.stars:id/button_submit");
//        Assert.assertEquals(getText("android:id/message"),"You cannot reward more than 50 stars");
//        clickById("android:id/button1");
//    }
//
//    public void checkProgressValue(){
//        int progressValue = Integer.parseInt(getText("com.pathmazing.stars:id/text_view_selected_point"));
//        int enterValue = Integer.parseInt(getText("com.pathmazing.stars:id/edit_text_point"));
//        int expValue = Integer.parseInt(readExcelFile(18,1,"userData")) - enterValue;
//        System.out.println(progressValue);
//        Assert.assertEquals(progressValue,expValue);
//    }
//
//    @Test
//    public void rewardStars_TCRS16_3() throws InterruptedException {
//        sendKeyById("com.pathmazing.stars:id/edit_text_point","10");
//        Thread.sleep(3000);
//        checkProgressValue();
//        sendKeyById("com.pathmazing.stars:id/edit_text_point","20");
//        Thread.sleep(3000);
//        checkProgressValue();
//        sendKeyById("com.pathmazing.stars:id/edit_text_point","50");
//        Thread.sleep(3000);
//        checkProgressValue();
//        sendKeyById("com.pathmazing.stars:id/edit_text_point","10");
//    }
//
//    @Test
//    public void rewardStars_TCRS16_4(){
//        //Validate Reason
//        sendKeyById("com.pathmazing.stars:id/edit_text_reason","");
//        clickById("com.pathmazing.stars:id/button_submit");
//        Assert.assertEquals(getText("android:id/message"),"Please provide the reason");
//        clickById("android:id/button1");
//
//        sendKeyById("com.pathmazing.stars:id/edit_text_reason","     ");
//        clickById("com.pathmazing.stars:id/button_submit");
//        Assert.assertEquals(getText("android:id/message"),"Please provide the reason");
//        clickById("android:id/button1");
//        sendKeyById("com.pathmazing.stars:id/edit_text_reason",readExcelFile(9,1,"rewardStaff")
//                + readExcelFile(10,1,"rewardStaff"));
//        clickById("com.pathmazing.stars:id/button_submit");
//    }
//
//    @Test
//    public void rewardStars_TCRS16_5(){
//        //Check Pop up Confirm
//        //Check receiver name
//        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewVipName"), readExcelFile(12,1,"rewardStaff"));
//        //Receiver Position
//        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewVipPosition"),readExcelFile(12,2,"rewardStaff"));
//        //Check the reward Stars to reward
//        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewRewardQuantity"), "10");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/button_ok_label"),"Submit");
//        //dismiss pop up
//        tap(500,200);
//        clickById("com.pathmazing.stars:id/button_submit");
//    }
//
//    @Test
//    public void rewardStars_TCRS17(){
//        //Successful reward
//        clickById("com.pathmazing.stars:id/button_ok_label");
//        Assert.assertEquals(getText("android:id/message"),"Your request has been successfully submitted");
//        clickById("android:id/button1");
//        int allocated = Integer.parseInt(readExcelFile(18,1,"userData")) - 10;
//        String allocatedLeft = String.valueOf(allocated);
//        writeExcelFile(18,1,"userData",allocatedLeft);
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_multi_reward"),"Multi-Reward");
//        clickBtnBack();
//    }
//
//    @Test
//    public void rewardStars_TCRS18() throws InterruptedException {
//        //login
//        logout();
//        sendKeyById("com.pathmazing.stars:id/edit_text_email", "oliver.pa@mailinator.com");
//        sendKeyById("com.pathmazing.stars:id/edit_text_password", "Stars@2019");
//        clickXpathElement("//android.widget.ImageButton[@content-desc=\"Show password\"]");
//        clickById("com.pathmazing.stars:id/button_login");
//        //Approve request
//        clickById("com.pathmazing.stars:id/image_view_notification");
//        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
//        //validate Screen
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_earn_point_this_month"),"10");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name_sender"),"Leon Pin");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name_sender_position"), "QA Tester");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_project_name_receiver"),"Alvin Meta");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_project_name_receiver_position"),"Android Developer");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_category"),"Effort: Good");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_reason"),
//                "\"" + readExcelFile(9,1,"rewardStaff") + readExcelFile(10,1,"rewardStaff")+"\"");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/button_deny"),"Deny");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/button_approve"),"Approve");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_sheet_title"),"History");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_from_who_only"), "From Leon Pin Only");
//        scroll(560,1670,560,350);
//        Thread.sleep(2000);
//        scroll(560,350,560,1670);
//        clickById("com.pathmazing.stars:id/button_deny");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/title"), "Enter Reason");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/edit_text_reject_message"),"Reason");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/button_reject"), "OK");
//        //Click out side dismiss pop up
//        tap(550,470);
//        clickById("com.pathmazing.stars:id/button_deny");
//        //Send Reason
//        sendKeyById("com.pathmazing.stars:id/edit_text_reject_message","Reject by manager...");
//        clickById("com.pathmazing.stars:id/button_reject");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_approved_by"), "Denied by");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_decider_approved"),"You");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_deny_reason"), "\"Reject by manager...\"");
//        clickBtnBack();
//    }
//
//    @Test
//    public void rewardStars_TCRS19(){
//        //check notification
//        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]"), "Leon Pin's request to reward 10 stars to Alvin Meta is denied.");
//        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]"), "a few seconds ago ");
//        clickBtnBack();
//        logout();
//    }
//
//    @Test
//    public void rewardStars_TCRS20(){
//        //Request Again
//        loginStaff2();
//        clickById("com.pathmazing.stars:id/image_view_star_reward");
//        tap(280,1700);
//        //Search Alvin
//        clickById("com.pathmazing.stars:id/menu_bar_search");
//        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee","Alvin");
//        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
//        //On Reward Screen: Choose Categories
//        clickById("com.pathmazing.stars:id/edit_text_category");
//        //Tap on effort: good
//        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.view.View");
//        //Type in the reason
//        sendKeyById("com.pathmazing.stars:id/edit_text_reason", readExcelFile(9,1,"rewardStaff")+readExcelFile(10,1,"rewardStaff"));
//        //Tap on button Send
//        clickById("com.pathmazing.stars:id/button_submit");
//        //Tap on submit button pop up
//        clickById("com.pathmazing.stars:id/button_ok_label");
//        //check validation Email
//        Assert.assertEquals(getText("android:id/message"),"Your request has been successfully submitted");
//        //Tap on button OK
//        clickById("android:id/button1");
//        clickBtnBack();
//        logout();
//    }
//
//    @Test
//    public void rewardStars_TCRS21() throws InterruptedException {
//        //Approve Request
//        loginAsManager();
//        clickById("com.pathmazing.stars:id/image_view_notification");
//        //Tap on notification Item
//        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
//        //Tap on Approve Button
//        clickById("com.pathmazing.stars:id/button_approve");
//        //Pop up confirmed message
//        Assert.assertEquals(getText("android:id/message"), "Do you want to approve this request?");
//        //Tap No
//        clickById("android:id/button2");
//        //Tap Yes
//        clickById("com.pathmazing.stars:id/button_approve");
//        clickById("android:id/button1");
//        Thread.sleep(2500);
//    }
//
//    @Test
//    public void rewardStars_TCRS22() {
//        //Check Approve Screen
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_approved_by"),"Approved by");
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_decider_approved"),"You");
////        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_month_approved_by"), getTimeAMPM());
//        writeExcelFile(19,1, "rewardStaff", getTimeAMPM());
//        driver.navigate().back();
//        scroll(170,200,1000,200);
//        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]"),
//                "Leon Pin rewards 10 stars to Alvin Meta.");
//        driver.navigate().back();
//        logout();
//    }
//
//    @Test
//    public void rewardStars_TCRS23(){
//        //Check pop up Reward Approved
//        loginStaff2();
//        //Check name
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tvRewardedName"),"Alvin Meta");
//        //Check position
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tvRewardedPosition"),"Android Developer");
//        //Check reward Point
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tvRewardedPoint"), "10");
//        //Check reward Categories
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_category"),"Effort: Good");
//        //Check Reason
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_reason"), "\"" + readExcelFile(9,1,"rewardStaff")+readExcelFile(10,1,"rewardStaff") + "\"" );
//        //Check Approved Time
//        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_time_ago"),readExcelFile(19,1, "rewardStaff"));
//        clickById("com.pathmazing.stars:id/btnDone");
//        logout();
//    }
//
//    @Test
//    public void rewardStars_TCRS24(){
//        //Login As Receiver
//        //Enter email
//        sendKeyById("com.pathmazing.stars:id/edit_text_email", "Alvin.pa@mailinator.com");
//        //Enter Password
//        sendKeyById("com.pathmazing.stars:id/edit_text_password", "Stars@2019");
//        //Show password
//        clickXpathElement("//android.widget.ImageButton[@content-desc=\"Show password\"]");
//        //Tap on button log in
//        clickById("com.pathmazing.stars:id/button_login");
//    }
//
//    @Test
//    public void rewardStars_TCRS25(){
//        //Check pop up receive
//
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_star"),"10");
//        //Check Sender name
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name_sender"), "Leon Pin");
//        //Position
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_position_sender"),"QA Tester");
//        //Check Receiver Name
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name_receiver"), "Alvin Meta");
//        //Position
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_position_receiver"),"Android Developer");
//        //Reward Categories
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_category"),"Effort: Good");
//        //Check Reason
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_reason"), "\"" + readExcelFile(9,1,"rewardStaff") + readExcelFile(10,1,"rewardStaff") + "\"" );
//        //Check Approve Time
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_time_ago"), readExcelFile(19,1,"rewardStaff") + " ");
//        tap(500,1800);
//    }
//
//    @Test
//    public void rewardStars_TCRS26(){
//        //Check pop up notification
//
//        clickById("com.pathmazing.stars:id/image_view_notification");
//        //Check notification text list
//        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]"), "Leon Pin rewards you 10 stars.");
//        //Tap on notification
//        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
//        //Check Sender name
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name_sender"), "Leon Pin");
//        //Position
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_position_sender"),"QA Tester");
//        //Check Receiver name
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name_receiver"),"Alvin Meta");
//        //Position
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_position_receiver"),"Android Developer");
//        //Categories
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_category"),"Effort: Good");
//        //Reason
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_reason"),"\"" + readExcelFile(9,1,"rewardStaff")+readExcelFile(10,1,"rewardStaff") + "\"" );
//        //Approved Time
//        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_time_ago"), readExcelFile(19,1,"rewardStaff") + " ");
//        //Dismiss the pop up
//        tap(500,1800);
//        //--write reason to excel
//        int reason = Integer.parseInt(readExcelFile(10,1, "rewardStaff"))+1;
//        String reasonNumber = String.valueOf(reason);
//        writeExcelFile(10,1,"rewardStaff",reasonNumber);
//        //Logout
//        logout();
//    }

//TODO: Reward Superior without Manager...................................................................................

    @Test
    public void rewardStars_TCRS27(){
    //Login as Sender

        //need change when intergrate
        loginStaff();
    }

    @Test
    public void rewardStars_TCRS28(){
    //Login as Sender
        //Tap on Stars icon main screen
        clickById("com.pathmazing.stars:id/image_view_star_reward");
        //Tap on staff reward icon
        tap(300,1700);
    }

    @Test
    public void rewardStars_TCRS29(){
    //Search for superior
        //Tap on search
        clickById("com.pathmazing.stars:id/menu_bar_search");
        //Search receiver account
        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee", "Oliver");
        //Click on search item
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
    }

    @Test
    public void rewardStars_TCRS30(){
    //Check Screen
        //Check Name
        Assert.assertEquals(getText("com.pathmazing.stars:id/tvName"), "Oliver Sovann");
        //Check Position
        Assert.assertEquals(getText("com.pathmazing.stars:id/tvPosition"), "Project Manager");
        //Enter Suggest Categories
        clickById("com.pathmazing.stars:id/edit_text_category");
        //Choose Suggestion Categories
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.view.View");
        //Change Stars from suggestion to 10
        sendKeyById("com.pathmazing.stars:id/edit_text_point","10");
        //Enter Reason
        sendKeyById("com.pathmazing.stars:id/edit_text_reason", readExcelFile(9,1, "rewardStaff") + readExcelFile(10,1,"rewardStaff"));
        //Tap on Submit Button
        clickById("com.pathmazing.stars:id/button_submit");
    }

    @Test
    public void rewardStars_TCRS31(){
    //Submit the request
        //Tab submit button on confirmed pop up
        clickById("com.pathmazing.stars:id/button_ok_label");
        //Check message successful text
        Assert.assertEquals(getText("android:id/message"), "You have successfully rewarded 10 stars to Oliver Sovann");
        //Click on button OK
        clickById("android:id/button1");
        scroll(80,180,1000,180);
        //Check if back to screen staff list
        clickById("com.pathmazing.stars:id/btnCloseSearch");
        //Click back
        clickBtnBack();
    }

    @Test
    public void rewardStars_TCRS32(){
    //Check automatically approve
        //Tap on notification icon
        clickById("com.pathmazing.stars:id/image_view_notification");
        //Check notification item list
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]"),
                "You reward 10 stars to Oliver Sovann.");
        //Click on item list
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
        //Check notification title

        //Check Sender Name
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name_sender"),"Leon Pin");
        //Check Sender Position
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name_sender_position"), "QA Tester");
        //Receiver Name
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_project_name_receiver"), "Oliver Sovann");
        //Receiver Position
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_project_name_receiver_position"), "Project Manager");
        //Check Reward Categories
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_category"), "Effort: Very Good");
        //Check Reward Reason
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_reason"),
                "\"" + readExcelFile(9,1,"rewardStaff") + readExcelFile(10,1,"rewardStaff") + "\"");
        //Check label Approve by
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_approved_by"),"Automatically approved");
        //Tab back
        driver.navigate().back();
        //Tap back
        driver.navigate().back();
        //Success Reward
        int allocated = Integer.parseInt(readExcelFile(18,1,"userData")) - 10;
        String allocatedLeft = String.valueOf(allocated);
        writeExcelFile(18,1,"userData",allocatedLeft);
        //--write reason to excel
        int reason = Integer.parseInt(readExcelFile(10,1, "rewardStaff"))+1;
        String reasonNumber = String.valueOf(reason);
        writeExcelFile(10,1,"rewardStaff",reasonNumber);
    }

//TODO: Reward Superior with Manager...................................................................................

    @Test
    public void rewardStars_TCRS33(){
    //Login as Sender
        //Tap on Stars icon main screen
        clickById("com.pathmazing.stars:id/image_view_star_reward");
        //Tap on staff reward icon
        tap(300,1700);
    }

    @Test
    public void rewardStars_TCRS34(){
        //Search for superior
        //Tap on search
        clickById("com.pathmazing.stars:id/menu_bar_search");
        //Search receiver account
        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee", "Samantha");
        //Click on search item
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
    }

    @Test
    public void rewardStars_TCRS35(){
    //Check Screen
        //Check Name
        Assert.assertEquals(getText("com.pathmazing.stars:id/tvName"), "Samantha");
        //Check Position
        Assert.assertEquals(getText("com.pathmazing.stars:id/tvPosition"), "Project Manager");
        //Enter Suggest Categories
        clickById("com.pathmazing.stars:id/edit_text_category");
        //Choose Suggestion Categories
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.view.View");
        //Change Stars from suggestion to 10
        sendKeyById("com.pathmazing.stars:id/edit_text_point","10");
        //Enter Reason
        sendKeyById("com.pathmazing.stars:id/edit_text_reason", readExcelFile(9,1, "rewardStaff") + readExcelFile(10,1,"rewardStaff"));
        //Tap on Submit Button
        clickById("com.pathmazing.stars:id/button_submit");
    }

    @Test
    public void rewardStars_TCRS36() {
    //Submit the request
        //Check name on pop up confirm
        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewVipName"), "Samantha Sam");
        //Check position
        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewVipPosition"), "Project Manager");
        //Check Stars Reward
        Assert.assertEquals(getText("com.pathmazing.stars:id/textViewRewardQuantity"), "10");
        //Tab submit button on confirmed pop up
        clickById("com.pathmazing.stars:id/button_ok_label");
        //Check message successful text
        Assert.assertEquals(getText("android:id/message"), "Your request has been successfully submitted");
        //Tap on OK button
        clickById("android:id/button1");
        //Redirect to Staff list and click on cross icon
        clickById("com.pathmazing.stars:id/btnCloseSearch");
        //click on back
        clickBtnBack();
        //Log out
        logout();
    }

    @Test
    public void rewardStars_TCRS37(){
    //Log in as Manager of Superior
        //Enter email
        sendKeyById("com.pathmazing.stars:id/edit_text_email", "logan.pa@mailinator.com");
        //Enter Password
        sendKeyById("com.pathmazing.stars:id/edit_text_password", "Stars@2019");
        //Show password
        clickXpathElement("//android.widget.ImageButton[@content-desc=\"Show password\"]");
        //Tap on button log in
        clickById("com.pathmazing.stars:id/button_login");
    }

    @Test
    public void rewardStars_TCRS38(){
        //TODO: Approve by manager
    }


}
