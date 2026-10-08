package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxeg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		//Home tab
		WebElement plus=driver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
		plus.click();
		Thread.sleep(500);
		WebElement checkbox1=driver.findElement(By.xpath("//span[@aria-label='Select Home']"));
		checkbox1.click();
		Thread.sleep(200);
		WebElement checkbox2=driver.findElement(By.xpath("//span[@aria-label='Select Desktop']"));
		checkbox2.click();
		Thread.sleep(2000);
		System.out.println("After Click Is Selected:" +checkbox1.isSelected());
		driver.quit();
		

	}

}
