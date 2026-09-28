package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class linktextandPartiallinktext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/accessing-link.html");
		Thread.sleep(5000);
		//Click Click here link using linkText
		driver.findElement(By.linkText("click here")).click();
		Thread.sleep(5000);
		System.out.println("Navigated to login page");
		//Click Forgot Password link using partial linktext
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		Thread.sleep(5000);
		System.out.println("Navigated to forgotten password page");
		System.out.println("Page title:"+driver.getTitle());
		driver.close();
		
	}

}
