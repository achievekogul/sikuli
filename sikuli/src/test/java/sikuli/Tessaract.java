package sikuli;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Tessaract {
public static void main(String[] args) throws TesseractException {
	
	
	
    Tesseract tesseract = new Tesseract(); 
    tesseract.setDatapath("C:\\Users\\user\\eclipse-workspace\\sikuli\\tessdata"); 
    
    String text = tesseract.doOCR(new File("C:\\Users\\user\\Desktop\\local.png")); 
    System.out.print(text); 
    
    
}
}
