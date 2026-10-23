package automationtestpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword! ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Use findElements() to count total links on page.
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(" Total number of links: " +links.size());
		driver.quit();

	}

}
