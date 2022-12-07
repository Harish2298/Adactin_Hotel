package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {
	public WebDriver driver=null; 

	@FindBy(xpath = "//input[@name='radiobutton_0']")	
	private WebElement radio ;


	@FindBy(xpath = "//input[@type=\"submit\"]")	
	private WebElement submit1 ;
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSubmit1() {
		return submit1;
	}
	
	public SelectPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
