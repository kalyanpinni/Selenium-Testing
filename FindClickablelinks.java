package makeMyTrip;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FindClickablelinks {
	
	
	private WebDriver myDriver;
	
	
	
	public FindClickablelinks(WebDriver driver){
		myDriver=driver;
		PageFactory.initElements(myDriver, this);
	}
	
	public  List<WebElement> getAllLinkElements(WebDriver driver)
	{
		List<WebElement> LinkElements=new ArrayList<>();
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
		
		for(WebElement e:elements){
			if(e.getAttribute("href") != null){
				LinkElements.add(e);
				System.out.println("Link is"+e.getAttribute("href"));
			}
		}
		return LinkElements;
	}

}
