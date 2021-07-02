package sikuli;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.basics.Settings;
import org.sikuli.natives.OCR;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Image;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.Tesseract;

public class practice {

	public static void main(String[] args) throws FindFailed {

		Settings.OcrTextSearch = true;
		Settings.OcrTextRead = true;

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		/*
		 * WebElement button = driver.findElement(By.xpath("//*[@id='imagesrc']"));
		 * 
		 * Actions d = new Actions(driver);
		 * d.moveToElement(button).click(button).build().perform();
		 * 
		 * ImagePath.addHTTP(
		 * "https://s3-eu-west-1.amazonaws.com/jayakumar.manian/Automation+Framework/Sikuli"
		 * );
		 * 
		 * Screen src1= new Screen(); src1.find("textinput.PNG");
		 * src1.wait("textinput.PNG", 20); 
		 * src1.type("textinput.PNG", "Test");
		 * 
		 *
		 * src1.wait("Open.png", 20);
		 *  src1.click("Open.png");
		 */
		Pattern pat= new Pattern("F:\\Jar\\Pics\\snippet\\volunter.PNG");
		Screen src1= new Screen();
		Region reg = src1.find(pat);
		reg.hover(pat);
		String str = reg.text();
		System.out.println("This is text" + str);

	}

}
