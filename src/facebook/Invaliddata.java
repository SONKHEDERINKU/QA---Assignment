package facebook;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Invaliddata {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testLoginWithInvalidCredentials() {
	        // Replace these with actual invalid credentials
	        String invalidUsername = "your_invalid_username";
	        String invalidPassword = "your_invalid_password";

	       
	        WebElement usernameField = driver.findElement(By.id("email"));
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        WebElement loginButton = driver.findElement(By.name("login"));

	      
	        usernameField.sendKeys(invalidUsername);
	        passwordField.sendKeys(invalidPassword);

	        
	        loginButton.click();

	        
	        try {
	            Thread.sleep(3000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        
	        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'The password you’ve entered is incorrect.')]"));
	        Assert.assertTrue(errorMessage.isDisplayed(), "Expected error message not displayed");
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


