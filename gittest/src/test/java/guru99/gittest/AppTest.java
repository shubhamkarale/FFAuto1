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
  
  public void PageURL() throws IOException {
	  
	 url.Enquiry();
	 
 }
  
@Test (priority=2)

public void EnquiryCreation() throws IOException, InterruptedException {
	
	fm.formfilling();
	fm.AddFollowUp();
	url.Submit();  
	
  }

@Test (priority=3)

public void TrialPageURL() throws IOException {
	  
	 url.Trial();
}

@Test (priority=4)

public void TrialCreation() throws IOException, InterruptedException {
	
	fm.formfilling();
	fm.AddFollowUp(); 
	url.Submit();
}

@Test (priority=5)
public void MemberPageURL() throws IOException {
	  
	 url.Member();
}

@Test (priority=6)

public void MemberCreation() throws IOException, InterruptedException {
	
	fm.formfilling();
	fm.AddFollowUp(); 
	url.Submit();
}


  @BeforeTest
  public void beforeTest() {

  }

  @AfterTest
  public void afterTest() {
	  
	 
  }

}
