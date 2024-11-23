import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\rahul\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();

	}

}
