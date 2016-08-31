package testIng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@Test(priority = 1)
		
		public void verifytitle(){
		
		
		 driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		 String Actual = driver.getTitle();
	    String  Expected = "Google";
		Assert.assertEquals(Actual, Expected);
	}
	@Test(priority =2)
	 public void navigatetogmail(){
		 
		 driver.findElement(By.linkText("Gmail")).click();
				 
		String  Actual = driver.getTitle();
		String Expected ="Gmail - Free Storage and Email from Google";
			 Assert.assertTrue(Actual.contains("Free"));
		 
	 }


	
}
