package facebook;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Loginbuttonisenable {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testLoginButtonEnabledWithValidInput() {
	       
	        WebElement usernameField = driver.findElement(By.id("email"));
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        WebElement loginButton = driver.findElement(By.name("login"));

	        
	        Assert.assertFalse(loginButton.isEnabled(), "'Login' button is not disabled initially");

	       
	        String validUsername = "your_valid_username";
	        String validPassword = "your_valid_password";
	        usernameField.sendKeys(validUsername);
	        passwordField.sendKeys(validPassword);

	        
	        Assert.assertTrue(loginButton.isEnabled(), "'Login' button is not enabled with valid input");

	        
	        usernameField.clear();
	        passwordField.clear();

	      
	        Assert.assertFalse(loginButton.isEnabled(), "'Login' button is not disabled after clearing fields");
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
	
	
	


