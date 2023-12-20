package SELENIUM;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot2 {
	
	public  static void main (String[]args) throws Exception{
		
		ChromeOptions co = new ChromeOptions();
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		File srcScreenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationpath= System.getProperty("usir.dir")+"\\Screenshots\\"+"youtube.png";
		FileHandler.copy(srcScreenshotFile, new File(destinationpath));
	}

}
