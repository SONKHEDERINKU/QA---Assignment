package facebook;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class PasswordStrengthTest {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	       
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://your-website.com"); // Replace with the actual URL
	    }

	    @Test
	    public void testPasswordStrength() {
	        
	        By passwordInputLocator = By.id("password");
	        By strengthMeterLocator = By.id("strengthMeter");
	        By strengthMessageLocator = By.id("strengthMessage");

	       
	        WebElement passwordInput = driver.findElement(passwordInputLocator);

	        
	        passwordInput.sendKeys("weakpassword");

	        
	       
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	       
	        WebElement strengthMeter = driver.findElement(strengthMeterLocator);
	        Assert.assertTrue(strengthMeter.getAttribute("class").contains("weak"), "Weak password not detected");

	       
	        WebElement strengthMessage = driver.findElement(strengthMessageLocator);
	        Assert.assertEquals(strengthMessage.getText(), "Password is too weak", "Incorrect strength message");

	       
	        passwordInput.clear();
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
	
	


