package PacticePROGRAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class loginpg {
	public static void main (String[]args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		
	
	WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
	 //WebDriver driver = new ChromeDriver();
	 driver.get("https://www.petkonnect.in/");
	 driver.manage().wait(100);
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//h1[@class=\"header__heading\"]//img[@alt=\"PetKonnect\"]")).click();
     driver.findElement(By.xpath(" //a[@class='body2 list-menu__item']//span[contains(text(),'Community')]")).click();
	 driver.findElement(By.xpath("//li[@class=\"list-group-item bg-transparent filter_type-all p-0\"]")).click();
	 driver.findElement(By.xpath("//li[@class=\"list-group-item bg-transparent filter_type-photos p-0\"])")).click();
	 driver.findElement(By.xpath("//li[@class=\"list-group-item bg-transparent filter_type-embeds p-0\"]")).click();
	 driver.findElement(By.xpath("//li[@class=\"list-group-item bg-transparent filter_type-videos p-0\"]")).click();
	driver.findElement(By.xpath("//li[@class=\"list-group-item bg-transparent filter_type-products p-0\"]")).click();
	 driver.findElement(By.xpath("//li[@class=\"list-group-item bg-transparent filter_type-polls p-0\"]")).click();
	 driver.findElement(By.xpath("//li[@class=\"list-group-item bg-transparent filter_type-events p-0\"]")).click();
    driver.findElement(By.xpath("//img[@class=\"img-fluid\"]")).click();
}
}
