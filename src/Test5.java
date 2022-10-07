import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","E:\\Selenium Project\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://demo.guru99.com/test/newtours/");   
	    Actions act = new Actions(driver);
	    WebElement Link_Home= driver.findElement(By.linkText("Flights"));
	    act.moveToElement(Link_Home).build().perform();
	    Thread.sleep(3000);

	}

}
