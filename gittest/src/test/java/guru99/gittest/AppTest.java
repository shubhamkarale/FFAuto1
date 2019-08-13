package guru99.gittest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AppTest {
	WebDriver wd;
	WebDriverWait wait;
	
	
  @Test
  public void LoginAppTest() throws IOException {
	  
	
	wd.findElement(By.id("txtUsername")).sendKeys("fitnessforce.support");
	wd.findElement(By.id("txtPassword")).sendKeys("fit@123");
	//wd.findElement(By.id("txtUsername")).sendKeys("admin");// enter username
	//wd.findElement(By.id("txtPassword")).sendKeys("Member@123");// enter password
	wd.findElement(By.id("SignIn")).click();// click on sign in
	
//	wait.until(ExpectedConditions.elementToBeClickable(By.id("tent_search"))).sendKeys("fitnessforce demo");
	
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"result\"]/div[3]/table/tbody/tr"))).sendKeys("fitnessforce demo");
	
	wd.get("https://demo.fitnessforce.com/dashboard/started.aspx?feature=show&pagevalue=99&tenantId=460");
	
	wd.get("https://demo.fitnessforce.com/Transaction/membercommon_ff.aspx?formname=EnquirySearch&pagetype=createenquiry&mode=enquiry&TenantId=460&BillAtId=460&BillForId=460&searchtext=05405455");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("meco_Firstname"))).sendKeys(RandomStringUtils.randomAlphabetic(5));
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("meco_lastName"))).sendKeys(RandomStringUtils.randomAlphabetic(5));
	
	new Select(wd.findElement(By.id("meco_Gender"))).selectByValue("M");
	
	new Select(wd.findElement(By.id("meco_Source"))).selectByValue("Banners");
	
	wd.findElement(By.id("chkNoReferedBy")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("meco_MobileNo"))).sendKeys(RandomStringUtils.randomNumeric(10));
	
	wd.findElement(By.id("chkNoEmail")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("meco_bldngName"))).sendKeys("Test");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("meco_addressline1"))).sendKeys("test");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("meco_addrPinCode"))).sendKeys("0101010");
	
	
	new Select(wd.findElement(By.id("meco_addrLocatoin"))).selectByValue("Andheri");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlCallResponce"))).click();
	
	//waitwd.findElement(By.id("ddlCallResponce")).click();
	
	new Select(wd.findElement(By.id("ddlCallResponce"))).selectByVisibleText("Successful Follow Up");
	
	new Select(wd.findElement(By.id("ddlConvertibility"))).selectByValue("Successful Follow Up");
	
	new Select(wd.findElement(By.id("ddlContacttypefl"))).selectByValue("Phone");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("textarea"))).sendKeys("Test");
	
	wd.findElement(By.id("btnSaveEnq")).click();
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("LabelIDType")));
	
	String MemberId = wd.findElement(By.id("divMemberId")).getText();
	
	FileWriter fr=new FileWriter("D:\\data.txt");
	BufferedWriter br=new BufferedWriter(fr);

	br.write(MemberId);
	br.newLine();
	br.close();
	
	System.out.println("Enquiry Created Successfully" + MemberId);
  }

@Test 
public void EnquiryCreation() throws IOException {
	EnquiryCreation EC = new EnquiryCreation();
	EC.EnquiryCreation();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
  	wd = new ChromeDriver();
    wd.get("https://demo.fitnessforce.com/ffDefault.aspx");
//	wd.get("https://demo.fitnessforce.com/ffDefault.aspx");
    wd.manage().window().maximize();
    wd.manage().deleteAllCookies();
    wait = new WebDriverWait (wd, 20);
  }
  

  @AfterTest
  public void afterTest() {
	  
	  wd.close();
  }

}
