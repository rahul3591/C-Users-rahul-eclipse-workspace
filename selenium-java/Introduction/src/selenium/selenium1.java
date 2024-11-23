package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = selenium1.PastingText(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");A
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ramcharan");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8185838823");
		driver.findElement(By.xpath("//div/button[2]")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());

	}

	public static String PastingText(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		String PasswordText = driver.findElement(By.className("infoMsg")).getText();
		String[] PasswordArray = PasswordText.split("'");
		String[] PasswordArray2 = PasswordText.split("'");
		String password = PasswordArray[1].split("'")[0];
		return password;
	}
}
