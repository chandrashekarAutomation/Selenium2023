package Seleinum.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkLocation\\EclipseJars\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Get the title 
		System.out.println("Title of the webpage: " + driver.getTitle());
		driver.quit();
		
	}

}
