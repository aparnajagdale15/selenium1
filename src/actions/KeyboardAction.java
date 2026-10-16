package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		// KEYBOARD ACTIONS
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				Actions action = new Actions(driver);
				driver.get("https://demoqa.com/text-box");
				Thread.sleep(2000);
				WebElement nameField=driver.findElement(By.id("userName"));
				WebElement emailField=driver.findElement(By.id("userEmail"));
				// sendKeys()
				nameField.sendKeys("Aparna");
				emailField.sendKeys("Aparna");
				Thread.sleep(3000);
				// CTRL + A (Select All)
				action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
				Thread.sleep(2000);
				
				// CTRL + C (Copy All)
				action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
				// CTRL + V (Paste All)
				action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				Thread.sleep(2000);
				driver.quit();
				


	}

}
