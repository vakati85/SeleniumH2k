import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HAndlinglistboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FirefoxDriver driver = new FirefoxDriver();
         driver.get("https://www.facebook.com");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         WebElement Firstname=driver.findElementById("u_0_1");
         Firstname.click();
         Firstname.sendKeys("Rohini");
         WebElement Lastname=driver.findElementById("u_0_3");
         Lastname.click();
         Lastname.sendKeys("Vakati");
         WebElement Email=driver.findElementById("u_0_5");
         Email.click();
         Email.sendKeys("vakati@gmail.com");
         WebElement Reenter=driver.findElementById("u_0_8");
         Reenter.click();
         Reenter.sendKeys("vakati@gmail.com");
         WebElement Pword=driver.findElementById("u_0_a");
         Pword.click();
         Pword.sendKeys("facebook");
         Select month=new Select(driver.findElementById("month"));
         month.selectByVisibleText("May");
         Select day= new Select(driver.findElementById("day"));
         day.selectByValue("20");
         Select year= new Select(driver.findElementById("year"));
         year.selectByValue("1995");
         driver.findElementById("u_0_d").click();
         driver.findElementById("u_0_i").click();
        		 
        		 
        		 
        		 
        		 
        		
         		
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
	}

}
