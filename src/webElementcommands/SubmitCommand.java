package webElementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("appu@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).submit();
		Thread.sleep(2000);
		driver.close();

	}

}
