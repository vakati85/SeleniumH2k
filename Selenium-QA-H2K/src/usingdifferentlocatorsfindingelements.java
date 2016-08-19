import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class usingdifferentlocatorsfindingelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FirefoxDriver driver= new FirefoxDriver();
		 driver.get("https://www.facebook.com");
		 WebElement username=driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		 //if we have multiple matching nodes we can give parenthesis like (//input[starts-with(@id,'email')])[4] and can give the desired index value
		 username.click();
		 username.sendKeys("vakati85");
		
		 //WebElement pword= driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		 WebElement pword= driver.findElement(By.cssSelector("#pass"));
		 //converting xpath to css syntax:html>body>tbody>tr:nth-of-type(1)>td:nth-of-type(2)>input
		 // > in css means direct child..finding all input elements  type input 
		 //html>boby means body is immediate child of html>.//in xpath is replaced with > in css
		 
		 pword.click();
		 pword.sendKeys("xyz");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement Login=driver.findElement(By.cssSelector("label#loginbutton"));//tagname#idvalue if we find id..if we find classname..we havee to give .classname
		 Login.click();
		 WebElement linktext=driver.findElement(By.linkText("Sign up for Facebook"));
		 linktext.click();
		 WebElement partialtext=driver.findElement(By.partialLinkText("birthday"));
		 partialtext.click();
		 //partialLinkText(hyperlink) for dynamic links where the text is keep on changing. So we use the static part
		 //linktext(hyperlink)
	}

}
