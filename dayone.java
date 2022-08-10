package org.selinume;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class dayone {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//to browser launch------get(url);
		driver. get("https://www.facebook.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		//to get title -----gettitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get curent url----getcurrenturl();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//navigation commands back(),forward(),refresh()
		driver.navigate().refresh();
		
		driver.close();
	}

}
