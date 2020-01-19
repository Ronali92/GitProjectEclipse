package P1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Day1 {
	WebDriver driver;
JavascriptExecutor jse;
 public void invokebrowser() {
	 try {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_jars\\chromedriver.exe");
		 driver = new ChromeDriver(options);
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// driver.get("http://www.edureka.co");
		 driver.get("https://www.facebook.com");
		 
		// search();
		 idpass();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
 }
 public void search() {
	 try {
		driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys("Java");
		 Thread.sleep(3000);
		 driver.findElement(By.id("search-button-top")).click();
		jse= (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1000)");
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
 }
 public void idpass() {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("panda.ronali@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Saibaba23");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[contains(text(),'Account Settings')]")).click();
	driver.findElement(By.xpath("//span[contains(text() ,'Log')]")).click();
 }
	public static void main(String[] args) { 
		Day1 obj = new Day1();
		obj.invokebrowser();
		
		

	}

}
