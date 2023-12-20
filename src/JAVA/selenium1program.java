package JAVA;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
public class selenium1program {

	public static void main(String[] args){
   System.setProperty("WebDriver.Chrome.driver","C:\\programsJAVA\\DRIVERS\\chromedriver.exe");
   ChromeOptions options = new ChromeOptions();
   options.setBinary("C:\\Users\\rinku\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");
   WebDriver driver = new ChromeDriver(options);
   driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
  
   
   

	}

}
