package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		WebElement yes=driver.findElement(By.xpath("//input[@id='yesRadio']"));
		yes.click();
		Thread.sleep(2000);
		System.out.println("After click is selected: " +yes.isSelected());
		driver.quit();

	}

}
