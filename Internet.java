package org.selinume;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.IEDriverServer", ".\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
	}

}
