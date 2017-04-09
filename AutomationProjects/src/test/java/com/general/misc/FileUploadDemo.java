package com.general.misc;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automationprojects.common.Common;

import static com.automationprojects.common.GeneralConstants.*;

public class FileUploadDemo extends Common{
  @Test
  public void uploadFile() {
	  try{
		  driver.findElement(By.xpath(XPATH_BROWSE_FILE)).sendKeys(FILE_PATH);
		  driver.findElement(By.xpath(XPATH_FILE_UPLOAD)).click();
		  Assert.assertEquals(driver.findElement(By.xpath(XPATH_MSG_UPLOADED)).getText(), FILE_NAME);
	  }catch (Exception e){
		  e.getMessage();
		  Assert.fail();
	  }
	 
  }
  @BeforeClass
  public void beforeClass() {
	  openBrowser(2);
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
