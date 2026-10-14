package uploaddownload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String baseURL="https://demoqa.com/upload-download";
		driver.get(baseURL);
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
