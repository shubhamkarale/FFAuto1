package guru99.gittest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;

public class url extends Setup {
	String MemberId;
  @Test
  public void Enquiry() {
	  
	  wd.get("https://demo.fitnessforce.com/Transaction/membercommon_ff.aspx?formname=EnquirySearch&pagetype=createenquiry&mode=enquiry&TenantId=460&BillAtId=460&BillForId=460&searchtext=5480548");
  }
  
  @Test
  public void Member() {
	
	  
	  wd.get("https://demo.fitnessforce.com/Transaction/membercommon_ff.aspx?formname=EnquirySearch&pagetype=member&mode=enquiry&TenantId=460&BillAtId=460&BillForId=460&searchtext=5480548");
  }
  
  @Test
  public void Trial() {
	  
	  wd.get("https://demo.fitnessforce.com/Transaction/membercommon_ff.aspx?formname=EnquirySearch&pagetype=trial&mode=enquiry&TenantId=460&BillAtId=460&BillForId=460&searchtext=5480548");
  }
  
  public void Submit() {
	  
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
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
