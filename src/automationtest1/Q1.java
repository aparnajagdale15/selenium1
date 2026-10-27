package automationtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Chrome browser.
		WebDriver driver=new ChromeDriver();
		
		//Open Flipkart using the get() method.
		driver.get("https://www.flipkart.com/");
		
		//Print the page title and current URL.
		System.out.println("Page Title: " +driver.getTitle());
		System.out.println("Current URL: " +driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//Navigate to https://www.wikipedia.org/ using navigate().to().
		driver.navigate().to("https://www.wikipedia.org/");
		
		//Print the title of the Wikipedia page.
		System.out.println("Wikipedia page title: " +driver.getTitle());
		
		//Navigate back to Flipkart using navigate().back().
		driver.navigate().back();
		
		//Navigate forward to Wikipedia using navigate().forward().
		driver.navigate().forward();
		
		//Refresh the current page using navigate().refresh().
		driver.navigate().refresh();
		
		driver.quit();



		

	}

}
