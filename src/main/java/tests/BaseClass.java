package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

	public AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "oneplus");
			cap.setCapability("udid", "88960370");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10");
			cap.setCapability("appPackage", "com.pathmazing.stars");
			cap.setCapability("appActivity", "com.pathmazing.stars.ui.activities.SplashScreen2Activity");//LoginActivity
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		} catch (Exception exp) {
			System.out.print("Cause is: " + exp);
			System.out.print("Message: " + exp.getMessage());
			exp.printStackTrace();
		}

	}

	@Test
	public void sampleTest() {
		System.out.print("Success running TestNG...");
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

	public void clickBtnBack(){
		MobileElement btnBack = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		btnBack.click();
	}

	public void clickIdElement(String element){
		MobileElement click = driver.findElement(By.id(element));
		click.click();
	}

	public void clickXpathElement(String element){
		MobileElement click = driver.findElement(By.xpath(element));
		click.click();
	}

	public String getText(String element){
		MobileElement getText = driver.findElement(By.id(element));
		return getText.getText();
	}

	public String readExcelFile(int row, int column){
		XSSFWorkbook wb;
		XSSFCell cell;
		XSSFSheet sh;
		String value="";
		try{
			FileInputStream fis = new FileInputStream("C:\\Users\\PathmazingPC\\Desktop\\Staff Data\\staffdata.xlsx");
			wb = (XSSFWorkbook) WorkbookFactory.create(fis);
			sh = wb.getSheet("data");
			//int noOfRow = sh.getLastRowNum();
			//System.out.println("The row number is: "+noOfRow);
			cell = sh.getRow(row).getCell(column);
			value=(cell.toString());

		}catch (Exception exp){
			System.out.println(exp.getMessage());
		}
		return value;
	}

	public void scrollUsingTouchAction(String direction){
		Dimension dim = driver.manage().window().getSize();
		int x = dim.getWidth()/2;
		int startY=0;
		int endY = 0;
		switch (direction){
			case "up":
				startY = (int)(dim.getHeight()*0.8);
				endY = (int)(dim.getHeight()*0.2);
				break;
			case "down":
				startY = (int)(dim.getHeight()*0.2);
				endY = (int)(dim.getHeight()*0.8);
				break;
		}
		TouchAction action = new TouchAction((driver));
		action.press(PointOption.point(x,startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(x,endY)).release().perform();
	}

	public void print(String message) {
		System.out.print(message);
	}
}
