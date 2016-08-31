package testIng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencytestng {
	WebDriver driver;
	
	
	@Test
	//dependency tests means each method depends on following methods like if we login then test then logout
	//not test then login and logout ....in this program everything goes alphabetically..but in case if one goes first then goes second
	//then
	
	public void login(){
		 driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com");
		 WebElement email = driver.findElement(By.id("email"));
		 email.click();
		 email.clear();
		 email.sendKeys("rohini.vakati@yahoo.com");
		 driver.findElement(By.id("pass")).click();
		 driver.findElement(By.id("pass")).clear();
		 driver.findElement(By.id("pass")).sendKeys("wedding_01");
		 driver.findElement(By.id("u_0_n")).click();
		 String Actual= driver.getTitle();
		 String Expected = "Facebook";
		 Assert.assertEquals(Actual, Expected);
		 
	}
	@Test(dependsOnMethods={"login"})
	public void test1(){
		
	driver.findElement(By.id("u_0_3")).click();
	String Actual = driver.getTitle();
	String Expected = "Facebook";
	Assert.assertEquals(Actual, Expected);
		
	}
	@Test(dependsOnMethods={"test1"},alwaysRun=true)
	public void logout(){
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.linkText("Log Out")).click();
		String Actual = driver.getTitle();
		String Expected = "Facebook - Log In or Sign Up";
		Assert.assertTrue(Expected.contains("Up"));
	}
	

}
