package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Asserations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahulnoone");
        driver.findElement(By.name("inputPassword")).sendKeys("rahul");
        driver.findElement(By.name("chkboxOne")).click();
        driver.findElement(By.name("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();
       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       Assert.assertEquals(driver.findElement(By.cssSelector("p.error")).getText(),"* Incorrect username or password" );

	}

}
