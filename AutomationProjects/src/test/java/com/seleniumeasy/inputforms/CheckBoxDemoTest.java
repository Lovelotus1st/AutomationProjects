package com.seleniumeasy.inputforms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automationprojects.common.Common;

import static com.automationprojects.common.SeleniumEasyConstants.*;

public class CheckBoxDemoTest extends Common{
	@BeforeSuite
	public void hello(){
		System.out.println("hello");
	}
	@AfterSuite
	public void bye(){
		System.out.println("bye");
	}
  @Test(priority=1)
  public void TestgetCheckBoxDemo() {
	  try{
		  driver.findElement(By.xpath(XPATH_INPUT_FORM)).click();
		  driver.findElement(By.xpath(XPATH_CHECKBOX_DEMO)).click();
		  //System.out.println(driver.findElement(By.xpath(XPATH_CB_DEMO)).getText());
		  Assert.assertEquals(driver.findElement(By.xpath(XPATH_CB_DEMO)).getText(),TEST_CB_TEXT);
	  }catch(Exception e){
		  e.getMessage();
		  Assert.fail();
	  }
  }
  @Test(priority=2)
  public void singleCheckBoxCheck(){
	  try{
		  driver.findElement(By.id(ID_SINGLE_CHECKBOX)).click();
		  //System.out.println(driver.findElement(By.xpath(XPATH_SCB_MSG)).getText());
		  Assert.assertEquals(driver.findElement(By.xpath(XPATH_SCB_MSG)).getText(), "Success - Check box is checked");
	  }catch (Exception e){
		  e.getMessage();
		  Assert.fail();
	  }

  }
  @Test(dependsOnMethods={"singleCheckBoxCheck"},priority=3)
  public void singleCheckBoxUncheck(){
	  try{
		  driver.findElement(By.id(ID_SINGLE_CHECKBOX)).click();
		  Assert.assertFalse(driver.findElement(By.xpath(XPATH_SCB_MSG)).isDisplayed());
	  }catch (Exception e){
		  e.getMessage();
		  Assert.fail();
	  }
  }
  
  @Test(priority=4)
  public void grpCBCheckAll(){
	  try{
		  System.out.println("**********************");
		  List<WebElement> chkBoxes=driver.findElements(By.xpath(XPATH_CB_GRP));
		  int i=0;
		  for(WebElement element:chkBoxes){
			  if (element.isSelected()){
				  i=i+1;
			  }
		  }
		  if(i==0){
			  //System.out.println(i);
			  Assert.assertEquals(driver.findElement(By.xpath(XPATH_BTN_CHECKALL)).getAttribute("value"), "Check All");
			  driver.findElement(By.xpath(XPATH_BTN_CHECKALL)).click();
		  }
		  
	  }catch(Exception e){
		  e.getMessage();
		  Assert.fail();
	  }
  }
  @Test(priority=5)
  public void grpCBUnCheckAll(){
	  try{
		  //System.out.println("**********************");
		  List<WebElement> chkBoxes=driver.findElements(By.xpath(XPATH_CB_GRP));
		  int i=0;
		  int listcount=chkBoxes.size();
		  for(WebElement element:chkBoxes){
			  if (element.isSelected()){
				  i=i+1;
			  }
		  }
		  if(i==listcount){
			  System.out.println(i);
			  Assert.assertEquals(driver.findElement(By.xpath(XPATH_BTN_CHECKALL)).getAttribute("value"), "Uncheck All");
			  driver.findElement(By.xpath(XPATH_BTN_CHECKALL)).click();
		  }
		  
	  }catch(Exception e){
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
