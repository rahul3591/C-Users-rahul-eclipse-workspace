package StepDefination;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Greenkart {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproduct;
	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
     System.setProperty("webdriver.chrome.driver", "C:/Users/rahul/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
	driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@When("user searched with ShortName {String} and extracted actual name of the product")
	public void user_searched_with_short_name_and_extracted_actual_name_of_the_product(String ShrotName) {
driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ShortName");
 landingpageproductname = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
System.out.print(landingpageproductname +" is extracted from home page");
	}

	@Then("user serached for {String} ShortName in offer page")
	public void user_serached_same_short_name_in_top_deals_page_to_check_product_is_exist(String ShortName) throws InterruptedException {
	    driver.findElement(By.linkText("Top Deals")).click();
	  Set<String>  s1=driver.getWindowHandles();
	Iterator<String>  i1=s1.iterator();
	String ParentWindow =i1.next();
	String ChildWindow = i1.next();
	driver.switchTo().window(ChildWindow);
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ShortName");
	Thread.sleep(2000);
 offerpageproduct =	driver.findElement(By.xpath("//td[normalize-space()='Tomato']")).getText();
	
}
	@Then("validate product name in offers page matches with landing page")
	public void validate_productname_in_offer_page()
	{
		Assert.assertEquals(landingpageproductname,  offerpageproduct);
	}
	
	} 



