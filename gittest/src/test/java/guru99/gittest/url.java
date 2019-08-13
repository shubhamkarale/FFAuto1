package guru99.gittest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;

public class url extends Setup {
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
		  
		  System.out.println("Enquiry Created SuccessFully");
		  
	  } else if(getUrl.contains("pagetype=trial")) {
		  
		  wd.findElement(By.id("btnSaveEnq")).click();
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customerid")));
		  
		  System.out.println("Trial Created SuccessFully");
		  
	  } else if(getUrl.contains("pagetype=member")) {
		  
		  wd.findElement(By.id("btnSaveEnq")).click();
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("PayTypeCash")));
		  
		  System.out.println("Bill Page load SuccessFully");
		  
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
