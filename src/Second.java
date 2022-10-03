import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[normalize-space()='Widgets']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		
		//Dropdown selection
		WebElement ele = driver.findElement(By.xpath("//span[text()='Select Menu']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Select dropdown = new Select (driver.findElement(By.id("oldSelectMenu")));
		dropdown.selectByValue("1");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Magenta");

	}

}
