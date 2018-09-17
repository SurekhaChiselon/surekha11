package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PageTitle {
	//Verify page title 
	@Test
	public void applicationTitle()
	{
		//System.setProperty("webdriver.gecko.driver", "E:\\sairam\\selenium_practice\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/");
        String my_title = driver.getPageSource();
        
       // System.out.println("Actual title is "+my_title);
        /*String Expected_title = "Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
        Assert.assertEquals(my_title, Expected_title);
       
       */
        Assert.assertTrue(my_title.contains("Selenium WebDriver tutorial"));
        System.out.println("Test compleated");
        driver.quit();
        
		
	}

}
