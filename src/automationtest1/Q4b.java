package automationtest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4b {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox' ][1]"));
		checkbox1.click();
		WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox' ][2]"));
		checkbox2.click();
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total checkboxes: " +checkboxes.size());
	
		

		System.out.println("First checkbox selected: " +checkbox1.isSelected());
		System.out.println("Second checkbox selected: " +checkbox2.isSelected());
		driver.quit();
        
		
		

	}

}
