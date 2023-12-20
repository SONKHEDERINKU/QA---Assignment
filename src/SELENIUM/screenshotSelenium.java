package SELENIUM;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotSelenium {

	public static void main(String[] args) throws Exception {
		ChromeOptions co = new ChromeOptions();
		
		
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		 //WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File srcScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationpath=System.getProperty("user.dir")+"\\Screenshots\\"+"Homepage.png";
		FileHandler.copy(srcScreenshotFile, new File(destinationpath));
	driver.close();
	}
}
