package testcases;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBrowser {
//	private WebDriver driver;
//	private static ChromeDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("", "");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}

}
