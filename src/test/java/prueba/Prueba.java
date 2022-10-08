package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hola");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/2022/Documents/Scanned Documents/chromedriver.exe");           
		
		WebDriver driver = new ChromeDriver(); 

		driver.get("http://the-internet.herokuapp.com/login");     
		
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.cssSelector("button")).click();
		
		
		if(driver.findElement(By.tagName("h2")).getText().compareTo("Secure Area")==0) {
			System.out.println("LOS TITULOS SON IGUALES");
		}
		else {
			System.out.println("NO SON IGUALES");
		}

	}

}




//driver.findElement(By.id("username")).sendKeys("tomsmith");       
//	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");       
	  //example  
//	driver.findElement(By.cssSelector("button")).click();   
	
//System.out.println(driver.findElement(By.tagName("h2")).getText());	
	//   icon-lock  assertTrue("success message not present",             
	  //      driver.findElement(By.cssSelector(".flash.success")).isDisplayed());
	  //driver.quit();  
