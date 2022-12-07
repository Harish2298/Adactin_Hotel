package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {
	public WebDriver driver = null;
	public LoginPage lp;
	public SearchPage sp;
	public SelectPage se;
	public BookingPage BP;
	public ConformationPage cp;
	
	public LoginPage getLogin() {
		if(lp==null) {
			lp=new LoginPage(driver);
		}return lp;
	}
	
	public SearchPage getSearch() {
		if(sp==null) {
			sp=new SearchPage(driver);
		}return sp;
	}
	
	public SelectPage getSelect() {
		if(se==null) {
			se=new SelectPage(driver);
		}return se;
	}
	public BookingPage getBook() {
		if(BP==null) {
			BP = new BookingPage(driver); 
		}return BP;
	}
	 public ConformationPage getConformation() {
		 if(cp==null) {
			 cp= new ConformationPage(driver);
		 }return  cp;
	 }
	
	public Sdp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
