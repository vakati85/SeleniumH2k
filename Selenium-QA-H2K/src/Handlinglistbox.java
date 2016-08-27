import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinglistbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           FirefoxDriver driver = new FirefoxDriver();
           driver.get("https://www.facebook.com");
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           WebElement Month=driver.findElement(By.id("month"));
            Select Monthselect =new Select(Month);
           Monthselect.selectByValue("October");
           //Monthse.deselectByValue("October");
           //Monthse.selectByIndex(3);
           //system.out.println("List of options = " + monthlist.size() );
           //select particular optio
           /*monthlist.get(8).click();
           //select particular option by for loop
           int i = Integer.parseInt("8");
           for (i = 0;i<monthlist.size();i++){
        	   if(monthlist.get(i).getText().equals("8")){
        		   monthlist.get(i).click();
        		   break;*/
        	   }
        	   
           
        	   
           
           
           
           
           
	}


