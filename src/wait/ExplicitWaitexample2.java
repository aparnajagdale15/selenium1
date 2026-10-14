package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitexample2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_R_c9l6neappb6amH1_")));
		email.sendKeys("appu@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_R_cdl6neappb6amH1_"))).sendKeys("Appu");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.quit();
	}

}
