package facebook;


	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class FacebookLoginTest {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	       
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testLoginWithValidCredentials() {
	        
	        String validUsername = "your_valid_username";
	        String validPassword = "your_valid_password";

	        
	        WebElement usernameField = driver.findElement(By.id("email"));
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        WebElement loginButton = driver.findElement(By.name("login"));

	       
	        usernameField.sendKeys(validUsername);
	        passwordField.sendKeys(validPassword);

	      
	        loginButton.click();

	        
	        try {
	            Thread.sleep(3000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	       
	        String actualTitle = driver.getTitle();
	        String expectedTitle = "Facebook";
	        Assert.assertEquals(actualTitle, expectedTitle, "Login failed");
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


