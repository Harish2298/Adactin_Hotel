package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	public WebDriver driver = null;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")	
	private WebElement lastName ;

	@FindBy(xpath = "//textarea[@name='address']")	
	private WebElement address ;

	@FindBy(xpath = "(//input[@type='text'])[13]")	
	private WebElement  text;

	@FindBy(xpath = "//select[@class='select_combobox']")	
	private WebElement CardType ;

	@FindBy(xpath = "//select[@name='cc_exp_month']")	
	private WebElement date ;

	@FindBy(xpath = "(//select[@class='select_combobox2'])[2]")	
	private WebElement year ;

	@FindBy(xpath = "//input[@name='cc_cvv']")	
	private WebElement cvv ;

	@FindBy(xpath = "//input[@type='button']")	
	private WebElement button;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getButton() {
		return button;

	}
	
	public BookingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
