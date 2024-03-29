package Testcase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class MainScreen extends BaseClass {

    @Test
    public void mainScreen_TCMC01() {
        //login
        loginStaff();
//		Check screen
        MobileElement btnNotification = driver.findElement(By.id("com.pathmazing.stars:id/image_view_notification"));
        btnNotification.click();
        MobileElement navTitle = driver.findElement(By.id("com.pathmazing.stars:id/text_view_titleBar"));
        String navTitleText = navTitle.getText();
        Assert.assertEquals(navTitleText,"Notifications");
        clickBtnBack();
    }

    @Test
    public void mainScreen_TCMS01() {
//		Check screen
        scrollUsingTouchAction("down");
        String earnedThisMothText = getText("com.pathmazing.stars:id/text_view_star_rewarded");
        String lastMonthLabelText = getText("com.pathmazing.stars:id/tv_title_last_month");
        MobileElement allTimeLabel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]"));
        String allTimeLabelText = allTimeLabel.getText();
        if (!earnedThisMothText.equals("Earned This Month") && !lastMonthLabelText.equals("Last Month") && !allTimeLabelText.equals("All Time")) {
            setFail();
            print("Wrong label");
        }
        String earnedThisMonth = readExcelFile(21, 1, "userData");
        String earnedThisMonthNumber = getText("com.pathmazing.stars:id/text_view_earn_point_this_month");
        Assert.assertEquals(earnedThisMonth,earnedThisMonthNumber);
    }

    @Test
    public void mainScreen_TCMS02() {
        //Earn Last month
        String earnedLastMonth = readExcelFile(24, 1, "userData");
        String earnedLastMonthNumber = getText("com.pathmazing.stars:id/text_view_earn_point_last_month");
        Assert.assertEquals(earnedLastMonth,earnedLastMonthNumber);
        Assert.assertEquals(getText("com.pathmazing.stars:id/tv_title_redeemable"),"Redeemable Balance");
    }

    @Test
    public void mainScreen_TCMS03() {
        String allTime = readExcelFile(27, 1,"userData");
        String allTimeNumber = getText("com.pathmazing.stars:id/text_view_earn_point_total");
        Assert.assertEquals(allTime,allTimeNumber);
    }

    @Test
    public void mainScreen_TCMS04() {
        String redeemBalance = readExcelFile(15, 1,"userData");
        String redeemBalanceNumber = getText("com.pathmazing.stars:id/text_view_redeem_star");
        Assert.assertEquals(redeemBalance,redeemBalanceNumber);
    }

    @Test
    public void mainScreen_TCMS05() {
        clickById("com.pathmazing.stars:id/redeemable_view");
        String navTitle = getText("com.pathmazing.stars:id/tv_title");
        Assert.assertEquals(navTitle,"Prizes To Redeem");
        clickById("com.pathmazing.stars:id/ic_back");
    }

    @Test
    public void mainScreen_TCMS08() throws InterruptedException {
        //Todo add function definition
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(525, 281)).perform();

        Thread.sleep(4000);
        TouchAction swipe = new TouchAction(driver);
        swipe.press(PointOption.point(972,570))
                .waitAction(waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(10,570))
                .release()
                .perform();
    }

    @Test
    public void mainScreen_TCMS09() {
        clickById("com.pathmazing.stars:id/image_view_menu");
        String userName = getText("text_view_name");
        Assert.assertNotNull(userName);
        driver.navigate().back();
    }

    @Test
    public void mainScreen_TCMS10() {
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickById("com.pathmazing.stars:id/view_block_profile");
        String username = getText("com.pathmazing.stars:id/text_view_full_name");
        Assert.assertNotNull(username);
        driver.navigate().back();
    }

    @Test
    public void mainScreen_TCMS11() {
        //Click on Prizes
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navTitle = getText("com.pathmazing.stars:id/tv_title");
        Assert.assertEquals(navTitle,"Prizes To Redeem");
        clickById("com.pathmazing.stars:id/ic_back");

        //Click on Auction
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navAucTitle = getText("com.pathmazing.stars:id/tv_title");
        Assert.assertEquals(navAucTitle,"Auction");
        clickById("com.pathmazing.stars:id/ic_back");

        //Click on Stars Activity
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navStarsActivitiesTitle = getText("com.pathmazing.stars:id/text_view_titleBar");
        Assert.assertEquals(navStarsActivitiesTitle,"Star Activities");
        clickBtnBack();

        //Click on Calendar
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navCalendarTitle = getText("com.pathmazing.stars:id/tvToolbarTitle");
        Assert.assertNotNull(navCalendarTitle);
        clickBtnBack();

        //Click on Staff List
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navStarsListTitle = getText("com.pathmazing.stars:id/employeeToolbarTitle");
        Assert.assertNotNull(navStarsListTitle);
        clickBtnBack();

        //Tap on Staff Ranking
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navStaffRankingTitle = getText("com.pathmazing.stars:id/text_view_toolbar_title");
        if (!navStaffRankingTitle.equals("Top Staff of the Month")) {
            setFail();
        }
        clickBtnBack();

        //Tap on Team List Menu
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navTeamTitle = getText("com.pathmazing.stars:id/employeeToolbarTitle");
        if (navTeamTitle.equals("")) {
            setFail();
        }
        clickBtnBack();

        //Tap on Team Ranking
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navTeamRankingTitle = getText("com.pathmazing.stars:id/text_view_toolbar_title");
        if (!navTeamRankingTitle.equals("Top Teams of the Month")) {
            setFail();
        }
        clickBtnBack();

        //Tap on Settings
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.view.ViewGroup/android.widget.RelativeLayout");
        String navSettingsTitle = getText("com.pathmazing.stars:id/text_view_titleBar");
        if (!navSettingsTitle.equals("Settings")) {
            setFail();
        }
        clickBtnBack();

        //Tap on Log out
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[10]/android.view.ViewGroup/android.widget.RelativeLayout");
        String message = getText("android:id/message");
        if (!message.equals("Are you sure you want to log out?")) {
            setFail();
        }
        clickById("android:id/button2");
    }

    @Test
    public void mainScreen_TCMS13() {
        clickById("com.pathmazing.stars:id/img_header_top_team");
        String navTeamRankingTitle = getText("com.pathmazing.stars:id/text_view_toolbar_title");
        if (!navTeamRankingTitle.equals("Top Teams of the Month")) {
            setFail();
        }
        clickBtnBack();
    }

    @Test
    public void mainScreen_TCMS14() {
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
        String teamName = getText("com.pathmazing.stars:id/text_view_full_name");
        if (teamName.equals("")) {
            setFail();
        }
        driver.navigate().back();
    }

    @Test
    public void mainScreen_TCMS15() {
        clickById("com.pathmazing.stars:id/img_header_top_staff");
        String navStaffRankingTitle = getText("com.pathmazing.stars:id/text_view_toolbar_title");
        if (!navStaffRankingTitle.equals("Top Staff of the Month")) {
            setFail();
        }
        clickBtnBack();
    }

    @Test
    public void mainScreen_TCMS16() {
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
        String userName = getText("com.pathmazing.stars:id/text_view_full_name");
        Assert.assertNotNull(userName);
        driver.navigate().back();
    }

    @Test
    public void mainScreen_TCMS18() {
        scrollUsingTouchAction("up");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView");
    }

    @Test
    public void mainScreen_TCMS20(){
        //Tap on count down event
        scrollUsingTouchAction("down");
        scrollUsingTouchAction("down");
        clickById("com.pathmazing.stars:id/layout_calendar");
        String navTitle = getText("com.pathmazing.stars:id/tvToolbarTitle");
        Assert.assertNotNull(navTitle);
        clickBtnBack();
    }

    @Test
    public void mainScreen_TCMS21(){
        //Allocated Balance
        String allocatedStars = readExcelFile(18,1, "userData");
        String allocatedStarsLabel = getText("com.pathmazing.stars:id/text_view_give_away_star");
        Assert.assertEquals(allocatedStarsLabel,allocatedStars);
        //Check Label Balance
        String balanceLabel = getText("com.pathmazing.stars:id/text_view_star_left");
        Assert.assertEquals(balanceLabel,"Balance");
    }

    @Test
    public void mainScreen_TCMS22(){
        //Tap on allocated Balance
        String allocatedStarsLabel = getText("com.pathmazing.stars:id/text_view_give_away_star");
        if(!allocatedStarsLabel.equals("0")) {
            clickById("com.pathmazing.stars:id/image_view_star_reward");
            clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView[2]");
            String navTitle = getText("com.pathmazing.stars:id/employeeToolbarTitle");
            Assert.assertNotNull(navTitle);
            clickBtnBack();
        }
    }

    @Test
    public void mainScreen_TCMS23(){
        //Tap on Staff button
        String staffLabel = getText("com.pathmazing.stars:id/tv_staff");
        Assert.assertEquals(staffLabel,"Staff");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView");
        String navTitle = getText("com.pathmazing.stars:id/employeeToolbarTitle");
        Assert.assertNotNull(navTitle);
        clickBtnBack();
    }

    @Test
    public void mainScreen_TCMS24(){
        driver.navigate().back();
        driver.navigate().back();
    }


}
