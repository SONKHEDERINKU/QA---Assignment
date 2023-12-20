package facebook;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Passwordrecoverypage {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testForgotPasswordRedirect() {
	      
	        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));

	        
	        forgotPasswordLink.click();

	        
	        try {
	            Thread.sleep(3000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	     
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("forgotpassword"), "Not redirected to the password recovery page");
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
	


