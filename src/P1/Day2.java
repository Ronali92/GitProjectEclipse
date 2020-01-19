 package P1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2 {
	WebDriver driver;
	JavascriptExecutor jse;
	 public void invokebrowser() {
		 try {
			 ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
			 driver = new ChromeDriver(options);
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			// driver.get("http://www.edureka.co");
			// driver.get("https://www.facebook.com");
			// driver.get("https://www.javatpoint.com");
			 driver.get("https://www.odishaonline.gov.in/Site/Common_Quick_Pay.aspx");
			 
			search();
			// idpass();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	 }
	 public void search() {
		
			try {
			/*	driver.findElement(By.xpath("//td[@id='gs_tti50']/input")).sendKeys("Java");
				driver.findElement(By.xpath("//td[@class='gsc-search-button']/button")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='gsc-results-close-btn gsc-results-close-btn-visible']")).click();*/
				driver.findElement(By.xpath("//a[contains(text(),'My Transaction')]")).click();
				WebElement wb =driver.findElement(By.id("txtTo"));
				wb.sendKeys(Keys.CONTROL,"2");
				wb.sendKeys(Keys.DELETE);
				driver.close();

//swicthtowindow();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	/* public void swicthtowindow() {
		 String winHandleBefore = driver.getWindowHandle();
		 System.out.println(winHandleBefore);
		 for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
		 }
		 
		 driver.close();
		 driver.switchTo().window(winHandleBefore);
	
	 }
*/
	public static void main(String[] args) {
		Day2 obj = new Day2();
		obj.invokebrowser();

	}

}
