package pushpa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\newjava\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		Actions as= new Actions (driver);
		WebElement rightclickme= driver.findElement(By.xpath("//span [text()='right click me']"));
		as.contextClick(rightclickme).perform();
		//WebElement rightclick= driver.findElement(By.xpath("//span [text()='right click me']"))
		Thread.sleep(1000);
		WebElement dobleclick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	as.moveToElement(dobleclick).build().perform();
	}

}
