package Testcase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamList extends BaseClass {

    @Test
    public void teamList_TCTL01(){
        loginStaff();
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.view.ViewGroup/android.widget.RelativeLayout");
        Assert.assertEquals(getText("com.pathmazing.stars:id/employeeToolbarTitle"),readExcelFile(1,1,"teamList")+" Teams");
    }

    @Test
    public void teamList_TCTL02(){
        //Check teams info
        int totalTeam = Integer.parseInt(readExcelFile(1,1,"teamList"));
        int j=2;
        //Check team Name
        for(int i=1;i<=totalTeam;i++){
              Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]"),
              readExcelFile(j,1,"teamList"));

              print(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")+"\n");
              Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]"),
                      readExcelFile(j,2,"teamList"));

              Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"),
                      readExcelFile(j+9,4,"teamList"));
            j+=10;
        }
    }

    @Test
    public void teamList_TCTL03(){

    }

    @Test
    public void teamList_TCTL04(){
        //Tap on grid icon
        clickById("com.pathmazing.stars:id/menu_bar_change");
        int totalTeam = Integer.parseInt(readExcelFile(1,1,"teamList"));
        int j=2;
        for(int i=1;i<=totalTeam;i++){
            Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.TextView"),
                    readExcelFile(j,1,"teamList"));
            print(readExcelFile(j,1,"teamList")+"\n");
            j+=10;
        }
    }

    @Test
    public void teamList_TCTL05(){
        //Search Team
        clickById("com.pathmazing.stars:id/menu_bar_search");
        clickById("com.pathmazing.stars:id/btnCloseSearch");

    }

    @Test
    public void teamList_TCTL06(){
        //Search team
        clickById("com.pathmazing.stars:id/menu_bar_search");

        //Search not exist team
        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee","Wrong team name search");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_msg"),"No teams found");

        //Search with long name
        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee","This is the test: Wrong team name search Wrong team name search Wrong team name search Wrong team name search ");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_msg"),"No teams found");

        //Search correct team name
        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee","Coke Team");
        Assert.assertEquals(getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView"),"Coke Team");

        clickById("com.pathmazing.stars:id/btnCloseSearch");
    }

    @Test
    public void teamList_TCTL07(){
        //Tap on team list
        int totalTeam = Integer.parseInt(readExcelFile(1,1,"teamList"));
        for(int i=1;i<=totalTeam;i++){
            String teamName = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.TextView");
            clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.TextView");
            Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_full_name"),teamName);
            clickBtnBack();
        }
    }

}

