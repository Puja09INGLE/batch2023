package pushpa;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenStudy {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\newjava\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println("src");
		File des = new File("C:\\Users\\Lenovo\\Desktop\\temp");
		FileHandler.copy(Source, des);
				
		
	}

}
