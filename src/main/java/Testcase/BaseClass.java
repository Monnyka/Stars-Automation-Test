package Testcase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class BaseClass {

    public AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup() {
//        try {
//            DesiredCapabilities cap = new DesiredCapabilities();
//            cap.setCapability("deviceName", "oneplus");
//            cap.setCapability("udid", "88960370");
//            cap.setCapability("platformName", "Android");
//            cap.setCapability("platformVersion", "10");
//            cap.setCapability("appPackage", "com.pathmazing.stars");
//            cap.setCapability("appActivity", "com.pathmazing.stars.ui.activities.SplashScreen2Activity");//LoginActivity
//            URL url = new URL("http://127.0.0.1:4723/wd/hub");
//            driver = new AppiumDriver<>(url, cap);
//            //mobile element
//            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        } catch (Exception exp) {
//            System.out.print("Cause is: " + exp);
//            System.out.print("Message: " + exp.getMessage());
//            exp.printStackTrace();
//        }

    }

    @BeforeClass
    public void BeforeClass() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "oneplus");
            cap.setCapability("udid", "88960370");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "10");
            cap.setCapability("appPackage", "com.pathmazing.stars");
            cap.setCapability("appActivity", "com.pathmazing.stars.ui.activities.SplashScreen2Activity");//LoginActivity
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<>(url, cap);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (Exception exp) {
            System.out.print("Cause is: " + exp);
            System.out.print("Message: " + exp.getMessage());
            exp.printStackTrace();
        }
    }

    @AfterTest
    public void teardown() {
        //driver.quit();
    }

    public void setFail() {
        ITestResult result = null;
        result.setStatus(ITestResult.FAILURE);
        Reporter.setCurrentTestResult(result);
    }

    public boolean checkViewDisplay(String id){
        MobileElement element = driver.findElement(By.id(id));
        return element.isDisplayed();
    }

    public void clickBtnBack() {
        MobileElement btnBack = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
        btnBack.click();
    }

    public void clickById(String id) {
        MobileElement click = driver.findElement(By.id(id));
        click.click();
    }

    public void sendKeyById(String id, String key) {
        MobileElement sendKeyElement = driver.findElement(By.id(id));
        sendKeyElement.sendKeys(key);
    }

    public void clickXpathElement(String element) {
        MobileElement click = driver.findElement(By.xpath(element));
        click.click();
    }

    public String getText(String element) {
        MobileElement getText = driver.findElement(By.id(element));
        return getText.getText();
    }

    public String getTextByXpath(String element) {
        MobileElement getText = driver.findElement(By.xpath(element));
        return getText.getText();
    }

    public String readExcelFile(int row, int column, String sheetName) {
        XSSFWorkbook wb;
        XSSFCell cell;
        XSSFSheet sh;
        String value = "";
        try {
            FileInputStream fis = new FileInputStream("./data.xlsx");
            wb = (XSSFWorkbook) WorkbookFactory.create(fis);
            sh = wb.getSheet(sheetName);
            //int noOfRow = sh.getLastRowNum();
            //System.out.println("The row number is: "+noOfRow);
            cell = sh.getRow(row).getCell(column);
            value = (cell.toString());

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
        return value;
    }

    public void writeExcelFile(int cRow, int cColumn, String sheetName, String value) {
        XSSFWorkbook wb;
        XSSFCell cell;
        XSSFSheet sh;
        try {
            FileInputStream fis = new FileInputStream("./data.xlsx");
            wb = (XSSFWorkbook) WorkbookFactory.create(fis);
            sh = wb.getSheet(sheetName);
            XSSFRow row = sh.createRow(cRow);
            cell = row.createCell(cColumn);
            cell.setCellValue(value);
            FileOutputStream fos = new FileOutputStream("./data.xlsx");
            wb.write(fos);
            fos.flush();
            fos.close();
            System.out.println("Record has been updated successfully");

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }

    public void scrollUsingTouchAction(String direction) {
        Dimension dim = driver.manage().window().getSize();
        int x = dim.getWidth() / 2;
        int startY = 0;
        int endY = 0;
        switch (direction) {
            case "up":
                startY = (int) (dim.getHeight() * 0.8);
                endY = (int) (dim.getHeight() * 0.2);
                break;
            case "down":
                startY = (int) (dim.getHeight() * 0.2);
                endY = (int) (dim.getHeight() * 0.8);
                break;
        }
        TouchAction action = new TouchAction((driver));
        action.press(PointOption.point(x, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(x, endY)).release().perform();
    }

    public void scroll(int startX,int startY, int endX,int endY){
        TouchAction swipe = new TouchAction(driver);
        swipe.press(PointOption.point(startX,startY))
                .waitAction(waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(endX,endY))
                .release()
                .perform();
    }

    public void longPress(int startX,int startY, int endX,int endY){
        TouchAction swipe = new TouchAction(driver);
        swipe.longPress(PointOption.point(startX,startY))
                .waitAction(waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(endX,endY))
                .release()
                .perform();
    }

    public void clickOnReaction(String xpath,int mEndX){
        MobileElement as = driver.findElement(By.xpath(xpath));
        Point reactIconLocation = as.getLocation();
        longPress(reactIconLocation.x,reactIconLocation.y,reactIconLocation.x+mEndX,reactIconLocation.y);
    }


    public void tap(int x,int y){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y)).perform();
    }
    public void waitImplicitly() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void print(String message) {
        System.out.print(message);
    }

    public void loginStaff() {
        String userEmail = readExcelFile(6, 1, "userData");
        String userPassword = readExcelFile(12, 1, "userData");
        sendKeyById("com.pathmazing.stars:id/edit_text_email", userEmail);
        sendKeyById("com.pathmazing.stars:id/edit_text_password", userPassword);
        clickXpathElement("//android.widget.ImageButton[@content-desc=\"Show password\"]");
        clickById("com.pathmazing.stars:id/button_login");
        clickById("com.pathmazing.stars:id/text_view_fingerprint_later");
    }

    public void loginStaff2() {
        String userEmail = readExcelFile(6, 1, "userData");
        String userPassword = readExcelFile(12, 1, "userData");
        sendKeyById("com.pathmazing.stars:id/edit_text_email", userEmail);
        sendKeyById("com.pathmazing.stars:id/edit_text_password", userPassword);
        clickXpathElement("//android.widget.ImageButton[@content-desc=\"Show password\"]");
        clickById("com.pathmazing.stars:id/button_login");
    }

    public void logout() {
        //logout
        clickById("com.pathmazing.stars:id/image_view_menu");
        clickXpathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[10]/android.view.ViewGroup/android.widget.RelativeLayout");
        String message = getText("android:id/message");
        Assert.assertEquals(message, "Are you sure you want to log out?");
        clickById("android:id/button1");
    }

    public String getReferenceImageB64(String imgPath) throws URISyntaxException, IOException {
        URL refImgUrl = getClass().getClassLoader().getResource(imgPath);
        File refImgFile = Paths.get(refImgUrl.toURI()).toFile();
        return Base64.getEncoder().encodeToString(Files.readAllBytes(refImgFile.toPath()));
    }

    public void loginAsManager(){
        sendKeyById("com.pathmazing.stars:id/edit_text_email", "oliver.pa@mailinator.com");
        sendKeyById("com.pathmazing.stars:id/edit_text_password", "Stars@2019");
        clickXpathElement("//android.widget.ImageButton[@content-desc=\"Show password\"]");
        clickById("com.pathmazing.stars:id/button_login");
    }

    public String getTimeAMPM(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm aa");
        String formattedDate = dateFormat.format(new Date()).toString();
        System.out.println(formattedDate);
        return formattedDate;
    }

}
