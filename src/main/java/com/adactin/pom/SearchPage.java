package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public WebDriver driver=null;
	@FindBy(xpath = "//select[@name='location']")	
	private WebElement Location;

	@FindBy(xpath = "//select[@name='hotels']")	
	private WebElement Hotels;

	@FindBy(xpath = "//select[@name='room_type']")	
	private WebElement RoomType;


	@FindBy(xpath = "//select[@name='room_nos']")	
	private WebElement numberofroom ;

	@FindBy(xpath = "(//input[@type='text'])[2]")	
	private WebElement checkinDate ;

	@FindBy(xpath = "(//input[@type='text'])[3]")	
	private WebElement checkoutDate;

	@FindBy(xpath = "//select[@name='adult_room']")	
	private WebElement Adult;

	@FindBy(xpath = "//select[@name='child_room']")	
	private WebElement ChildrenperRoom ;

	@FindBy(xpath = "//input[@type='submit']")	
	private WebElement submit2 ;
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNumberofroom() {
		return numberofroom;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getChildrenperRoom() {
		return ChildrenperRoom;
	}

	public WebElement getSubmit2() {
		return submit2;
	}
	
	public SearchPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
