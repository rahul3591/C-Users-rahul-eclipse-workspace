package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    //    WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
   //     Select dropdown = new Select(staticdropdown);
   //     dropdown.selectByIndex(3);
  //    System.out.println(  dropdown.getFirstSelectedOption().getText());
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
       System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
        int i=1;
        while (i<5)
        	
        {
        	  driver.findElement(By.id("hrefIncAdt")).click();
        	  
        	System.out.println(  driver.findElement(By.id("divpaxinfo")).getText());
        	  i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.quit();
       
	}
}
/* for(i=1,i<5,i++)
{
 driver.findElement(By.id("hrefIncAdt")).click();
} */

