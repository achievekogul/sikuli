package sikuli;

import java.io.File;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Image;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TessaractFinal {

	public static void main(String[] args) throws FindFailed, InterruptedException, TesseractException {
		   Screen s = new Screen();
		// Settings.OcrTextRead=true;
		  // Pattern c = new Pattern("F:\\Jar\\Pics\\Register.PNG");
		 Screen scr= new Screen();
		 
		 Image img = Image.create("F:\\Jar\\Pics\\Register.PNG");
		   Match m = scr.wait(img, 10);

		 String  text = img.text();
		 System.out.println(text);

		  
	}

}
