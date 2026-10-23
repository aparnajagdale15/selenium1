package automationtestpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(500);
		driver.navigate().to("https://www.google.com/?zx=1792741784104");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);
		driver.quit();

	}

}
