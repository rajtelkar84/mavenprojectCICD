package testpkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	public WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
		  
			driver.get("https://www.facebook.com");
					
			String FBTitle = driver.getTitle();
			
			System.out.println(FBTitle);
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  
			System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  driver.quit();
	  }


}
