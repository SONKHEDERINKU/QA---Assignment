package SELENIUM;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hdfcbank {
  
	public static void main (String[]args) throws InterruptedException {
		
	//Disable notification program//
		
	 WebDriverManager.chromedriver().setup();
	ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(Options);
		driver.get("https://www.hdfc.com/");
		driver.manage().window().maximize();
	   Thread.sleep(1000);
	   //dropdown
	  WebElement dropdown=driver.findElement(By.xpath("//select[@class=\"cmp-form-options__field cmp-form-options__field--drop-down\"]"));
	    Select selectobj = new Select(dropdown);
	    selectobj.selectByIndex(0);
	    
	    driver.findElement(By.xpath("//li[@class=\"secondary-menu-item\"]")).click();
	    driver.findElement(By.xpath("//button[@class=\"btn btn-default disclaimer-btn\"]")).click();
	    Set<String>windowids = driver.getWindowHandles();
		Iterator itr = (Iterator) windowids.iterator();
	    
	    driver.quit();
}

	
		
	}
