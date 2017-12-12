package makeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightsElementsAndFunctions {
	WebDriver driver;
	@FindBy(id="header_tab_flights")
	WebElement FlightTab;
	
	@FindBy(css=".label_text.flight-trip-type")
	WebElement Oneway_SelectTab;
	
	@FindBy(id="hp-widget__sfrom")
	WebElement Source;
	
	@FindBy(id="hp-widget__sTo")
	WebElement Destination;
	
	@FindBy(id="hp-widget__depart")
	WebElement DepartDate;
	
	@FindBy(xpath="//div[@id='js-filterOptins']//div[@style='display: block;']")
	WebElement CalenderBox;
	
	@FindBy(id="searchBtn")
	WebElement SearchButton;
	
	@FindBy(id="hp-widget__depart")
	WebElement CalenderPointer;
	
	public void clickFlightsTab() throws InterruptedException{
		FlightTab.click();
		Thread.sleep(2000);
	}
	
	public void clickOnewayFlightsTab() throws InterruptedException{
		Oneway_SelectTab.click();
		Thread.sleep(2000);
	}
	
	public void setSource(String source){
		Source.sendKeys(source);
	}
	
	public void setDestination(String destination){
		Destination.sendKeys(destination);
	}
	
	public void CalenderSelect(String day,String month,String year) throws Exception{
		System.out.println("Calender Box webElement is :"+CalenderBox);
		CalenderPointer.click();
		Thread.sleep(1000);
		System.out.println("Calender Box webElement Id is :"+CalenderBox.getAttribute("id"));
		
		String CalenderID=CalenderBox.getAttribute("id");
		System.out.println("Calender Box webElement Id is :"+CalenderID);
	    String CalenderXpath="//*[@id='"+CalenderID+"']/div//td[@data-month='"+month+"' and @data-year='"+year+"' ]/a[text()='"+day+"']";
	    System.out.println("Calender Total Xpath is: "+CalenderXpath);
	    driver.findElement(By.xpath(CalenderXpath)).click();
	    Thread.sleep(2000);
	}
	
	public void clickOnSearch() throws InterruptedException{
		SearchButton.click();
		   Thread.sleep(8000);
	}
	SearchFlightsElementsAndFunctions(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
