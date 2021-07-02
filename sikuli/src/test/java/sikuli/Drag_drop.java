package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		 
		//Pattern dragImage= new Pattern("F:\\Jar\\Pics\\Drag1.PNG");
		//Pattern dropImage= new Pattern("F:\\Jar\\Pics\\Drop2.PNG");
		
		 ImagePath.addHTTP("https://i.ibb.co/H75Bm7v");
		
		 Screen src= new Screen();
		 src.find("Drag1.PNG");
		 src.wait("Drag1.PNG",20);
		 src.drag("Drag1.png");
		
		 ImagePath.addHTTP(" https://i.ibb.co/dPrLrfj");
		 
		 src.find("Drop2.PNG");
		 src.wait("Drop2.PNG",20);
		 src.dropAt("Drop2.PNG");
			 
	}

}
