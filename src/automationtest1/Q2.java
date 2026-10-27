package automationtest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome and open the given URL.
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(2000);
		
		//Locate the Text input field using name
		WebElement textInput=driver.findElement(By.name("my-text"));
		
		//Locate the Password field using name.
		WebElement password=driver.findElement(By.name("my-password"));
		
		//Locate the Submit button using tagName.
		WebElement submitButton=driver.findElement(By.tagName("button"));
		
		
		//Enter your name in the text input field.
		textInput.sendKeys("Aparna");
		
		//Enter a password in the password field.
		password.sendKeys("Appu");
		
		//Use findElements() to count the total number of input elements on the page.
			List<WebElement> inputs=driver.findElements(By.tagName("input"));
			System.out.println("Total input elements: " +inputs.size());
		
		
		//Click the Submit button.
		submitButton.click();
		Thread.sleep(2000);
		
		
		// Print current page URL after submission
		System.out.println("Current URL: " +driver.getCurrentUrl());
		
		driver.quit();



		

	}

}
