package MultipleWindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Open URL
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		// Store parent window ID
	    String parentId = driver.getWindowHandle();
	    // 2️⃣ Click all child window buttons
	    driver.findElement(By.id("tabButton")).click();
	    driver.findElement(By.id("windowButton")).click();
	    Thread.sleep(2000);
	    //3 Get all windows
	    Set<String>allWindows=driver.getWindowHandles();
	    for(String id:allWindows) {
	    	//if it is not parent-then it is child
	    	if(!id.equals(parentId)) {
	    		driver.switchTo().window(id);
	    		Thread.sleep(2000);
	    		String text=driver.findElement(By.id("sampleHeading")).getText();
	    		System.out.println("Child window text: " +text);
	    	}
	    }
	    Thread.sleep(2000);
	 // 4️⃣ Switch back to parent window
	 		driver.switchTo().window(parentId);
	 		Thread.sleep(3000);
	 		//Print parent heading
	 		String parentHeading=driver.findElement(By.xpath("//h1")).getText();
	 		System.out.println("Parent Heading: " +parentHeading);
	 		Thread.sleep(2000);
	 		driver.quit();
	    	}
	    

	}


