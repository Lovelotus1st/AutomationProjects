package com.amazon.automation;

import static com.automationprojects.common.AmazonConstants.*;

import java.io.IOException;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.automationprojects.common.Common;

public class LoginAmazonDataDriven extends Common {
	private static final Logger logger=LogManager.getLogger(LoginAmazonDataDriven.class); 
	@Test
	public void ClickSignIn() {
		Actions act=new Actions(driver);
		WebElement element= driver.findElement(By.xpath(XPATH_SIGNIN_MOUSEOVER));
		act.moveToElement(element).click().build().perform();
	}
	@Test(dataProvider="excelData", dependsOnMethods="ClickSignIn")
	public void f(String user_email, String user_pwd) {
		try{
//			driver.findElement(By.xpath(XPATH_EMAIL)).sendKeys(user_email);
//			driver.findElement(By.xpath(XPATH_PASSWORD)).sendKeys(user_pwd);
			driver.findElement(By.xpath(XPATH_EMAIL)).sendKeys(user_email);
			driver.findElement(By.xpath(XPATH_PASSWORD)).sendKeys(user_pwd);
			driver.findElement(By.xpath(XPATH_SIGNIN)).click();
			String msg=driver.findElement(By.xpath(XPATH_HELLO_MSG)).getText();
			Assert.assertTrue(msg.contains(SIGN_IN_SUCCESFUL_MSG));
			logger.info("successful");
		}catch(Exception e){
			logger.info("failed");
			Assert.fail();
			e.getMessage();
		}
	}
//	@DataProvider
//	public Object[][] getData(){
//
//		Object[][] data= new Object[2][2];
//		data[0][0]="ritu";
//		data[0][1]="111";
//
//		data[1][0]="swati";
//		data[1][1]="22";
//
//		return data;
//	}
	@DataProvider
	public Object[][] excelData() throws IOException{
		
		return getDataExcel("D:\\getdata.xlsx","login");
		
	}
	@BeforeClass
	public void beforeClass() {
		openBrowser(0);
		logger.trace("Application starting");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
