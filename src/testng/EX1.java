package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX1 {
@Test
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\newjava\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("puja", true);	}

}
