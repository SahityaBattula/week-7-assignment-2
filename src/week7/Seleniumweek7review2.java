package week7;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Seleniumweek7review2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Google...");
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.close();

	}

}
