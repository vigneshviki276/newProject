package org.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public static WebDriver d;
	
	public static void chromeBrowser(){
		
		WebDriverManager.chromedriver().setup();
		 d= new ChromeDriver();
		
	}

	public static void fireFoxBrowser(){
		WebDriverManager.firefoxdriver().setup();
		d = new FirefoxDriver();

	}
	
	
	
	
	
	
}
