package testIng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beforeclassafterclass {
	WebDriver driver;
	@BeforeClass 
	
	public void login(){
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		driver.get("https://www.amazon.com");
		Actions abc = new Actions(driver);
		WebElement signin=driver.findElement(By.linkText("Your Account"));
		abc.moveToElement(signin).build().perform();
		driver.findElement(By.linkText("Sign in")).click();
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.click();
		uname.sendKeys("rohini.vakati@yahoo.com");
		WebElement pword =driver.findElement(By.id("ap_password"));
		pword.click();
		pword.sendKeys("welcome");
		driver.findElement(By.id("signInSubmit")).click();
		
	@AfterClass
	public void logout(){
		//driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		Actions xyz =new Actions(driver);
		WebElement logout=driver.findElement(By.id("Your Account"));
		xyz.moveToElement(logout).build().perform();
		driver.findElement(By.linkText("Not john? Sign Out")).click();
	}
	@Test
	public void test1(){
		//driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		Actions lmn = new Actions(driver);
		WebElement history =driver.findElement(By.id("nav-recently-viewed"));
		
		lmn.moveToElement(history).build().perform();
		driver.findElement(By.linkText("View and Edit")).click();
		String actual=driver.getTitle();
		String expected ="Amazon.com - Your Browsing History";
		Assert.assertEquals(actual, expected);
	}
	@Test(dependsOnMethods={"test1"})
	public void test2(){
		//driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.linkText("Today's Deals")).click();
		String actual=driver.getTitle();
		String expected ="Gold Box Deals | Today's Deals -Amazon.com";
		Assert.assertTrue(expected.contains("Gold"));
	}
	@Test(dependsOnMethods={"test2"})
	public void test3(){
		//driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	
		String actual=driver.getTitle();
		String expected ="Gold Box Deals | Today's Deals -Amazon.com";
		Assert.assertEquals(actual, expected);
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}


