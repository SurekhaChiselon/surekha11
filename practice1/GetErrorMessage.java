package practice1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetErrorMessage {
	@Test
	public void errorMessage()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seliniumjarfolder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/Login?hl=EN");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		String //Actual_txt=driver.findElement(By.xpath("//div[text()='Please enter an email address']")).getText();
		 Actual_txt=driver.findElement(By.xpath("//div[text()='Please enter an email address']")).getAttribute("innerHTML");
		String Expected_txt="Please enter an email address";
		Assert.assertEquals(Actual_txt, Expected_txt);
		System.out.println("Test completed");
		driver.quit();
	
		
	}

}
