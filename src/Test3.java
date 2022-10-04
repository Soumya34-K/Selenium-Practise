import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,450)", "");
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert confirmBox = driver.switchTo().alert();  
		//confirmBox.accept();
		confirmBox.dismiss();
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		Alert promtBox = driver.switchTo().alert();
		String alertText = promtBox.getText();
		System.out.println(alertText);
		promtBox.sendKeys("Soumya K");
		Thread.sleep(2000);
		promtBox.accept();
		
	}

}
