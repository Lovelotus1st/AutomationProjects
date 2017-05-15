package com.amazon.automation;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationprojects.common.Common;

import static com.automationprojects.common.AmazonConstants.*;

public class LoginAmazonTest extends Common{
	@BeforeClass
	public void OpenBrowser(){
		openBrowser(0);
	}
	@Test
	public void ClickSignIn() {
		Actions act=new Actions(driver);
		WebElement element= driver.findElement(By.xpath(XPATH_SIGNIN_MOUSEOVER));
		act.moveToElement(element).click().build().perform();
	}
	@Test(dependsOnMethods="ClickSignIn")
	public void LogIn(){
		try{
			//set your amazon user id and password
			driver.findElement(By.xpath(XPATH_EMAIL)).sendKeys(USER_EMAIL_ID);
			driver.findElement(By.xpath(XPATH_PASSWORD)).sendKeys(USER_PASSWORD);
			driver.findElement(By.xpath(XPATH_SIGNIN)).click();
			File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(srcFile, new File("D:\\aa.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			String msg=driver.findElement(By.xpath(XPATH_HELLO_MSG)).getText();
			Assert.assertTrue(msg.contains(SIGN_IN_SUCCESFUL_MSG));
		}catch (NoSuchElementException e){
			e.printStackTrace();
			Assert.fail();
		}
	}
	@AfterClass
	public void Close(){
		driver.close();
	}
	
}
