package jhenkinpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jhenkindemoclass {

	@Test
	public void demojhenkin()
	{
		System.out.println("Welcome to Jhenkin Demo");
		System.setProperty("webdriver.chrome.driver","C:\\Ashok\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		System.out.println("Ashok Build - Successfully using Jenkins");
		driver.close();
		
	}
}
