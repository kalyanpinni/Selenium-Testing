package makeMyTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import makeMyTrip.SearchFlightsElementsAndFunctions;

public class SearchFlightTestNG {
private WebDriver driver;
private String baseURL;
public SearchFlightsElementsAndFunctions fun;
  @BeforeClass
  public void beforeClass() throws Exception {
	  baseURL="https://www.makemytrip.com/";
		driver=new FirefoxDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseURL);
		Thread.sleep(2000);
  }
  
  @Test
  public void f() throws Exception {
	  fun=new SearchFlightsElementsAndFunctions(driver);
	  fun.clickFlightsTab();
	  fun.clickOnewayFlightsTab();
	  fun.setSource("New Delhi (DEL)");
	  fun.setDestination("Mumbai (BOM)");
	  fun.CalenderSelect("20","10","2017");
	  fun.clickOnSearch();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
