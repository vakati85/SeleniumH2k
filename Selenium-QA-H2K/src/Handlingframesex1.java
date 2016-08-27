import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingframesex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//switching to frame by name 
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium.remote")).click();
		//switching to default content means top window..
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("RemoteWebDriver")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("FirefoxDriver")).click();
		String Actual=driver.findElement(By.className("title")).getText();
		String Expected = "Class FirefoxDriver";
		if(Actual.equals(Expected)){
			System.out.println("Tc pass");
		}
		else{
			System.out.println("TC fail");
		}
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		

	}

}
