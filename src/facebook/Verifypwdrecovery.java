package facebook;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Verifypwdrecovery {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testPasswordRecovery() {
	        
	        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));
	        forgotPasswordLink.click();

	      

	       
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("registered_email@example.com");

	        
	        WebElement recoverPasswordButton = driver.findElement(By.name("recover"));
	        recoverPasswordButton.click();

	       
	        WebElement successMessage = driver.findElement(By.xpath("//div[contains(text(),'Password recovery instructions sent.')]"));
	        Assert.assertTrue(successMessage.isDisplayed(), "Success message not displayed");

	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
	
	


