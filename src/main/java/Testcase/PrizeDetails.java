package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrizeDetails extends BaseClass {

    @Test
    public void prizeDetails_TCPD01() {
        loginStaff();
        scrollUsingTouchAction("down");
        clickById("com.pathmazing.stars:id/redeemable_view");
        clickById("com.pathmazing.stars:id/text_view_qty_redeem_prize");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_titleBar"), "Prize Details");
    }

    @Test
    public void prizeDetails_TCPD02(){
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_redeem_prize_title"),readExcelFile(4,0,"orgData"));
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_description_redeem_prize"),readExcelFile(4,3,"orgData"));
    }

    @Test
    public void prizeDetails_TCPD03(){
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_my_remain_start"),readExcelFile(4,1,"orgData"));
        Assert.assertEquals(getText("com.pathmazing.stars:id/tvStar"),"Stars");
        Assert.assertEquals(getText("com.pathmazing.stars:id/btn_redeem_prize"),"Redeem");
    }

    @Test
    public void prizeDetails_TCPD04(){
        clickById("com.pathmazing.stars:id/btn_redeem_prize");
        Assert.assertEquals(getText("android:id/message"), "Are you sure you want to redeem this item?");
        clickById("android:id/button2");
    }

    @Test
    public void prizeDetails_TCPD05(){
        clickById("com.pathmazing.stars:id/btn_redeem_prize");
        Assert.assertEquals(getText("android:id/message"), "Are you sure you want to redeem this item?");
        clickById("android:id/button1");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_description"),"Congratulations! Your redemption of Coke Can 330ml is being processed. Please reach out to the HR Department to coordinate its delivery.");
        driver.navigate().back();
        String balance = readExcelFile(15,1,"userData");
        int redeemBalance = Integer.parseInt(balance);
        String item = readExcelFile(4,1,"orgData");
        int itemPrize = Integer.parseInt(item);
        int balanceLeft = redeemBalance-itemPrize;
        String availableBalance = String.valueOf(balanceLeft);
        writeExcelFile(15,1, "userData", availableBalance);
        driver.navigate().back();
        driver.navigate().back();
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_redeem_star"), readExcelFile(15,1,"userData"));
        logout();
    }
}
