package com.seleniumeasy.inputforms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automationprojects.common.Common;

import static com.automationprojects.common.SeleniumEasyConstants.*;


public class RadioButtonDemoTest extends Common{
	 @Test (priority=1)
	  public void getRadioBtnPage() {
		  try{
			  driver.findElement(By.xpath(XPATH_INPUT_FORM)).click();
			  driver.findElement(By.xpath(XPATH_RB_DEMO)).click();
			  Assert.assertEquals(driver.findElement(By.xpath(XPATH_RB_TITLE_CHK)).getText(), RB_TITLE_CHK);
			  
		  }catch (Exception e){
			  e.getMessage();
			  Assert.fail();
		  }
	  }
	 @Test (priority=2)
	 public void radioBtnDemo(){
		 try{
		 
			 List<WebElement> radioBtns=driver.findElements(By.xpath(XPATH_RB_SINGLE_GRP));
			 System.out.println(radioBtns.size());
			 for(int i=0; i<radioBtns.size();i++){
				 System.out.println(radioBtns.get(i).getAttribute("value"));
				 if (radioBtns.get(i).getAttribute("value")==RB_VALUE){
					 radioBtns.get(i).click();
				 }
			 }
			 
			 driver.findElement(By.xpath(XPATH_RB_BTN_CHECK)).click();
			 Assert.assertTrue(driver.findElement(By.xpath(XPATH_RB_MSG_CHECK)).isDisplayed());
		 }catch (Exception e){
			 e.getMessage();
			 Assert.fail();
		 }
			 
			
	 }

  @BeforeClass
  public void beforeClass() {
	 openBrowser(1);
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
