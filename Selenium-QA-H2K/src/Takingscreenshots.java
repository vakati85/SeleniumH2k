

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Takingscreenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new FirefoxDriver();
       driver.get("https://www.google.com");
       //String str = driver.getTitle();
        //logic starts   int i = (int)2.5f
       TakesScreenshot tss = (TakesScreenshot) driver;
       File source = tss.getScreenshotAs(OutputType.FILE);
       String path =source.getAbsolutePath();
       System.out.println("Path of the File is =" + path);
       //Copy the File from one location to another location
       File destFile = new File("C:\\Users\\pva\\google.jpg");
       try {
		FileUtils.copyFile(source, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	}

}
