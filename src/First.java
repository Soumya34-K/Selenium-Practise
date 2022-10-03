import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		
		//Textbox selection
		driver.findElement(By.xpath("//span[contains(text(),'Text Box')]")).click();
		String sampleText = driver.findElement(By.xpath("//label[@id='userName-label']")).getText();
		System.out.println(sampleText);
		driver.findElement(By.id("userName")).sendKeys("Soumya");
		driver.findElement(By.id("userEmail")).sendKeys("soumya.gvit@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Koppa");
		driver.findElement(By.id("permanentAddress")).sendKeys("Sorab");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("submit")).click();
		
		//Radiobutton selection
		driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]")).click();
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		String text1= driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
		System.out.println(text1);
		
		//Checkbox selection
		driver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();
		driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Desktop')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Documents')]")).click();
		String Results = driver.findElement(By.id("result")).getText();
		System.out.println(Results);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//span[normalize-space()='Links']")).click();
		driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
		

	}

}
