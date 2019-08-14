package guru99.gittest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Form extends Setup {

  @Test
  public void formfilling() throws IOException, InterruptedException {
	  
	// FirstNAme
			if (wd.findElement(By.id("meco_Firstname")).isDisplayed()) {

				wd.findElement(By.id("meco_Firstname")).sendKeys(RandomStringUtils.randomAlphabetic(5));

			} else {
				// System.out.println("Field meco_Firstname is not compulsory");
				
			}

			// Last Name
		
			if (wd.findElement(By.id("meco_lastName")).isDisplayed()) {

				wd.findElement(By.id("meco_lastName")).sendKeys(RandomStringUtils.randomAlphabetic(5));

			} else {
				// System.out.println("Field error is not compulsory");
			}

			// Gender
			
			if (wd.findElement(By.id("meco_Gender")).isDisplayed()) {

				new Select(wd.findElement(By.id("meco_Gender"))).selectByIndex(1);

			} else {
				// System.out.println("meco_Gender is not compulsory");
			}

			// Fitness Goal
		
			// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("ddcl-meco_FitnessGoal"))).clear();
			if (wd.findElement(By.id("ddcl-meco_FitnessGoal")).isDisplayed()) {

				wd.findElement(By.xpath("//*[@id=\"ddcl-meco_FitnessGoal\"]/span")).click();
				WebElement goal = wd.findElement(By.id("ddcl-meco_FitnessGoal-i0"));
				
				goal.click();

			} else {
				// System.out.println("meco_FitnessGoal is not compulsory");
			}
			
			// DOB
			
			
			if (wd.findElement(By.id("meco_DateOfBirth")).isDisplayed()) {

				wd.findElement(By.id("meco_DateOfBirth")).click();
				Select date = new Select(wd.findElement(By.className("ui-datepicker-year")));
				date.selectByValue("1995");
				wd.findElement(By.linkText("22")).click();

			} else {
				// System.out.println("meco_DateOfBirth is not compulsory");
			}

			// Nationlity

			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (wd.findElement(By.id("meco_Nationality")).isDisplayed()) {

				Select nationality = new Select(wd.findElement(By.id("meco_Nationality")));
				nationality.selectByValue("Indian");

			} else {
				// System.out.println("meco_Nationality is not compulsory");
			}

			// Cl
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (wd.findElement(By.id("meco_clientlanguage")).isDisplayed()) {

				Select Cl = new Select(wd.findElement(By.id("meco_clientlanguage")));
				Cl.selectByIndex(0);

			} else {
				// System.out.println("meco_clientlanguage is not compulsory");
			}

			// WrkTime
			
			if (wd.findElement(By.xpath("//*[@id=\"ddcl-meco_PreferredWorkOuttime\"]/span")).isDisplayed()) {
				
				wd.findElement(By.xpath("//*[@id=\"ddcl-meco_PreferredWorkOuttime\"]/span")).click();
				
				WebElement WT = wd.findElement(By.id("ddcl-meco_PreferredWorkOuttime-i0"));
				
				WT.click();
			} else {
				// System.out.println("WrkTime is not compulosry");
			}
			
			// contact info
			if (wd.findElement(By.id("meco_MobileNo")).isDisplayed()) {
				wd.findElement(By.id("meco_MobileNo")).sendKeys(RandomStringUtils.randomNumeric(10));
			} else {
				// System.out.println("meco_MobileNo is not compulosry");
			}

			// Email
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (wd.findElement(By.id("meco_Emailaddress")).isDisplayed()) {

				WebElement Email = wd.findElement(By.id("meco_Emailaddress"));
				Email.sendKeys("username" + RandomStringUtils.randomNumeric(2) + "@sgrfh.com");
			} else {
				// System.out.println("meco_Emailaddress is not compulsory");
			}
			
			// occupation
			if (wd.findElement(By.id("meco_Occuption")).isDisplayed()) {

				Select occ = new Select(wd.findElement(By.id("meco_Occuption")));
				occ.selectByIndex(5);

			} else {
				// System.out.println("meco_Occuption is not compulosry");
			}
			
			// Org
			
			if (wd.findElement(By.id("cb_meco_NameofOrg")).isDisplayed()) {

				wd.findElement(By.id("cb_meco_NameofOrg")).sendKeys("asdas");

			} else {
				// System.out.println("Org is not compulsory");
			}

			// Gen Info

			if (wd.findElement(By.id("meco_generalInfo")).isDisplayed()) {

				wd.findElement(By.id("meco_generalInfo")).sendKeys("non");

			} else {
				// System.out.println("meco_generalInfo is not compulsory");
			}
			// Blood Group
		
			if (wd.findElement(By.id("meco_bloodgroup")).isDisplayed()) {

				Select BG = new Select(wd.findElement(By.id("meco_bloodgroup")));
				BG.selectByIndex(1);

			} else {
				// System.out.println("meco_bloodgroup is not compulosry");
			}

			// Enquiry type
			
			if (wd.findElement(By.id("meco_EnquiryType")).isDisplayed()) {

				Select EQ = new Select(wd.findElement(By.id("meco_EnquiryType")));
				EQ.selectByIndex(6);
			} else {
				// System.out.println("meco_bloodgroup is not compulosry");
			}
			
			if (wd.findElement(By.id("meco_bldngName")).isDisplayed()) {

				wd.findElement(By.id("meco_bldngName")).sendKeys("non");

			}

			else {
				// System.out.println("meco_bldngName is not compulsory");
			}

			// Street
			if (wd.findElement(By.id("meco_addressline1")).isDisplayed()) {

				wd.findElement(By.id("meco_addressline1")).sendKeys("non");

			} else {
				// System.out.println("meco_addressline1 is not compulsory");
			}

			// pin code
			if (wd.findElement(By.id("meco_addrPinCode")).isDisplayed()) {

				wd.findElement(By.id("meco_addrPinCode")).sendKeys(RandomStringUtils.randomNumeric(6));

			} else {
				// System.out.println("meco_addrPinCode is not compulsory");
			}
			// Location
			if (wd.findElement(By.id("meco_addrLocatoin")).isDisplayed()) {
				Select loc = new Select(wd.findElement(By.id("meco_addrLocatoin")));
				loc.selectByIndex(3);

			} else {
				// System.out.println("meco_addrLocatoin is not compulsory");
			}

			if (wd.findElement(By.id("meco_MiddleName")).isDisplayed()) {
				wd.findElement(By.id("meco_MiddleName")).sendKeys(RandomStringUtils.randomAlphabetic(5));
			} else {
				// System.out.println("meco_MiddleName is not compulsory");
			}

			// source
			
			if (wd.findElement(By.id("meco_Source")).isDisplayed()) {
				
				Select source = new Select(wd.findElement(By.id("meco_Source")));
				
				source.selectByIndex(5);
				
			} else {
				
				// System.out.println("meco_Source is not compulsory");
			}

			// Service interested in
			if (wd.findElement(By.xpath("//*[@id=\"ddcl-chklstServicesInterestedIn\"]/span")).isDisplayed()) {
			wd.findElement(By.xpath("//*[@id=\"ddcl-chklstServicesInterestedIn\"]/span")).click();

			WebElement ele1 = wd.findElement(By.id("//*[@id=\"ddcl-chklstServicesInterestedIn\"]/span"));
			ele1.click();
				} else {
				
				// System.out.println("Service interested in is not compulsory");
			}

			// marketing preferneces
			if (wd.findElement(By.xpath("//*[@id=\"ddcl-chkLstMarketingPreferences\"]/span")).isDisplayed()) {
			wd.findElement(By.xpath("//*[@id=\"ddcl-chkLstMarketingPreferences\"]/span")).click();
			WebElement mp1 = wd.findElement(By.id("ddcl-chkLstMarketingPreferences-i1"));
			mp1.click();
				} else {
				
				// System.out.println("marketing preferneces in is not compulsory");
			}

			// Anniversary
			
			if (wd.findElement(By.id("img_meco_Anniversary")).isDisplayed()) {
			wd.findElement(By.id("img_meco_Anniversary")).click();
			wd.findElement(By.linkText("17")).click();
				} else {
				
				// System.out.println("Anniversary is not compulsory");
			}	

			// spouse name
			if (wd.findElement(By.id("meco_SpouseName")).isDisplayed()) {

			wd.findElement(By.id("meco_SpouseName")).sendKeys(RandomStringUtils.randomAlphabetic(5));
			
				} else {
				
				// System.out.println("spouse name is not compulsory");
			}	

			// national ID
			
			if (wd.findElement(By.id("meco_nationalIn")).isDisplayed()) {

				wd.findElement(By.id("meco_nationalIn")).sendKeys(RandomStringUtils.randomNumeric(4));
				
					} else {
					
					// System.out.println("national ID is not compulsory");
				}	

			// Height
			
			if (wd.findElement(By.id("meco_Height")).isDisplayed()) {

				wd.findElement(By.id("meco_Height")).sendKeys(RandomStringUtils.randomNumeric(1));
				
					} else {
					
					// System.out.println("Height is not compulsory");
				}

			// Weight
			
			if (wd.findElement(By.id("meco_weight")).isDisplayed()) {

				wd.findElement(By.id("meco_weight")).sendKeys(RandomStringUtils.randomNumeric(2));
					} else {
					
					// System.out.println("Weight is not compulsory");
				}

			// Medical Alert
			
			if (wd.findElement(By.id("meco_MedicalAlert")).isDisplayed()) {

				wd.findElement(By.id("meco_MedicalAlert")).sendKeys(RandomStringUtils.randomNumeric(2));
					} else {
					
					// System.out.println("Medical Alert is not compulsory");
				}

			// personal int

			
			if (wd.findElement(By.xpath("//*[@id=\"ddcl-chklstPersonalInterest\"]/span")).isDisplayed()) {

				wd.findElement(By.xpath("//*[@id=\"ddcl-chklstPersonalInterest\"]/span")).click();
				WebElement PI = wd.findElement(By.id("ddcl-chklstPersonalInterest-i0"));
				PI.click();
				
					} else {
					
					// System.out.println("Medical Alert is not compulsory");
				}
			
			// Referred by
	
			if (wd.findElement(By.id("meco_ReferredBy")).isDisplayed()) {

				wd.findElement(By.id("chkNoReferedBy")).click();
				
					} else {
					
					// System.out.println("Referred by is not compulsory");
				}

			// Language

			// wd.findElement(By.id("ddcl-meco_preferred_language-ddw")).click();

			if (wd.findElement(By.id("meco_emergencyContactPerson")).isDisplayed()) {

				wd.findElement(By.id("meco_emergencyContactPerson")).sendKeys(RandomStringUtils.randomAlphabetic(6));

				
					} else {
					
					// System.out.println("meco_emergencyContactPerson is not compulsory");
				}
			
			// emergency Contact no
			if (wd.findElement(By.id("meco_emergencyContactNo")).isDisplayed()) {

				wd.findElement(By.id("meco_emergencyContactNo")).sendKeys(RandomStringUtils.randomNumeric(10));

				
					} else {
					
					// System.out.println("meco_emergencyContactNo is not compulsory");
				}
			
			// Access Card issued Date
			
			if (wd.findElement(By.id("img_meco_accesscardissuedate")).isDisplayed()) {

				wd.findElement(By.id("img_meco_accesscardissuedate")).click();
				
				wd.findElement(By.linkText("1")).click();
				
					} else {
					
					// System.out.println("Access Card issued Date is not compulsory");
				}
					
			// Facebook Id
			
			if (wd.findElement(By.id("meco_facebookId")).isDisplayed()) {

				wd.findElement(By.id("meco_facebookId")).sendKeys(RandomStringUtils.randomAlphabetic(6));
				
					} else {
					
					// System.out.println("meco_facebookId is not compulsory");
				}

			// Orkut Id
			
			if (wd.findElement(By.id("meco_orkutId")).isDisplayed()) {

				wd.findElement(By.id("meco_orkutId")).sendKeys(RandomStringUtils.randomAlphabetic(6));
				
					} else {
					
					// System.out.println("meco_orkutId is not compulsory");
				}

			// Linked In
			if (wd.findElement(By.id("meco_linkedinId")).isDisplayed()) {

				wd.findElement(By.id("meco_linkedinId")).sendKeys(RandomStringUtils.randomAlphabetic(6));
				
					} else {
					
					// System.out.println("meco_linkedinId is not compulsory");
				}
			// Twitter Id
			
			if (wd.findElement(By.id("meco_twitterId")).isDisplayed()) {

				wd.findElement(By.id("meco_twitterId")).sendKeys(RandomStringUtils.randomAlphabetic(6));
				
					} else {
					
					// System.out.println("meco_twitterId is not compulsory");
				}

			// Ethnicity
			
//			if (wd.findElement(By.id("meco_ethnicity")).isDisplayed()) {
//
//				 wd.findElement(By.id("meco_ethnicity")).click();
//				
//					} else {
//					
//					// System.out.println("meco_ethnicity is not compulsory");
//				}
			
			if (wd.findElement(By.id("meco_personalizeMessage")).isDisplayed()) {

				wd.findElement(By.id("meco_personalizeMessage")).sendKeys(RandomStringUtils.randomAlphabetic(10));
				
					} else {
					
					// System.out.println("meco_personalizeMessage is not compulsory");
				}			

	  
//	FileWriter fr=new FileWriter("D:\\data.txt");
//	BufferedWriter br=new BufferedWriter(fr);
//
//	br.write(MemberId);
//	br.newLine();
//	br.close();

	  
  }
  
  public void AddFollowUp() throws InterruptedException {
		// TODO Auto-generated method stub
	  
	  
	  if (wd.findElement(By.id("ddlCallResponce")).isDisplayed()) {


		  Select Rep = new Select(wd.findElement(By.id("ddlCallResponce")));
			Rep.selectByIndex(1);
			// Convertibility
			Select Conver = new Select(wd.findElement(By.id("ddlConvertibility")));
			Conver.selectByIndex(3);
			// Next Follow Up
			// wait.until(ExpectedConditions.elementToBeClickable(By.id("//*[@id=\"txtNextFollowupDate\"]"))).click();
			wd.findElement(By.xpath("//*[@id=\"txtNextFollowupDate\"]")).click();
			// DatePicker
			
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/a[2]/span")).click();
			
			Thread.sleep(2000);
			
			wd.findElement(By.linkText("28")).click();
			// ContactType
			Select CT = new Select(wd.findElement(By.id("ddlContacttypefl")));
			CT.selectByIndex(1);
			// Add Comment
			wd.findElement(By.id("textarea")).sendKeys(RandomStringUtils.randomAlphabetic(6));
			
				} else {
				
				// System.out.println("Follow Up Not Visible");
			}
	}
 
@BeforeTest
  public void beforeTest() {
	  
	  // System.out.println("Your Test about to begin");
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	 
  }

}
