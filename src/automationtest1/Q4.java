package automationtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp");
		driver.manage().window().maximize();
		WebElement radioButton=driver.findElement(By.xpath("//input[@name='radio' ]"));
		radioButton.click();
		Thread.sleep(2000);
		boolean status=radioButton.isSelected();
		System.out.println("Radio Button selected: " +status);
		driver.quit();

	}

}
