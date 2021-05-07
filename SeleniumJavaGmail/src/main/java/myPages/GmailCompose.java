package myPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GmailCompose {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jithin Nair\\neweclipseworkspace\\SeleniumJavaGmail\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jn78286@gmail.com");
		
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		
		String ParentWindow =driver.getWindowHandle();
		
		for(String ChildWindow: driver.getWindowHandles()) {
			
			driver.switchTo().window(ChildWindow);
			
		}
		
		driver.findElement(By.xpath("//div[@id=':1al']")).sendKeys("Incubyte");
		driver.findElement(By.xpath("//div[@id=':1bp']")).sendKeys("Automation QA test for Incubyte");
		
		
		driver.quit();
		

	}

}
