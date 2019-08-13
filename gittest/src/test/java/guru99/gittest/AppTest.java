package guru99.gittest;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class AppTest extends Setup  

{
	public url url = new url();  
	public Form fm = new Form();  
	
@Test (priority=1)

public void EnquiryCreation() throws IOException, InterruptedException {
	
	System.out.println("print line added");
	
//	url.CreateEnquiry();
//	fm.formfilling();
//	fm.AddFollowUp();
//	url.ETMSubmit();  
	
  }

//@Test (priority=2)
//
//public void TrialCreation() throws IOException, InterruptedException {
//	
//	url.CreateTrial();
//	fm.formfilling();
//	fm.AddFollowUp(); 
//	url.ETMSubmit();
//}
//
//@Test (priority=3)
//
//public void MemberCreation() throws IOException, InterruptedException {
//	
//	 url.CreateMember();
//	fm.formfilling();
//	fm.AddFollowUp(); 
//	url.ETMSubmit();
//}

//@Test (priority=1)
//
//public void Memberbill() throws IOException, InterruptedException, BiffException {
//	
//	url.LoadData();
//	url.CreateMembershipbill();
//	
//}

  @BeforeTest
  public void beforeTest() {

  }

  @AfterTest
  public void afterTest() {
	  
	 
  }

}
