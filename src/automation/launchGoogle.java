package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\CTS chennai selenium setup files\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		

	}

}
