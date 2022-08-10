package org.selinume;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver you =new ChromeDriver();
		
	    you.get("https://www.youtube.com/");
	    
	    String t = you.getTitle();
	    System.out.println(t);
	    
	    you.manage().window().maximize();
		
	    String s = you.getCurrentUrl();
	    System.out.println(s);
	    
	    you.navigate().refresh();
	    
	    you.close();
	}

}
