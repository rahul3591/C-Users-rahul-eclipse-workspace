package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class voice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Downloads\\chromedriver_win32 (2).chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://voice.google.com/u/0/about");

	}

}