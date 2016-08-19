import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatingelementswithcssxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FirefoxDriver driver= new FirefoxDriver();
         driver.get("https://www.gmail.com");	
         //WebElement ele=driver.findElement(By.xpath("//h2[text()='Sign in to continue to Gmail']"));//throws error 
         WebElement ele = driver.findElement(By.xpath("//h2[@class='hidden-small']"));
         System.out.println(driver.getTitle());
         String Actual = ele.getText();
         String Expected = "Sign in to continue to Gmail ";
         if(Actual.equals(Expected)){
        	 System.out.println("TC PASS");
         }
         else 
         {
        	 System.out.println("TC FAIL");
         }
}

}
