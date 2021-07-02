package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenfocus {

	public static void main(String[] args) throws InterruptedException {


		//"F:\Jar\Pics\hover.PNG"
		try {

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			driver.get("http://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			Pattern pat= new Pattern("F:\\Jar\\Pics\\hover.PNG");

			Screen scr= new Screen();
			Thread.sleep(5000);
			System.out.println("Test is");
			
		
			scr.hover(pat);
			scr.paste(pat, "test");
		} 
		catch (FindFailed e) {

			e.printStackTrace();
		}

	}

}
