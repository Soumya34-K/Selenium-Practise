import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/91959/Desktop/index.html");
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		
		Select dropDown1 = new Select(driver.findElement(By.id("SelectID_One")));
		dropDown1.selectByVisibleText("Grey");
		Thread.sleep(2000);
		
		Select dropDown2 = new Select(driver.findElement(By.id("SelectID_Two")));
		dropDown2.selectByValue("limevalue");
		Thread.sleep(2000);
		
		Select dropDown3 = new Select(driver.findElement(By.id("SelectID_Three")));
		dropDown3.selectByIndex(3);
		Thread.sleep(2000);
		
		driver.close();
		
	
		
	}
}