package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Similar {
	
	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		WebElement button=	driver.findElement(By.xpath("//*[@id='imagesrc']"));

		Actions d= new Actions(driver);
		d.moveToElement(button).click(button).build().perform();
		Thread.sleep(2000);
		

		
		
		System.out.println(System.getProperty("user.dir")+"\\images\\textinput.PNG");
		Pattern fileinputtextbox = new Pattern((System.getProperty("user.dir")+"\\images\\textinput.PNG")); 
		Pattern open = new Pattern((String)System.getProperty("user.dir")+"\\images\\Open.png");
		
		Thread.sleep(5000);

		Screen src= new Screen(); 
		src.wait(fileinputtextbox.similar((float)0.90),20); 
		src.type(fileinputtextbox,System.getProperty("user.dir")+"\\images\\Green.png");
		Thread.sleep(2000);
		src.click(open);
		Thread.sleep(2000);
		driver.quit();

	}

}
