package SELENIUM;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class MobileAppLoginTest {

	    private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Set up WebDriver (Assuming ChromeDriver for this example)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        // Navigate to the login page
	        driver.get("url_of_the_mobile_app_login_page");
	    }

	    @Test(priority = 1)
	    public void testValidLogin() {
	        // Perform valid login
	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.id("loginButton"));

	        usernameField.sendKeys("valid_username");
	        passwordField.sendKeys("valid_password");
	        loginButton.click();

	        // Assert that the user is successfully logged in
	        WebElement welcomeMessage = driver.findElement(By.id("welcomeMessage"));
	        Assert.assertTrue(welcomeMessage.isDisplayed());
	    }

	    @Test(priority = 2)
	    public void testInvalidLogin() {
	        // Perform invalid login
	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.id("loginButton"));

	        usernameField.sendKeys("invalid_username");
	        passwordField.sendKeys("invalid_password");
	        loginButton.click();

	        // Assert that an error message is displayed
	        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
	        Assert.assertTrue(errorMessage.isDisplayed());

	        // Assert that the entered username and password fields are retained
	        Assert.assertEquals(usernameField.getAttribute("value"), "invalid_username");
	        Assert.assertEquals(passwordField.getAttribute("value"), "invalid_password");
	    }

	    // Implement other test methods for remaining test cases

	    @AfterClass
	    public void tearDown() {
	        // Close the browser after all tests are executed
	        driver.quit();
	    }
	}


