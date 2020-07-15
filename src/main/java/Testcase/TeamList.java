package Testcase;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;

import java.time.Duration;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class TeamList extends BaseClass {

    @Test
    public void teamList_TCTL01() throws InterruptedException {
        loginStaff();
//        Thread.sleep(4000);
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.tap(PointOption.point(525, 281)).perform();
//
//        Thread.sleep(4000);
//        TouchAction swipe = new TouchAction(driver);
//        swipe.press(PointOption.point(972,570))
//                .waitAction(waitOptions(Duration.ofMillis(800)))
//                .moveTo(PointOption.point(10,570))
//                .release()
//                .perform();

        //Total Numbers of Team

    }
}

