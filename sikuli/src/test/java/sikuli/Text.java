package sikuli;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.TextRecognizer;
import org.sikuli.natives.OCR;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {





	public static void main(String[] args) throws FindFailed, InterruptedException {



		Settings.OcrTextSearch=true;
		Settings.OcrTextRead=true;

		Pattern o= new Pattern("F:\\Jar\\Pics\\Register.PNG");


		Screen scr= new Screen();

		// Settings.OcrDataPath = "C:\\Users\\user\\AppData\\Roaming\\Sikulix\\SikulixTesseract\\tessdata";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(); 
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		WebElement button=	driver.findElement(By.xpath("//*[@id='imagesrc']"));


		Actions d= new Actions(driver);
		d.moveToElement(button).click(button).build().perform();
		Thread.sleep(2000);



		Thread.sleep(3000);

		Pattern fileinputtextbox = new Pattern((System.getProperty("user.dir")+"\\images\\textinput.PNG")); 
		Screen src= new Screen();
		src.type(fileinputtextbox,"test"); 
		Thread.sleep(2000);
		scr.hover(fileinputtextbox);		
		Region r = scr.find(fileinputtextbox).above(20); 

		String read = r.text();
		System.out.println("This is text"+read);


	}



}
