package com.webdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermethod {
//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver p = new ChromeDriver();
//		p.get("https://www.facebook.com/");

	static WebDriver p;

	public static void webd() {
		WebDriverManager.chromedriver().setup();
		p = new ChromeDriver();

	}

	public static void web() throws Throwable {
		p.get("https://www.facebook.com/");
		p.findElement(By.name("email")).sendKeys("harish");
		
	}
	
	public static void rr() throws InterruptedException {
	Thread.sleep(3000);
		p.findElement(By.name("password")).sendKeys("harish123");

	}
	public static void main(String[] args) throws Throwable {
		webd();
		web();
		rr();
	}

}
