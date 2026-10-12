package uploaddownload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://the-internet.herokuapp.com/upload";
		driver.get(baseUrl);
		Thread.sleep(2000);
		WebElement uploadElement=driver.findElement(By.id("file-upload"));
		Thread.sleep(2000);
		//////enter the file path on to the file-selection input field
		uploadElement.sendKeys("C:\\Users\\admin\\Myconnection~1.sql");
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
