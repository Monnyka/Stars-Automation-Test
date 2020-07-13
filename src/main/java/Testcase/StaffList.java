package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StaffList extends BaseClass{

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




}
