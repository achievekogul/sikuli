package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondDraggable {
	
	
public static void main(String[] args) throws FindFailed, InterruptedException {
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
	 
	Pattern dragImage= new Pattern("F:\\Jar\\Pics\\Drag1.PNG");
	Pattern dropImage= new Pattern("F:\\Jar\\Pics\\Drop2.PNG");
	
	Screen src= new Screen();
	src.wait(dragImage,20);
	src.drag(dragImage);
	Thread.sleep(2000);
	src.dropAt(dropImage);
}

}
