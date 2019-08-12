package guru99.gittest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AppTest {
	WebDriver wd;
  @Test
  public void f() {
	  
	
	wd.findElement(By.id("txtUsername")).sendKeys("fitnessforce.support");
	wd.findElement(By.id("txtPassword")).sendKeys("fit@123");
	//wd.findElement(By.id("txtUsername")).sendKeys("admin");// enter username
	//wd.findElement(By.id("txtPassword")).sendKeys("Member@123");// enter password
	wd.findElement(By.id("SignIn")).click();// click on sign in
	  System.out.println("test");
	  
	  System.out.println("New Branch");
	  
	  System.out.println("New Center Selection");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
  	wd = new ChromeDriver();
    wd.get("https://demotest.fitnessforce.com/ffDefault.aspx");
//	wd.get("https://demo.fitnessforce.com/ffDefault.aspx");
    wd.manage().window().maximize();
    wd.manage().deleteAllCookies();
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Logged in successfully");
	  wd.close();
  }

}
