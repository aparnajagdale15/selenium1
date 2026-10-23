package automationtestpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//Enter Username using sendKeys();
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(500);
		//Clear password field using clear()
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(500);
		password.clear();
		Thread.sleep(500);
		//Enter password again to login successfully
		password.sendKeys("secret_sauce");
		//Locate login button
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		
		//Check if login button is displayed using isDisplayed()
		System.out.println(" Login Button Displayed: " +loginbutton.isDisplayed());
		
		//Check if login button is enabled using isEnabled()
		System.out.println(" Login Button Enabled: " +loginbutton.isEnabled());
		
		//Click login button using click()
		loginbutton.click();
		
		//Get text of any product name using getText()
		WebElement productName=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack'] "));
		System.out.println(" Product name: " +productName.getText());
		
		//Get attribute value of any element using getAttribute()
		System.out.println("product class attribute: " +productName.getAttribute("div"));
		driver.quit();



	}

}
