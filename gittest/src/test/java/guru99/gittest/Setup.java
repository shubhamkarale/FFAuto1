package guru99.gittest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Setup {

public static WebDriver wd;
public static WebDriverWait wait;

@BeforeSuite
public void startUp(){

  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
  	wd = new ChromeDriver();
    wd.get("https://demo.fitnessforce.com/ffDefault.aspx");
//	wd.get("https://demo.fitnessforce.com/ffDefault.aspx");
    wd.manage().window().maximize();
    wd.manage().deleteAllCookies();
    wait = new WebDriverWait (wd, 20);

}

@AfterSuite
public void tearDown(){

    //driver.quit();
}
}
