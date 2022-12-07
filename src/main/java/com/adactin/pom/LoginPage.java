package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver = null;
	@FindBy(xpath = "//input[@name='username']")	
	private WebElement username;

	@FindBy(xpath = "//input[@type='password']")	
	private WebElement password ;

	@FindBy(xpath = "//input[@type='Submit']")	
	private WebElement submit ;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
