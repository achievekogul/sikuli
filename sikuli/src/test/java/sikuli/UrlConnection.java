package sikuli;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlConnection {
	
	public static void main(String[] args) throws FindFailed {
		
		Image image = null;
		try {
		    URL url = new URL("https://i.ibb.co/H75Bm7v/Drag1.png");
		    image = ImageIO.read(url);

		    InputStream in = new BufferedInputStream(url.openStream());
		    ByteArrayOutputStream out = new ByteArrayOutputStream();
		    byte[] buf = new byte[1024];
		    int n = 0;
		    while (-1!=(n=in.read(buf)))
		    {
		       out.write(buf, 0, n);
		    }
		    out.close();
		    in.close();
		    byte[] response = out.toByteArray();

		    FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\sikuli\\images\\drag.png");
		    fos.write(response);
		    fos.close();
		    
		    WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);	
		    
		    Screen src= new Screen();
			// src.find("drag.png");
			 src.wait(response,20);
			 src.drag(response);
		}
		
		catch (IOException e) {
		}
		
		
		
	}

}
