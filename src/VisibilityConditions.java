import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisibilityConditions {

	public static void main(String[] args) {
		
		 
		System.setProperty("webdriver.gecko.driver","E:\\Selenium Project\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
         String appUrl = "https://google.com";
         driver.get(appUrl);
         driver.manage().window().maximize();
         
         String expectedTitle="Google";
         String actualTitle = driver.getTitle();
         
         if(expectedTitle.equals(actualTitle))
        	 
         {
        	 System.out.println("Verification Successful - The correct title is displayed on the web page.");
         }
         else
         {
                System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        	 
         }
         
         boolean submitbuttonPresence = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).isDisplayed();
         System.out.println(submitbuttonPresence);
         driver.close();
         
         
         
         
         

	}

}
