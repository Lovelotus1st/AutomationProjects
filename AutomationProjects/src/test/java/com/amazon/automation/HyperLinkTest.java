package com.amazon.automation;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automationprojects.common.Common;
import static com.automationprojects.common.AmazonConstants.*;

//Check for broken links in footer
public class HyperLinkTest extends Common{
	Actions act;
	WebElement element;
	@BeforeClass
	  public void beforeClass() {
		openBrowser(0);
	  }
  @Test
  public void linkCheck() throws InterruptedException {
	  try{
		  WebElement footer;
		  int linkcount=10;
		  for(int i=0; i<linkcount; i++){
			  System.out.println(i);
			  footer= driver.findElement(By.xpath(XPATH_FOOTER));
			  List<WebElement> footlinks=footer.findElements(By.tagName("a"));
			  footlinks.get(i).click();
			  Thread.sleep(3000);
			  if (driver.getTitle().contains("404")){
				  System.out.println(footlinks.get(i).getText() + " " + "Broken Link");
			  }
			  driver.navigate().back();
		  }
		  System.out.println("Total=" + linkcount );
	  }catch (Exception e){
		  e.getMessage();
	  }
  }
}
