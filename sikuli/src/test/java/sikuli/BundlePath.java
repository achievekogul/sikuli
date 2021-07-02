package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BundlePath {

	public static void main(String[] args) throws InterruptedException {

		try {
			WebDriverManager.chromedriver().setup();

			WebDriver driver =new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

			WebElement button=	driver.findElement(By.xpath("//*[@id='imagesrc']"));

			Actions d= new Actions(driver);
			d.moveToElement(button).click(button).build().perform();
			Thread.sleep(2000);
			Screen src= new Screen(); 

			ImagePath.setBundlePath(System.getProperty("user.dir")+"\\images\\");
			Match textinput = src.find("textinput.PNG");
			Match open = src.find("Open.png");
			
			textinput.type(textinput,System.getProperty("user.dir")+"\\images\\Green.png");
			src.click(open);
		}
		
		catch (FindFailed e) {	
			
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}



	}

}
