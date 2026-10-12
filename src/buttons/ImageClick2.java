package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageClick2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/gp/product/B0GTM4HHD1?aref=uEMBtyegei&aaxitk=e4796f423e960df5e3447d8d4bedf489&th=1&pd_rd_plhdr=t&pf_rd_r=HQ22PHSHDF79RJ3450FE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action = new Actions(driver);

        // Scroll down using keyboard
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
		driver.findElement(By.id("landingImage")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
