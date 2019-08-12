package guru99.gittest;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.BeforeTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login {
	 String Username;
	 String password;
	WebDriver wd;
	Workbook wb;
	Sheet sh1;
	WritableWorkbook myFirstWbook = null;
  @Test
  public void Login () throws BiffException, IOException {

	  
	  wd.findElement(By.id("txtUsername")).sendKeys(Username);
		wd.findElement(By.id("txtPassword")).sendKeys(password);
		//wd.findElement(By.id("txtUsername")).sendKeys("admin");// enter username
		//wd.findElement(By.id("txtPassword")).sendKeys("Member@123");// enter password
		wd.findElement(By.id("SignIn")).click();// click on sign in
	  }

  @BeforeTest
  public void beforeTest() throws BiffException, IOException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	  	wd = new ChromeDriver();
	  	
	    wd.get("https://leejamstagingghgh.fitnessforce.com/ffDefault.aspx");
	    
	    wd.manage().window().maximize();
	    
	    wd.manage().deleteAllCookies();
	    
	    File src=new File("D:\\ReadExcel.xls");
	    
		  wb=Workbook.getWorkbook(src);
		  
		  sh1=wb.getSheet(0);
		  
		  Username = sh1.getCell(0,1).getContents();// (Row,column )
		  
		  password = sh1.getCell(1,1).getContents();	  
		  
}		  

  @AfterTest
  public void afterTest() {
	  
	 wb.close();
	  
	  
  }

}
