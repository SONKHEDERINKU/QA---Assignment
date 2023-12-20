package SELENIUM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooklogin {
	
	
	
	
	public static void main (String[]args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		
	
	WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
	 //WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123@abc");
	driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.navigate().refresh();
	
	

	}}
