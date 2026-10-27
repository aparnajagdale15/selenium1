package automationtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String baseURL="https://demoqa.com/upload-download";
		driver.get(baseURL);
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(2000);
		WebElement uploadElement=driver.findElement(By.id("uploadFile"));
		Thread.sleep(2000);
		uploadElement.sendKeys("C:\\Users\\admin\\Myconnection~1.sql");
		Thread.sleep(2000);
		driver.close();
		

	}

}
