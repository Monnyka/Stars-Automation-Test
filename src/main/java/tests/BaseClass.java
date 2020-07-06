package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
		cap.setCapability("deviceName","oneplus" );
		cap.setCapability("udid","88960370" );
		cap.setCapability("platformName","Android" );
		cap.setCapability("platformVersion","10");
		cap.setCapability("appPackage","com.pathmazing.stars" );
		cap.setCapability("appActivity","com.pathmazing.stars.ui.activities.SplashScreen2Activity" );//LoginActivity
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		}catch(Exception exp) {
			System.out.print("Cause is: "+exp);
			System.out.print("Message: "+exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	@Test
	public void sampleTest() {
		System.out.print("Success runing TestNG...");
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

//	public String readExcelField(int vRow, int vColumn){
////			String value=null;          //variable for storing the cell value
////			Workbook wb=null;
////			//initialize Workbook null
////			try
////			{
////			//reading data from a file in the form of bytes
////				FileInputStream fis=new FileInputStream("./EmployeeData.xlsx");
////			//constructs an XSSFWorkbook object, by buffering the whole stream into the memory
////				wb=new XSSFWorkbook(fis);
////			}
////			catch(FileNotFoundException e)
////			{
////				e.printStackTrace();
////			}
////			catch(IOException e1)
////			{
////				e1.printStackTrace();
////			}
////			Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index
////			Row row=sheet.getRow(vRow); //returns the logical row
////			Cell cell=row.getCell(vColumn); //getting the cell representing the given column
////			value=cell.getStringCellValue();    //getting cell value
//			return
//	}

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
		String text = getText.getText();
		return text;
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
