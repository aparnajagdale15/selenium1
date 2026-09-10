package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pratice3 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new FirefoxDriver();
    driver.get("https://demo.guru99.com/test/newtours/");
    String title=driver.getTitle();
    System.out.println(title);
    String currentUrl=driver.getCurrentUrl();
    System.out.println(currentUrl);
    String pageSource=driver.getPageSource();
    System.out.println(pageSource);
    Thread.sleep(2000);
    driver.close();

	}

}
