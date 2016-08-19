import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserinvoking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String actual=driver.getTitle();
		String expected = "Google";
		if(actual.equals(expected)){
			System.out.println("PASS");
		}
		else{
			System.out.println("Fail");
		}
		

	}

}
