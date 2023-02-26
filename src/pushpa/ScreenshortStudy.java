package pushpa;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshortStudy {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\newjava\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
		System.out.println(source);
		File dest= new File("C:\\Users\\Lenovo\\Pictures\\Saved Pictures");
		FileHandler.copy(source, dest);
	}

}
