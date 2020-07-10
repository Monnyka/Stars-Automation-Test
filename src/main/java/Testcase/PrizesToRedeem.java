package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrizesToRedeem extends BaseClass{

    @Test
    public void prize_TCRI01(){
        loginStaff();
        //Prizes To Redeem
        scrollUsingTouchAction("down");
        clickById("com.pathmazing.stars:id/redeemable_view");
        String navTitle = getText("com.pathmazing.stars:id/tv_title");
        Assert.assertEquals(navTitle,"Prizes To Redeem");
    }

    @Test
    public void prize_TCRI02(){
        //Item Name
        String titlePrize1 = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]");
        String eTitlePrize1 = readExcelFile(4,0,"orgData");
        Assert.assertEquals(titlePrize1,eTitlePrize1);
        //Item Price
        String itemLeft = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
        String eItemLeft = readExcelFile(4, 1, "orgData");
        Assert.assertEquals(itemLeft,eItemLeft);
        //Item Description
        String itemDesc = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]");
        String eItemsDesc = readExcelFile(4,3,"orgData");
        Assert.assertEquals(itemDesc,eItemsDesc);
    }

    @Test
    public void prize_TCRI03(){
        clickById("com.pathmazing.stars:id/ic_search");
    }

    @Test
    public void prize_TCRI04(){
        sendKeyById("com.pathmazing.stars:id/ed_search","Redbull(no item found test)");
        waitImplicitly();
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_msg"),"No Prizes Found");
        clickById("com.pathmazing.stars:id/iv_close");
        prize_TCRI02();
        //Search Exist Item
        clickById("com.pathmazing.stars:id/ic_search");
        sendKeyById("com.pathmazing.stars:id/ed_search","One plus 8 Pro");
        String titlePrize1 = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]");
        String eTitlePrize1 = readExcelFile(5,0,"orgData");
        Assert.assertEquals(titlePrize1,eTitlePrize1);
        //Item Price
        String itemLeft = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
        String eItemLeft = readExcelFile(5, 1, "orgData");
        Assert.assertEquals(itemLeft,eItemLeft);
        //Item Description
        String itemDesc = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]");
        String eItemsDesc = readExcelFile(5,3,"orgData");
        Assert.assertEquals(itemDesc,eItemsDesc);
        clickById("com.pathmazing.stars:id/iv_close");
    }

    @Test
    public void prize_TCRI05(){
        waitImplicitly();
        //Search by typing in complex item's name
        clickById("com.pathmazing.stars:id/ic_search");
        clickById("com.pathmazing.stars:id/ic_search");
        sendKeyById("com.pathmazing.stars:id/ed_search","one PLUS 8 PRo");
        String titlePrize1 = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]");
        String eTitlePrize1 = readExcelFile(5,0,"orgData");
        Assert.assertEquals(titlePrize1,eTitlePrize1);
        //Item Price
        String itemLeft = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
        String eItemLeft = readExcelFile(5, 1, "orgData");
        Assert.assertEquals(itemLeft,eItemLeft);
        //Item Description
        String itemDesc = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]");
        String eItemsDesc = readExcelFile(5,3,"orgData");
        Assert.assertEquals(itemDesc,eItemsDesc);
        clickById("com.pathmazing.stars:id/iv_close");
    }

    @Test
    public void prize_TCRI06(){
        clickById("com.pathmazing.stars:id/image_view_redeem_prize");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_titleBar"),"Prize Details");
        clickBtnBack();
    }

    @Test
    public void prize_TCRI07(){
        clickById("com.pathmazing.stars:id/ic_back");
    }
}
