package sikuli;

import org.sikuli.script.App;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class closeapp {

	
	public static void main(String[] args) throws InterruptedException {
		
		Screen scr=new Screen();	
		App.open("C:\\Windows\\System32\\calc.exe");
		//App.focus("C:\\Windows\\System32\\calc.exe");
		App.close("Calculator");
		
	
		
	}






}
