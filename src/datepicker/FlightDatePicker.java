package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDatePicker {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		//Handle popup after website opens
		closeLoginPopup();
		
		 // Click anywhere on page
        //driver.findElement(By.tagName("body")).click();
		
		 // Again handle popup if appears
		closeLoginPopup();
        
        //Click Departure field
        WebElement departure=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='departure']")));
        departure.click();
        
        // Again handle popup after clicking departure
        closeLoginPopup();
        
        String targetMonth = "December 2026";
        String targetMonthShort = "Dec";
        String targetYear = "2026";
        String targetDate = "15";
        
        //Loop until target month appears
        while(true) {
        	
        	//Get both visible months
        	List<WebElement> months=driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Caption')]"));
        	boolean monthFound=false;
        	for(WebElement month:months) {
        		String displayedMonth=month.getText();
        		System.out.println("Displayed Month:" +displayedMonth);
        		if(displayedMonth.equalsIgnoreCase(targetMonth)) {
        			monthFound=true;
        			break;
        		}
        	}
        	//Stop loop if month found
        	if(monthFound) {
        		break;
        	}
        	//Click next month arrow
        	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        	
        }
        //Create dynamic xpath for date
        String dateXpath="//div[contains(@aria-label,"+targetMonthShort+""+targetYear+")]";
        
        // Wait and click date
        WebElement dateElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(dateXpath)));
        dateElement.click();
        Thread.sleep(1000);
        
        System.out.println("Departure date selected successfully");
        
        closeLoginPopup();
        Thread.sleep(1000);
        driver.close();
    }

    // Reusable popup handling method
    public static void closeLoginPopup() {

        try {

            List<WebElement> popup =
                    driver.findElements(
                            By.xpath("//span[@class='commonModal__close']"));

            if (popup.size() > 0 && popup.get(0).isDisplayed()) {

                popup.get(0).click();

                System.out.println("Popup closed");
            }

        } catch (Exception e) {

            System.out.println("Popup not present");
        }
        
        
		

	}

}
