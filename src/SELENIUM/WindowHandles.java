package SELENIUM;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions co = new ChromeOptions();
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String>windowids = driver.getWindowHandles();
		Iterator itr = (Iterator) windowids.iterator();
		//String mainwindowid = itr.next();
		//String childwindowid =itr.next();
		//driver.switchTo().window(childwindowid);
		String firstparaonchildwindow = driver.findElement(By.className("example")).getText();
		System.out.println("New Window");
		driver.quit();
	}

}
