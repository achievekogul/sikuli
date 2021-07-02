package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, FindFailed {
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
		  
		  Screen src1 = new Screen(); 
		  src1.find("textinput.png");
		  src1.wait("textinput.png",20); 
		  src1.type("textinput","Test");
		  
		  Thread.sleep(2000);
		 
//Pattern pattern =new Pattern("F:\\Jar\\Pics\\Open.png");



		ImagePath.addHTTP("https://i.ibb.co/r3cwxFY/Open.png");
		  src1.find("Open.png");
		  src1.delayClick(10000);
		  src1.click("Open.png", 360);
		 
		 Thread.sleep(2000);
		 driver.quit();


		driver.quit();
	}

}
