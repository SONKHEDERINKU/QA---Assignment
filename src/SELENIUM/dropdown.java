package SELENIUM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
public  static void main (String[]args) throws Exception{
		
		ChromeOptions co = new ChromeOptions();
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectobject= new Select(dropdown);
		selectobject.selectByIndex(2);
		selectobject.deselectByValue("option 2");
		selectobject.selectByVisibleText("option 3");
		
		driver.quit();
		System.out.println("DONE");

}}
