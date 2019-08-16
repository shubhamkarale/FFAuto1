package guru99.gittest;

import java.awt.AWTException;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Membershipbill_productSelection extends Setup {
  @Test
  public void Product() throws InterruptedException {
	  		Thread.sleep(2000);
	  if (wd.findElement(By.id("inputtextsearch")).isDisplayed()) {
		  wd.findElement(By.id("inputtextsearch")).sendKeys("Gym Floor 1");
		  } else {
		  System.out.println("textbox not found");
		  }
		  Thread.sleep(2000);
//		  wd.findElement(By.xpath("//*[@id='Item_0_0_97614']/div")).click();
//		  wd.findElement(By.id("AddProdBtn")).click();
		  wd.findElement(By.id("Item_0_0_132691")).click();
		  wd.findElement(By.id("AddProdBtn")).click();
//		  wd.findElement(By.xpath("//*[@id='Item_0_0_132723']/div")).click();
//		  wd.findElement(By.id("AddProdBtn")).click();
//		  wd.findElement(By.xpath("//*[@id='Item_0_0_132726']/div")).click();
//		  wd.findElement(By.id("AddProdBtn")).click();
		

	}
  
  public void FullMultiPay() throws InterruptedException {
	  
	  wd.findElement(By.id("PayTypeCash")).click();
	  wd.findElement(By.id("input_002")).sendKeys("4560");
	  Thread.sleep(2000);
	  WebElement element = wd.findElement(By.id("Pay_Now"));
	  ((JavascriptExecutor) wd).executeScript("arguments[0].scrollIntoView(true);", element);
	  wd.findElement(By.id("Pay_Now")).click();
//	  wd.findElement(By.id("PayTypeCredit Card")).click();
//	  wd.findElement(By.id("input_002")).sendKeys("3961");
//	  wd.findElement(By.id("input_004")).sendKeys(RandomStringUtils.randomAlphabetic(5));
//	  wd.findElement(By.id("input_005")).click();
//	  wd.findElement(By.linkText("5")).click();
//	  wd.findElement(By.id("input_006")).sendKeys(RandomStringUtils.randomAlphabetic(5));
//	  wd.findElement(By.id("input_007")).click();
//	  wd.findElement(By.linkText("6")).click();
//	  Thread.sleep(2000);
//	  new Select(wd.findElement(By.id("cardtype"))).selectByVisibleText("Master");
//	  Thread.sleep(2000);
//	  wd.findElement(By.id("Pay_Now")).click();
	  if (wd.findElement(By.id("BtnSubmit")).isDisplayed()) {
	  wd.findElement(By.id("BtnSubmit")).click();
	  } else {
	  System.out.println("Button is not displayed");
	  }
	  Thread.sleep(4000);
	  
  }
  
  public void SaveBill() throws InterruptedException, AWTException {
	  
	  	wd.findElement(By.id("BtnSubmit")).click();
	  	
		Thread.sleep(4000);

//		String actual_msg = wd.findElement(By.id("modal_error")).getText();
//		
//		String expect = "Error Message";
//
//		Assert.assertEquals(actual_msg, expect);
//		
//		ArrayList<String> tabs4 = new ArrayList<String>(wd.getWindowHandles());
//		wd.switchTo().window(tabs4.get(1));
//		Thread.sleep(2000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		Set<String> windhand = wd.getWindowHandles();
//		int windows = windhand.size();
//		System.out.println(windows);
//		
//		
//		
//		wd.switchTo().activeElement().findElement(By.xpath("/html/body/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[2]"));
//		
//		wd.switchTo().window(tabs4.get(1));
//		String invoice_no = wd.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[2]")).getText();
//		System.out.println(invoice_no);
//		
////		ArrayList<String> Tabs3 = new ArrayList<String>(wd.getWindowHandles());
////		wd.switchTo().window(Tabs3.get(0));	
////		
//				
				
		
		
		//driver.get("https://demo.fitnessforce.com/BillsAndPayments/ActivateProducts.aspx?pagevalue=1&enquiryid=12935849&TenantId=460");
		//js.executeScript("window.scrollBy(0,400)");
	  
  }
	  
  }

