package guru99.gittest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Membershipbill_productSelection extends Setup {
	
 
  @Test
  public void Product() throws InterruptedException {
	  		Thread.sleep(3000);
	  if (wd.findElement(By.id("inputtextsearch")).isDisplayed()) {
		  wd.findElement(By.id("inputtextsearch")).sendKeys("Gym Floor 1");
		  } else {
		  System.out.println("textbox not found");
		  }
		  Thread.sleep(2000);
		  wd.findElement(By.xpath("//*[@id='Item_0_0_97614']/div")).click();
		  wd.findElement(By.id("AddProdBtn")).click();
		  wd.findElement(By.id("Item_0_0_132691")).click();
		  wd.findElement(By.id("AddProdBtn")).click();

	}
  
  public void FullMultiPay() throws InterruptedException {
	  
	  wd.findElement(By.id("PayTypeCash")).click();
	  wd.findElement(By.id("input_002")).sendKeys("4561");
	  Thread.sleep(2000);
	  WebElement element = wd.findElement(By.id("Pay_Now"));
	  ((JavascriptExecutor) wd).executeScript("arguments[0].scrollIntoView(true);", element);
	  wd.findElement(By.id("Pay_Now")).click();

  }
  
  public void SaveBill() throws InterruptedException, AWTException {
	  
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[22]/div[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]")).click();
	 	
	 	Thread.sleep(5000);	
	 	
	 	String MemberID = wd.getCurrentUrl().substring(80, 88);

	 	ArrayList<String> tabs4 = new ArrayList<String>(wd.getWindowHandles());
		int tabcount = tabs4.size();

		wd.switchTo().window(tabs4.get(tabcount - 1));	
		
	 	Robot robot = new Robot();
	 	Thread.sleep(3000);
		
	 	robot.keyPress(KeyEvent.VK_ESCAPE);
	 	
	 	robot.keyRelease(KeyEvent.VK_ESCAPE);
	 	
		ArrayList<String> tabs5 = new ArrayList<String>(wd.getWindowHandles());
		int tabcount2 = tabs5.size();

		wd.switchTo().window(tabs5.get(tabcount2 - 1));

	 	String b = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[2]"))).getText().substring(1);

	 	wd.get("https://demo.fitnessforce.com/clientview.aspx?pagevalue=1&enquiryid="+MemberID+"&tenantid=460");
	 	
	 	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Purchase_History"))).click();
	 	
	 	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("createNewmembership")));
	 	
	 	String Billid = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"
	 			+ "/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/span[1]/span[1]"))).getText();
	 	
	 	String newStr = Billid.substring(0, Billid.indexOf(" | ")).trim();

	 	if(b.matches(newStr)) {
	 		
	 	System.out.println("Bill Created SuccessFully. Your Bill Id - " + b);
	 	
	 	}else {
	 	
	 		System.out.println("Bill Not Found or Failed for Member ID - " + MemberID);
	 	}
  }
	  
  }

