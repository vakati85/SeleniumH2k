import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatingelementswithid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//String S=driver.getTitle();
		WebElement uname=driver.findElement(By.id("email"));
		uname.click();
		uname.clear();
		uname.sendKeys("vakati@gmail.com");
		System.out.println(uname.getAttribute("value"));
		WebElement pword =driver.findElement(By.id("pass"));
		pword.click();
		pword.clear();
		pword.sendKeys("xyz");
		System.out.println(pword.getAttribute("value"));
		WebElement Submit =driver.findElement(By.id("u_0_o"));
		Submit.click();
		//In the same way we can find elements with name ,classname,tagname..
		//if we r unable to find the elements with above locators we can go for xpath
		//in some class all the text boxes will have same id ,name,classname and tagnames in that cases we go for xpath
		
		

	}

}
