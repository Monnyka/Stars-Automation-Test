package Testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Profile extends BaseClass{

    @Test
    public void profile_TCPF00(){
        loginStaff();
        //Goto screen profile
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickById("com.pathmazing.stars:id/view_block_profile");
    }

    @Test
    public void profile_TCPF01(){
        //driver.findElementByImage(getReferenceImageB64("C:\\Users\\PathmazingPC\\Desktop\\a.jpg")).click();

        //User Name
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_full_name"),readExcelFile(3,1,"userData"));
        //Position
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_position"),readExcelFile(33,1,"userData"));
    }

    @Test
    public void profile_TCPF02(){
        //Earned Stars Label and number
        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_earned_this_month"),readExcelFile(21,1,"userData"));
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]"),"Earned\nThis Month");
    }

    @Test
    public void profile_TCPF03(){
        //Earned All Time
        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_earned_all_time"),readExcelFile(27,1,"userData"));
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]"),"Earned\nAll Time");
    }

    @Test
    public void profile_TCPF04(){
        //Redeemable Balance
        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_redeemable_balance"),readExcelFile(15,1,"userData"));
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[2]"),"Redeemable\nBalance");
    }

    @Test
    public void profile_TCPF05(){
        //Allocated Balance
        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_to_reward_balance"), readExcelFile(18,1, "userData"));
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.TextView[2]"),"Allocated\nBalance");
    }

    @Test
    public void profile_TCPF06(){
        //Tapping on the stars balance view
        clickById("com.pathmazing.stars:id/view_points");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_titleBar"),"Star Activities");
        clickBtnBack();
    }

    @Test
    public void profile_TCPF07(){
        //Check hidden field
//        print(String.valueOf(checkViewDisplay("com.pathmazing.stars:id/text_view_duration")));
//        Assert.assertFalse(checkViewDisplay("com.pathmazing.stars:id/text_view_duration"));
//        Assert.assertFalse(checkViewDisplay("com.pathmazing.stars:id/text_view_email"));
//        Assert.assertFalse(checkViewDisplay("com.pathmazing.stars:id/text_view_adress"));
    }

    @Test
    public void profile_TCPF08(){
        //Click on View More button
        clickById("com.pathmazing.stars:id/tv_view_more");
        driver.findElement(By.id("com.pathmazing.stars:id/text_view_duration")).isDisplayed();
//        Assert.assertTrue(checkViewDisplay("com.pathmazing.stars:id/text_view_duration"));
//        Assert.assertTrue(checkViewDisplay("com.pathmazing.stars:id/text_view_email"));
//        Assert.assertTrue(checkViewDisplay("com.pathmazing.stars:id/text_view_adress"));
    }

    @Test
    public void profile_TCPF09(){
        //Tap on Performance Report
        clickById("com.pathmazing.stars:id/menu_performance_report");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_titleBar"), readExcelFile(3,1,"userData"));
        clickBtnBack();
    }

    @Test
    public void profile_TCPF10(){
        //Todo: Check User's team involve
    }

    @Test
    public void profile_TCPF11(){
        //Tapping on Change Password Screen
        clickById("com.pathmazing.stars:id/menu_bar_edit");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_titleBar"),"Change Password");
        clickBtnBack();
    }

    @Test
    public void profile_TCPF12(){
        //TODO: Click on the button Video
    }

    @Test
    public void profile_TCPF13(){
        //Tap on the button Profile Image
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View");
    }

    @Test
    public void profile_TCPF14(){
        //Tapping on QR image
        clickById("com.pathmazing.stars:id/image_show_qr");
        driver.findElement(By.id("com.pathmazing.stars:id/image_view_scan_qr")).isDisplayed();
        tap(500,1700);
    }

    @Test
    public void profile_TCPF15(){
        //Check Information Field
        //User ID
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"),"User ID");
        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_uid"),readExcelFile(42,1,"userData"));
        //Legal Name
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"),"Legal Name");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_name"),readExcelFile(30,1,"userData"));
        //Password
        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_profile_password"),"Password");
        //Gender
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.TextView[1]"),"Gender");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_gender"),readExcelFile(36,1,"userData"));
        //Mobile Number
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.TextView[1]"),"Mobile Number");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_mobile_number"),readExcelFile(9,1,"userData"));
        //Nationality
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"),"Nationality");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_nationality"),readExcelFile(39,1,"userData"));
        //Stars Date
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"),"Start Date");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_start_date1"),readExcelFile(45,1,"userData"));
        //Duration
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]"),"Duration");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_duration"),readExcelFile(48,1,"userData"));
        //Email
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[3]/android.widget.TextView[1]"),"Email");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_email"),readExcelFile(6,1,"userData"));
        scroll(500,1300,500,900);
        //Address
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[4]/android.widget.TextView[1]"),"Address");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_adress"),readExcelFile(51,1,"userData"));
    }

    @Test
    public void profile_TCPF16(){
        //Check title Name
        Assert.assertEquals(getText("com.pathmazing.stars:id/toolbar_profile_name"),readExcelFile(3,1,"userData"));
    }

    @Test
    public void profile_TCPF17(){
        //Check reaction
        scroll(500,1300,500,400);
        for(int i=1;i<=3;i++) {
            clickOnReaction("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["+i+"]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView",150*i);
        }
        driver.navigate().back();
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickById("com.pathmazing.stars:id/view_block_profile");
    }

    @Test
    public void profile_TCPF18(){
        //Test Scrolling
        scroll(500,1300,500,500);
        scroll(500,1300,500,500);
        scroll(500,1300,500,500);
        scroll(500,1300,500,500);
        scroll(500,1300,500,500);
        scroll(500,500,500,1300);
        scroll(500,500,500,1300);
        scroll(500,500,500,1300);
        scroll(500,500,500,1300);
        scroll(500,500,500,1300);
    }

}
