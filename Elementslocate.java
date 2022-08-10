package org.selinume;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementslocate {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		ChromeDriver ele = new ChromeDriver();
		ele.get("https://www.facebook.com/");
		ele.manage().window().maximize();
		
		WebElement username = ele.findElement(By.id("email"));
		username.sendKeys("9500807976");
		
		WebElement pass = ele.findElement(By.name("pass"));
		pass.sendKeys("245778756");
		
		WebElement log = ele.findElement(By.name("login"));
		log.click();
		
		WebElement fb = ele.findElement(By.xpath("//div[text()='Log in to Facebook']"));
		String text = fb.getText();
		
		if (text.equals("Log in to Facebook")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		WebElement fpt = ele.findElement(By.xpath("//div[contains(text(),'The password that ')]"));
		String text2 = fpt.getText();
		System.out.println(text2);
		
		String attribute = fpt.getAttribute("class");
		System.out.println(attribute);
		
		String cssValue = fpt.getCssValue("font-size");
		System.out.println(cssValue);
		
		String clr = fpt.getCssValue("color");
		System.out.println(clr);
	}

}
