package buttons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImageClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("user-name")).sendKeys("visual_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).click();
		Thread.sleep(2000);
		driver.close();
		//img[@data-image-index='1']

	}

}
