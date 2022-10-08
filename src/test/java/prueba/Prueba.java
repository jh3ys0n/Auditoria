package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hola");
		
		// Optional. If not specified, WebDriver searches the PATH for chromedriver.       
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/2022/Documents/Scanned Documents/chromedriver.exe");           
		
		WebDriver driver = new ChromeDriver(); 

		driver.get("http://the-internet.herokuapp.com/login");     
		
		driver.findElement(By.name("username")).sendKeys("jeyson bartolome");
		driver.findElement(By.id("password")).sendKeys("Urrelo");
		
		driver.findElement(By.cssSelector("button")).click();
		
	//	driver.findElement(By.id("username")).sendKeys("tomsmith");       
	//	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");       
		  //example  
	//	driver.findElement(By.cssSelector("button")).click();   
		
	System.out.println(driver.findElement(By.tagName("h2")).getText());	
		//   icon-lock  assertTrue("success message not present",             
		  //      driver.findElement(By.cssSelector(".flash.success")).isDisplayed());
		  //driver.quit();  

	}

}
