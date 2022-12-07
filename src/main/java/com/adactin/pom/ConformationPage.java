package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformationPage {
public WebDriver driver= null;
	@FindBy(xpath = "(//input[@type='button'])[2]")	
	private WebElement button2 ;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")	
	private WebElement checkBox ;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancel ;

	@FindBy(xpath="//input[@id='logout']")
	private WebElement logOut;
	
	public WebElement getButton2() {
		return button2;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	
	public ConformationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
