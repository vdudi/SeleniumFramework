package SeleniumFramework.SeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath:"+ projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver");		
		//WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.close();
		//driver.quit();
		
	}

}
