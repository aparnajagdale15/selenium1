package webElementcommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		WebElement element=driver.findElement(By.xpath("//a[text()='Go To Registration ']"));
		System.out.println("CSS Value is: " +element.getCssValue("Padding"));
		driver.close();
		

	}

}
