package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.id("userName")).sendKeys("Aparna Jagdale");
		Thread.sleep(500);
		driver.findElement(By.id("userEmail")).sendKeys("aparnajagdale15@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("currentAddress")).sendKeys("Rabale");
		Thread.sleep(500);
		driver.findElement(By.id("permanentAddress")).sendKeys("Rabale");
		Thread.sleep(500);
		Actions action = new Actions(driver);

        // Scroll down using keyboard
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
