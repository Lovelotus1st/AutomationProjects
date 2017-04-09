package com.automationprojects.common;

import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static com.automationprojects.common.AmazonConstants.*;
import enums.Url;

public class Common{
	public static WebDriver driver=null;
	public Properties env=null;
	public InputStream env_f=null;
	public Properties obj=null;
	public Properties obj_f=null;
	
	public void openBrowser(int i){
		System.setProperty(DRIVER_KEY,DRIVER_VALUE );
		driver=new ChromeDriver();
		if (i==0){
			driver.navigate().to(Url.BASEURL.getURL());//amazon
		}else if (i==1){
			driver.navigate().to(Url.BASEURL1.getURL());//selenium easy
		}else if (i==2){
			driver.navigate().to(Url.BASEURL2.getURL());//selenium easy
		}else if (i==3){
			driver.navigate().to(Url.BASEURL3.getURL());//selenium easy
		}
		driver.manage().window().maximize();
		
	}
	
	public void getElement(String Xpath){
		Actions act=new Actions(driver);
		WebElement element= driver.findElement(By.xpath(Xpath));
		act.moveToElement(element).build().perform();  
	}
	
	public void navigaetToUrl(String Url){
		driver.navigate().to(Url);
	}
	
}
