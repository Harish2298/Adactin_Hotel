package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom {
	public WebDriver i= null;
	
	
@FindBy(xpath = "//input[@name='username']")	
private WebElement username;

@FindBy(xpath = "//input[@type='password']")	
private WebElement password ;

@FindBy(xpath = "//input[@type='Submit']")	
private WebElement submit ;

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

@FindBy(xpath = "//input[@name='radiobutton_0']")	
private WebElement radio ;


@FindBy(xpath = "//input[@type=\"submit\"]")	
private WebElement submit1 ;

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

@FindBy(xpath = "(//input[@type='button'])[2]")	
private WebElement button2 ;

@FindBy(xpath = "(//input[@type='checkbox'])[2]")	
private WebElement checkBox ;

@FindBy(xpath = "//input[@name='cancelall']")
private WebElement cancel ;

@FindBy(xpath="//input[@id='logout']")
private WebElement logOut;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSubmit() {
	return submit;
}

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

public WebElement getRadio() {
	return radio;
}

public WebElement getSubmit1() {
	return submit1;
}

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
 public AdactinPom(WebDriver i){
	 this.i=i;
	 PageFactory.initElements(i, this);
 }



}
