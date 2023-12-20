package facebook;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Scriptautomaticallynavigate {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testPaginationOnLoginPage() {
	       
	        By nextPageButtonLocator = By.xpath("//button[@class='next-page']");
	        By dataElementLocator = By.xpath("//div[@class='data-element']");

	       
	        do {
	            
	            captureDataOnCurrentPage();

	           
	            WebElement nextPageButton = driver.findElement(nextPageButtonLocator);
	            if (nextPageButton.isEnabled()) {
	              
	                nextPageButton.click();
  
	            } else {
	              
	                break;
	            }
	        } while (true);
	    }

	    private void captureDataOnCurrentPage() {
	      
	       
	        System.out.println("Capturing data on the current page");
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


