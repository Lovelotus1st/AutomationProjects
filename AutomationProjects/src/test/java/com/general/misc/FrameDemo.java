package com.general.misc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automationprojects.common.Common;

public class FrameDemo extends Common{
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  openBrowser(4);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
