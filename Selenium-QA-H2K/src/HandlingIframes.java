import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.className("mw001-widget-getquote-btn")).click();
		driver.switchTo().defaultContent();
		
		
		
}
}