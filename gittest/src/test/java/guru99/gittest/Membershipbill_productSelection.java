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
//		  wd.findElement(By.xpath("//*[@id='Item_0_0_132723']/div")).click();
//		  wd.findElement(By.id("AddProdBtn")).click();
//		  wd.findElement(By.xpath("//*[@id='Item_0_0_132726']/div")).click();
//		  wd.findElement(By.id("AddProdBtn")).click();


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
	 	
	 	String CurrentUrl = wd.getCurrentUrl().substring(80, 88);
	 	
//	 	System.out.println(CurrentUrl);

	 	ArrayList<String> tabs4 = new ArrayList<String>(wd.getWindowHandles());
		int tabcount = tabs4.size();
		System.out.println(tabcount);
		wd.switchTo().window(tabs4.get(tabcount - 1));	
		
//	 	System.out.println(" Switch to Pop up page ");
		
	 	Robot robot = new Robot();
	 	Thread.sleep(3000);
	 	
//		System.out.println(" Robot Started ");
		
	 	robot.keyPress(KeyEvent.VK_ESCAPE);
	 	
	 	robot.keyRelease(KeyEvent.VK_ESCAPE);
	 	
//	 	System.out.println(" Robot Ended ");
	 	
		ArrayList<String> tabs5 = new ArrayList<String>(wd.getWindowHandles());
		int tabcount2 = tabs5.size();
		System.out.println(tabcount2);
		wd.switchTo().window(tabs5.get(tabcount2 - 1));
//	 	
//	 	System.out.println(Window2);
//	 	
//	 	wd.switchTo().window(tabs5.get(0)).close();
//	 	
//	 	ArrayList<String> tabs6 = new ArrayList<String>(wd.getWindowHandles());
//	 	int Window3 = tabs6.size();
//	 	
//	 	System.out.println(Window3);
//	 	
//	 	wd.close();
	 	
	 	String b = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[2]"))).getText().substring(1);

//	 	System.out.println(b);

	 	wd.get("https://demo.fitnessforce.com/clientview.aspx?pagevalue=1&enquiryid="+CurrentUrl+"&tenantid=460");
	 	
	 	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Purchase_History"))).click();
	 	
	 	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("createNewmembership")));
	 	
	 	String Billid = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"
	 			+ "/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/span[1]/span[1]"))).getText();
	 	
	 	System.out.println(Billid.length());
	 	
//		String[] arrSplit = Billid.split(" | ");
//		     
//		System.out.println(arrSplit[0]);
//
//	 	String trim = arrSplit[0].trim();
	 	
	 	String newStr = Billid.substring(0, Billid.indexOf(" | ")).trim();
	 	
//	 	System.out.println(newStr.length());
	 	
	 	if(b.matches(newStr)) {
	 		
	 	System.out.println("Bill Created SuccessFully");
	 	
	 	}else {
	 	
	 		System.out.println("Bill Not Found");
	 	}
	 	
	 	
//	 	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Purchase_History"))).click();
//	 	
//	 	if(wd.findElements(By.className("ch-bill")).size() != 0) {
//	 		
//	 		System.out.println("Bill Is not Created");
//	 	} else {
//	 		
//	 		String Billid = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/span[1]/span[1]"))).getText();
//	 	System.out.println(Billid);
//	 	
//	 	}
//	 	
	 	
		
//	 	Robot robot = new Robot();
//	 	Thread.sleep(1000);
//	 	
//	 	System.out.println(" Switch to Pop up page ");
//		
//		System.out.println(" Robot Started ");
//	 	robot.keyPress(KeyEvent.VK_ESCAPE);
//	 	robot.keyRelease(KeyEvent.VK_ESCAPE);
//	 	
//	 	System.out.println(" Robot Ended ");
//
//	 	

//	 	
//	 	wd.get("https://demo.fitnessforce.com/clientview.aspx?pagevalue=1&enquiryid="+CurrentUrl+"&tenantid=460");
//	 	

	 	
//	 	Robot robot = new Robot();
//	 	Thread.sleep(1000);
//	 	
//	 	System.out.println(" Switch to Pop up page ");
//		
//		System.out.println(" Robot Started ");
//	 	robot.keyPress(KeyEvent.VK_ESCAPE);
//	 	robot.keyRelease(KeyEvent.VK_ESCAPE);
//	 	
//	 	System.out.println(" Robot Ended ");
//	 	
//	 	
//		ArrayList<String> tabs4 = new ArrayList<String>(wd.getWindowHandles());
//		wd.switchTo().window(tabs4.get(0));
//		
//		System.out.println(" Switch to purchase page ");
//		
//		ArrayList<String> print = new ArrayList<String>(wd.getWindowHandles());
//		wd.switchTo().window(print.get(1));
//		
//		Thread.sleep(2000);
//

	 	
  }
	  
  }

