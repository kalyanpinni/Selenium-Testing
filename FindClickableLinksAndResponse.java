package makeMyTrip;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import makeMyTrip.FindClickablelinks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindClickableLinksAndResponse {
	private WebDriver driver;
	private String baseURL;
	  @BeforeClass
	  public void beforeClass() {
		  baseURL="https://www.ixigo.com/";
		  driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.get(baseURL);
	  }
  @Test
  public void TestCase() {
	  
	  FindClickablelinks links=new FindClickablelinks(driver);
	  links.getAllLinkElements(driver);
	  
  }


  @AfterClass
  public void afterClass() throws Exception {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
