package guru99.gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd;
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    	wd = new ChromeDriver();
    	
    	
    	wd.get("https://demo.fitnessforce.com/ffDefault.aspx");
//    		wd.get("https://demo.fitnessforce.com/ffDefault.aspx");
    	wd.manage().window().maximize();
    	wd.manage().deleteAllCookies();
    
    
    	wd.findElement(By.id("txtUsername")).sendKeys("fitnessforce.support");
    	wd.findElement(By.id("txtPassword")).sendKeys("fit@123");
    	//wd.findElement(By.id("txtUsername")).sendKeys("admin");// enter username
    	//wd.findElement(By.id("txtPassword")).sendKeys("Member@123");// enter password
    	wd.findElement(By.id("SignIn")).click();// click on sign in

    	System.out.println("Logged in successfully");

	}

}
