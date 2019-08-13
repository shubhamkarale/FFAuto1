package guru99.gittest;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;

public class url extends Setup {
	String MemberId;
	FileInputStream fi;
	Workbook wb;
	Sheet s;
	String s1;
	
	@Test
	  public void LoadData() throws BiffException, IOException, InterruptedException {
		  
		fi = new FileInputStream("D:\\MemberIds.xls"); //Excel location

        wb = Workbook.getWorkbook(fi); // reading excel

        s = wb.getSheet(0); // getting sheet info

        for (int i = 1; i <= s.getRows(); i++) //define row to get the data from excel sheet
        {

            Thread.sleep(2000); //wait time to page load 2sec

            s1 = s.getCell(0, i).getContents(); // defining column 1 
//            String s2 = s.getCell(1, i).getContents(); // defining column 2
//            String s3 = s.getCell(2, i).getContents(); // defining column 3 
//            String s4 = s.getCell(3, i).getContents(); // defining column 4 
//            String s5 = s.getCell(4, i).getContents(); // defining column 5 
//            String s6 = s.getCell(5, i).getContents(); // defining column 6 
//            String s7 = s.getCell(6, i).getContents(); // defining column 7 
//            String s8 = s.getCell(7, i).getContents(); // defining column 8 
//            String s9 = s.getCell(8, i).getContents(); // defining column 9 
//            String s13 = s.getCell(12, i).getContents(); // defining column 13
//            String s14 = s.getCell(13, i).getContents(); // defining column 14
//            String s15 = s.getCell(14, i).getContents(); // defining column 15	
//            String  s16  = s.getCell( 15,i).getContents();  // defining column 16
//            String  s17  = s.getCell( 16,i).getContents();  // defining column 17
//            String  s22  = s.getCell( 21,i).getContents();  // defining column 22
//            String  s23  = s.getCell( 22,i).getContents();  // defining column 23
            System.out.println(s1);
            
            wd.get("https://demo.fitnessforce.com/clientview.aspx?pagevalue=1&enquiryid="+s1+"&tenantid=460&");
            
        String Memberstatus = wd.findElement(By.id("lblSince")).getText();
            if(Memberstatus.contains("member"))    {
            	System.out.println(Memberstatus);
            	
            } else {
            	break;
            }
            
        }
	
	  }
  @Test
  public void CreateEnquiry() {
	  
	  wd.get("https://demo.fitnessforce.com/Transaction/membercommon_ff.aspx?formname=EnquirySearch&pagetype=createenquiry&mode=enquiry&TenantId=460&BillAtId=460&BillForId=460&searchtext=5480548");
 
  }
  
  @Test
  public void CreateMember() {
	  
	  wd.get("https://demo.fitnessforce.com/Transaction/membercommon_ff.aspx?formname=EnquirySearch&pagetype=member&mode=enquiry&TenantId=460&BillAtId=460&BillForId=460&searchtext=5480548");
  }
  
  @Test
  public void CreateTrial() {
	  
	  wd.get("https://demo.fitnessforce.com/Transaction/membercommon_ff.aspx?formname=EnquirySearch&pagetype=trial&mode=enquiry&TenantId=460&BillAtId=460&BillForId=460&searchtext=5480548");
  }
  @Test
  public void ETMSubmit() {
	  
	  String getUrl = wd.getCurrentUrl();

	  if(getUrl.contains("pagetype=createenquiry")) {
		  
		  wd.findElement(By.id("btnSaveEnq")).click();
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("LabelIDType")));
		  
		  MemberId = wd.findElement(By.id("divMemberId")).getText();
		  
		  System.out.println("Enquiry Created SuccessFully id = " + MemberId);
		  
	  } else if(getUrl.contains("pagetype=trial")) {
		  
		  wd.findElement(By.id("btnSaveEnq")).click();
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customerid")));
		  
		  MemberId = wd.findElement(By.id("customerid")).getText(); 
		  
		  System.out.println("Trial Page load for member id = " + MemberId);
		  
	  } else if(getUrl.contains("pagetype=member")) {
		  
		  wd.findElement(By.id("btnSaveEnq")).click();
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("PayTypeCash")));
		  
		  MemberId = wd.findElement(By.xpath("//*[@id=\"fullscreen\"]/div[1]/div[3]/table/tbody/tr[1]/td[1]/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td/div[2]/table/tbody/tr/td/div[2]/div/div[6]/div[2]/div[2]")).getText();
		  
		  System.out.println("Bill Page load SuccessFully for Member Id = " + MemberId);	  
		  
	  } else {
		  System.out.println("Page Not found");
	  }
  }
  @Test (priority = 1)
  
  public void CreateMembershipbill() {
	  
	  
	 
	  wd.get("https://demo.fitnessforce.com/MemberData/purchaserev.aspx?pagevalue=1&enquiryid="+s1+"&TenantId=460&BillAtId=460&BillForId=460");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
