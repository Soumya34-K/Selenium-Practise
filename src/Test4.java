import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.util.concurrent.AbstractScheduledService;

import dev.failsafe.internal.util.Assert;

public class Test4 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       String baseUrl = "https://www.javatpoint.com/";					
	
		        driver.get(baseUrl);	
		        
		  
					//verify that we are now back on Facebook's homepage	
		        driver.findElement(By.cssSelector("img[alt='Javatpoint Logo']")).click();
					if (driver.getTitle().equals("Tutorials List - Javatpoint")) {							
		            System.out.println("We are back at Javatpoint homepage");					
		        } else {			
		            System.out.println("We are NOT in Javatpoint homepage");					
		        }		
						driver.close();		

		    }		
		
	}


