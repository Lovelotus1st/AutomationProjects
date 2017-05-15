package com.automationprojects.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
			driver.navigate().to(Url.BASEURL1.getURL());//seleniumeasy
		}else if (i==2){
			driver.navigate().to(Url.BASEURL2.getURL());//seleniumeasy
		}else if (i==3){
			driver.navigate().to(Url.BASEURL3.getURL());//seleniumeasy
		}else if (i==4){
			driver.navigate().to(Url.BASEURL4.getURL());//Fantasy cricket
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
	
	public Object[][] getDataExcel(String location,String sheet) throws IOException{
		XSSFWorkbook excelWorkBook=null;
		XSSFSheet excelSheet=null;
		XSSFRow row=null;
		XSSFCell cell=null;
		int rowCount=0, colCount=0;

//add validations
		FileInputStream file= new FileInputStream(location);
		excelWorkBook=new XSSFWorkbook(file);
		excelSheet=excelWorkBook.getSheet(sheet);

		rowCount=(excelSheet.getLastRowNum()-excelSheet.getFirstRowNum())+1;
		colCount=excelSheet.getRow(0).getLastCellNum();
		Object cellData[][]=new Object[rowCount-1][colCount];
		for(int i=2;i<rowCount-1;i++){
			row=excelSheet.getRow(i);
			for(int j=0;j<colCount;j++){
				cell=row.getCell(j);
				cellData[i-2][j]=cell.getStringCellValue();
				System.out.println("cell= " + cell + " celldata [" + i +"]["+j+"]= "+ cell.getStringCellValue());
			}
		}
		excelWorkBook.close();
		return cellData;
	}
		
}
