package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StaffList extends BaseClass {

    @Test
    public void staffList_TCSL01(){
        loginStaff();
        //Check number of Total Staff
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView");
        String navTitle = getText("com.pathmazing.stars:id/employeeToolbarTitle");
        String totalNumber = readExcelFile(9,1,"orgData")+" Staff";
        Assert.assertEquals(navTitle,totalNumber);
    }

    @Test
    public void staffList_TCSL02(){
        //Staff List is displayed in Alphabet order
        for(int i=1;i<=3;i++){
            String staff = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
            Assert.assertEquals(staff, readExcelFile(11+i, 0, "orgData"));
            print(staff+" ");
            String position = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
            Assert.assertEquals(position, readExcelFile(11+i,2,"orgData"));
            print(position+" ");
            String stars = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
            Assert.assertEquals(stars,readExcelFile(11+i,1,"orgData"));
            print(stars+" \n");
        }
    }

    @Test
    public void staffList_TCSL03(){
         //Staff's stars earned
        for(int i=1;i<=3;i++) {
            String stars = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[" + i + "]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
            Assert.assertEquals(stars, readExcelFile(11 + i, 1, "orgData"));
            print(stars + " \n");
        }
    }

    @Test
    public void staffList_TCSL04(){
        //User Info
        for(int i=1;i<=3;i++){
            String staff = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
            Assert.assertEquals(staff, readExcelFile(11+i, 0, "orgData"));
            print(staff+" ");
            String position = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
            Assert.assertEquals(position, readExcelFile(11+i,2,"orgData"));
            print(position+" ");
            String stars = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
            Assert.assertEquals(stars,readExcelFile(11+i,1,"orgData"));
            print(stars+" \n");
        }
    }

    @Test
    public void staffList_TCSL06(){
        //Tap on staff name
        String name = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.view.View");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_view_full_name"),name);
        driver.navigate().back();
    }

    @Test
    public void staffList_TCSL07(){
        //Tap on search icon
        clickById("com.pathmazing.stars:id/menu_bar_search");
        clickById("com.pathmazing.stars:id/btnCloseSearch");
    }

    @Test
    public void staffList_TCSL08(){
        //Search Staff
        clickById("com.pathmazing.stars:id/menu_bar_search");
        sendKeyById("com.pathmazing.stars:id/tvSearchEmployee","Leon");
        String staff = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
        Assert.assertEquals(staff, readExcelFile(13, 0, "orgData"));
        print(staff+" ");
        String position = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
        Assert.assertEquals(position, readExcelFile(13,2,"orgData"));
        print(position+" ");
        String stars = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
        Assert.assertEquals(stars,readExcelFile(13,1,"orgData"));
        print(stars+" \n");
    }

    @Test
    public void staffList_TCSL09() {
        clickById("com.pathmazing.stars:id/btnCloseSearch");
    }

    @Test
    public void staffList_TCSL10() {
        //Tap on heart icon
        clickById("com.pathmazing.stars:id/menu_bar_favorite");
        String staff = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
        Assert.assertEquals(staff, readExcelFile(14, 0, "orgData"));
        print(staff+" ");
        String position = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
        Assert.assertEquals(position, readExcelFile(14,2,"orgData"));
        print(position+" ");
        String stars = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
        Assert.assertEquals(stars,readExcelFile(14,1,"orgData"));
        print(stars+" \n");
        clickById("com.pathmazing.stars:id/menu_bar_favorite");
    }

    @Test
    public void staffList_TCSL11() {
        //Tap on grid
        clickById("com.pathmazing.stars:id/menu_bar_change");
        for(int i=1;i<=3;i++){
            String staff = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.TextView");
            Assert.assertEquals(staff, readExcelFile(11+i, 0, "orgData"));
            print(staff+" ");
        }
    }

    @Test
    public void staffList_TCSL12() {
        //Tap on filter icon
        clickById("com.pathmazing.stars:id/menu_bar_filter");
    }

    @Test
    public void staffList_TCSL13() {
        //Tap on filter icon
        //Filter by male
        clickById("com.pathmazing.stars:id/rbDefaultMale");
        clickById("com.pathmazing.stars:id/btn_ok");
        for(int i=1;i<=3;i++){
            String staff = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.TextView");
            Assert.assertEquals(staff, readExcelFile(11+i, 0, "orgData"));
            print(staff+" \n");
        }

        //Filter by female
        clickById("com.pathmazing.stars:id/menu_bar_filter");
        clickById("com.pathmazing.stars:id/rbDefaultFemale");
        clickById("com.pathmazing.stars:id/btn_ok");
        Assert.assertEquals(getText("com.pathmazing.stars:id/text_msg"), "No staff found");

        //Filter Project Manager
        clickById("com.pathmazing.stars:id/menu_bar_filter");
        clickById("com.pathmazing.stars:id/rbAll");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.CheckBox");
        clickById("com.pathmazing.stars:id/btn_ok");
        for(int i=1;i<=1;i++){
            String staff = getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.TextView");
            Assert.assertEquals(staff, readExcelFile(5+i, 1, "staffList"));
            print(staff+" ");
        }

        //Resetting Filter
        clickById("com.pathmazing.stars:id/menu_bar_filter");
        clickById("com.pathmazing.stars:id/image_view_filter");
        clickById("com.pathmazing.stars:id/btn_ok");
    }

    @Test
    public void staffList_TCSL14(){
        driver.navigate().back();
        logout();
    }


}







