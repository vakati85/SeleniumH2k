import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelements {

	

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
       FirefoxDriver driver = new FirefoxDriver();
       driver.get("http://www.ironspider.ca/forms/checkradio.htm#checkbox");
      List<WebElement> list =driver.findElements(By.cssSelector(".Example>form>input"));
       System.out.println("Number of checkboxes" + list.size());
       for (int i=0;i < list.size();i++){
    	   list.get(i).click();*/
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm#checkbox");
		int count = driver.findElements(By.cssSelector(".Example>form>input")).size();
		System.out.println("Number of checkboxes" + count);
		for(int i = 0;i<count;i++){
		 String text=driver.findElements(By.cssSelector(".Example>form>input")).get(i).getAttribute("value");
		 
		 if(text.equals("blue")){
			 driver.findElements(By.cssSelector(".Example>form>input")).get(i).click();
		 }
		}
       }
    	  
	}


