package sikuli;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.basics.Settings;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Image;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Http {

	public static void main(String[] args) throws InterruptedException, FindFailed, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		WebElement button = driver.findElement(By.xpath("//*[@id='imagesrc']"));

		Actions d = new Actions(driver);
		d.moveToElement(button).click(button).build().perform();
		Thread.sleep(2000);
		//https://i.ibb.co/cxSW1tm
		
		  ImagePath.addHTTP("https://i.ibb.co/9YrQTWJ");
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

		  Screen src1 = new Screen(); 
		  Match textinput=  src1.find("textinput.png");
		  src1.wait("textinput.png",20); 
		  src1.type(textinput,"Test");
	
		  Match b=  src1.exists("textinput.png");
		  System.out.println(b);
		 
		  src1.rightClick(textinput);
		  
		  Thread.sleep(2000);
		 
//Pattern pattern =new Pattern("F:\\Jar\\Pics\\Open.png");



			
			/*
			 * ImagePath.addHTTP("https://i.ibb.co/r3cwxFY"); Screen src = new Screen();
			 * Match open= src.find("Open.png"); src.find("Open.png"); src.delayClick(2000);
			 * src.click(open);
			 */
			 
		  
		 Pattern pattern =new Pattern("F:\\Jar\\Pics\\Open.png");
		  
		 Match open=  src1.find(pattern);
		 open.delayClick(2000);
		 open.setTargetOffset(671,438);

		 open.click(pattern);
			

			  App.open("F:\\Jar\\Pics\\Open.png");
			
			 
		 
		 Thread.sleep(2000);
		 driver.quit();


		driver.quit();

	}
}
