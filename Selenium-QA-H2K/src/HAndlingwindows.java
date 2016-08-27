import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HAndlingwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.id("query")).sendKeys("tcs");
		driver.findElement(By.className("mw001-widget-getquote-btn")).click();
		Set<String> Wset = driver.getWindowHandles();
		System.out.println("Name of the parent =" + parent);
		
		for( String child :Wset){
			if(!(child.equals(parent))){
				driver.switchTo().window(child);
				
				
				if(driver.getCurrentUrl().endsWith("tcs")){
					System.out.println(driver.getTitle());
					break;
				}
				else{
					System.out.println("Its not the window to switch");
				}
				
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		

	}

}
