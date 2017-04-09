package com.general.misc;

import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import com.automationprojects.common.Common;
import org.openqa.selenium.Cookie;
//import static com.automationprojects.common.GeneralConstants.*;

public class CookieDemo extends Common {
  @Test
  public void manageCookie() {
	  Set<Cookie> cookie=driver.manage().getCookies();
	  Iterator<Cookie> itr=cookie.iterator();
	  Cookie c;
	  System.out.println("1");
	  while(itr.hasNext()){
		  c = itr.next();
		  System.out.println(c.getName() + "------" + c.getDomain());
	  }
	  driver.manage().deleteCookieNamed("s_cc");
	  cookie=driver.manage().getCookies();
	  itr=cookie.iterator();
	  System.out.println("2");
	  while(itr.hasNext()){
		  c = itr.next();
		  System.out.println(c.getName() + "------" + c.getDomain());
	  }
	  driver.manage().deleteAllCookies();
	  cookie=driver.manage().getCookies();
	  itr=cookie.iterator();
	  System.out.println("3");
	  while(itr.hasNext()){
		  c = itr.next();
		  System.out.println(c.getName() + "------" + c.getDomain());
	  }
  }
  @BeforeClass
  public void beforeClass() {
	  openBrowser(3);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
