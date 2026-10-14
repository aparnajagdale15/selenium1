package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		  // 1️⃣ Simple Alert - accept()
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println("Simple alert text: " +alert1.getText());
		Thread.sleep(2000);
		alert1.accept();  //Click Ok
		Thread.sleep(5000);
		
		 // 2️⃣ Confirm Alert - dismiss()
		driver.findElement(By.xpath("//button[text()='//button[text()='Click for JS Confirm']']")).click();
		Alert alert2=driver.switchTo().alert();
		System.out.println("Confirm alert text: " +alert2.getText());
		Thread.sleep(2000);
		alert2.dismiss(); //Click Cancel
		Thread.sleep(5000);
		
		 // 3️⃣ Prompt Alert - sendKeys()
		driver.findElement(By.xpath("//button[text()='//button[text()='Click for JS Prompt']']")).click();
		Alert alert3=driver.switchTo().alert();
		System.out.println("Prompt Alert Text: " +alert3.getText());
		alert3.sendKeys("Hello Selenium"); //Enter text
		alert3.accept();  //Click Ok
		Thread.sleep(2000);
		driver.quit();

	}

}
