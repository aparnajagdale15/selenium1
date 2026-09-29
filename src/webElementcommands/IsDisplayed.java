package webElementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		Actions action = new Actions(driver);

        // Scroll down using keyboard
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
		WebElement element=driver.findElement(By.id("displayed-text"));
		System.out.println("display status:" +element.isDisplayed());
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		System.out.println("display status:" +element.isDisplayed());
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		System.out.println("display status:" +element.isDisplayed());
		driver.close();

	}

}
