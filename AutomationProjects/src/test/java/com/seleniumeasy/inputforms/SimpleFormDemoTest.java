package com.seleniumeasy.inputforms;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import static com.automationprojects.common.SeleniumEasyConstants.*;
import com.automationprojects.common.Common;

public class SimpleFormDemoTest extends Common {
  @Test
  public void getSimpleForm() {
	  try{
		  //System.out.println("1");
		  driver.findElement(By.xpath(XPATH_INPUT_FORM)).click();
		  driver.findElement(By.xpath(XPATH_SF)).click();
		  Assert.assertEquals(driver.findElement(By.xpath(XPATH_SF_TEXT)).getText(), TEST_SF_TEXT);
	  }catch(Exception e){
		  e.getMessage();
		  Assert.fail();
	  }
  }
  @Test(dependsOnMethods={"getSimpleForm"})
  public void checkInputField(){
	  try{
		  //System.out.println("2");
		  driver.findElement(By.xpath(XPATH_ENTER_MESSAGE)).sendKeys("Hello");
		  driver.findElement(By.xpath(XPATH_SHOW_MESSAGE)).click();
		  Assert.assertEquals(driver.findElement(By.xpath(XPATH_DISPLAY_MESSAGE)).getText(),"Hello");
	  }catch (Exception e){
		  e.getMessage();
		  Assert.fail();
	  }
	 
  }
  @Test
  public void checkNumericField(){
	  try{
		  //System.out.println("3");
		  driver.findElement(By.xpath(XPATH_ENTER_A)).sendKeys("7");
		  driver.findElement(By.xpath(XPATH_ENTER_B)).sendKeys("7");
		  driver.findElement(By.xpath(XPATH_GET_TOTAL)).click();
		  Assert.assertEquals(driver.findElement(By.xpath(XPATH_DISPLAY_VALUE)).getText(), "14");
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
