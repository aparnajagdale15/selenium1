package automationtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("loginusername"));
		username.sendKeys("Aparna");
		WebElement password=driver.findElement(By.id("loginpassword"));
		password.sendKeys("Appu");
		System.out.println("Username field displayed: " +username.isDisplayed());
		System.out.println("Username field enabled: " +username.isEnabled());
		System.out.println("Username placeholder: " +username.getAttribute("placeholder"));
		driver.findElement(By.xpath("//div[@id='logInModal']")).click();
		Thread.sleep(2000);
		WebElement product=driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		System.out.println("Product name: " +product.getText());
		Thread.sleep(2000);
		driver.quit();

	}

}
