package com.AdactinStepDef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import com.BaseClassAdactin.BaseClassAd;
import com.Runner.AdactinRunner;
import com.adacatinhotel.AdacatinHotel;
import com.adacatinhotelproperty.ConfigurationHelper;
import com.adactin.pom.Sdp;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDef extends BaseClassAd {
	public WebDriver i = AdactinRunner.i;
	Sdp adactin = new Sdp(i);

	@Given("user Get The Url")
	public void user_get_the_url() throws IOException {
		// i.get("http://adactinhotelapp.com/");
		// currentUrl(i, "http://adactinhotelapp.com/");
		String url = ConfigurationHelper.getInstance().getUrl();
		currentUrl(url);
	}

	@When("user Enter The UserDetails")
	public void user_enter_the_user_details() throws IOException {
		// WebElement username = i.findElement(By.xpath("//input[@name='username']"));
		// String user = AdacatinHotel.allData("AdacatinHotel", 0, 0);
		// .sendKeys("Harish11123");
		// sendKeys(username, "Harish11123");
		WebElement username = adactin.getLogin().getUsername();// --> pom class
		//sendKeys(username, "Harish11123");
		// sendKeys(username,user);
		String sheet = ConfigurationHelper.getInstance().getSheet();
		String user = AdacatinHotel.allData(sheet, 0, 0);
		sendKeys(username, user);

		// WebElement password = i.findElement(By.xpath("//input[@type='password']"));
		WebElement password = adactin.getLogin().getPassword();
		//sendKeys(password, "Harish@123");// ----> pom class
		// .sendKeys("Harish@123");
		// sendKeys(password, "Harish@123");
		// String allData = AdacatinHotel.allData("AdacatinHotel", 1, 0);
		// sendKeys(password, allData);
		String allData = AdacatinHotel.allData(sheet, 1, 0);
		sendKeys(password, allData);

		// WebElement submit = i.findElement(By.xpath("//input[@type='Submit']"));
		WebElement submit = adactin.getLogin().getSubmit();// -->pomclass
		// .click();
		click(submit);

	}

	@When("user Fill The Booking Details")
	public void user_fill_the_booking_details() throws InterruptedException, IOException {
		Thread.sleep(1000);
		implictwait();
		//WebElement Location = i.findElement(By.xpath("//select[@name='location']"));
		WebElement location = adactin.getSearch().getLocation();//--> pom class
//		String allData = AdacatinHotel.allData("AdacatinHotel", 2, 0);
//		Select n = new Select(Location);
//		n.selectByVisibleText("Sydney");
		// selecttext(Location, allData);
		String sheet = ConfigurationHelper.getInstance().getSheet();
		String allData = AdacatinHotel.allData(sheet, 2, 0);
		selecttext(location, allData);

		Thread.sleep(1000);
		//WebElement Hotels = i.findElement(By.xpath("//select[@name='hotels']"));
		WebElement Hotels = adactin.getSearch().getHotels();//-->pom class
//		String allData2 = AdacatinHotel.allData("AdacatinHotel", 3, 0);
//		Select h = new Select(Hotels);
//		h.selectByValue("Hotel Sunshine");
		// selectvalue(Hotels,"Hotel Sunshine");
		// selectvalue(Hotels, allData2);
		String allData2 = AdacatinHotel.allData(sheet, 3, 0);
		selectvalue(Hotels, allData2);
		Thread.sleep(1000);

		//WebElement RoomType = i.findElement(By.xpath("//select[@name='room_type']"));
		WebElement roomType = adactin.getSearch().getRoomType();
//		String allData3 = AdacatinHotel.allData("AdacatinHotel", 4, 0);
//		Select r = new Select(RoomType);
//		r.selectByIndex(1);
		// selectindex(RoomType,1 );
		// selectvalue(RoomType, allData3);
		
		//String allData3 = AdacatinHotel.allData(sheet, 4, 0);
		//selectvalue(roomType, allData3);
        selecttext(roomType, "Deluxe");
		Thread.sleep(1000);
	//	WebElement numberofroom = i.findElement(By.xpath("//select[@name='room_nos']"));
		WebElement numberofroom = adactin.getSearch().getNumberofroom();
//		String allData4 = AdacatinHotel.allData("AdacatinHotel", 5, 0);
//		Select Y = new Select(numberofroom);
//		Y.selectByValue("3");
		// selectvalue(numberofroom, "3");
		// selectvalue(numberofroom, allData4);
		String allData4 = AdacatinHotel.allData(sheet, 5, 0);
		selectvalue(numberofroom, allData4);

		Thread.sleep(5000);
		//WebElement CheckinDate = i.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement CheckinDate = adactin.getSearch().getCheckinDate();
//		String allData5 = AdacatinHotel.allData("AdacatinHotel", 6, 0);
		// CheckinDate.clear();
		clear(CheckinDate);
		// CheckinDate.sendKeys("1/1/2022");
		// sendKeys(CheckinDate, "1/1/2022");
		// sendKeys(CheckinDate, allData5);
		String allData5 = AdacatinHotel.allData(sheet, 6, 0);
		sendKeys(CheckinDate, allData5);

		Thread.sleep(5000);
		//WebElement CheckoutDate = i.findElement(By.xpath("(//input[@type='text'])[3]"));
		WebElement CheckoutDate = adactin.getSearch().getCheckoutDate();
		// String allData6 = AdacatinHotel.allData("AdacatinHotel", 7, 0);
		// CheckoutDate.clear();
		String allData6 = AdacatinHotel.allData(sheet, 7, 0);
		clear(CheckoutDate);
		// CheckoutDate.sendKeys("7/1/2022");
		// sendKeys(CheckoutDate, "7/1/2022");
		sendKeys(CheckoutDate, allData6);

		Thread.sleep(5000);
		//WebElement Adult = i.findElement(By.xpath("//select[@name='adult_room']"));
		WebElement Adult = adactin.getSearch().getAdult();
//		String allData7 = AdacatinHotel.allData("AdacatinHotel", 8, 0);
//		Select G = new Select(Adult);
//		G.selectByValue("2");
//		selectvalue(Adult, allData7);
		String allData7 = AdacatinHotel.allData(sheet, 8, 0);
		selectvalue(Adult, allData7);

		Thread.sleep(1000);
		//WebElement ChildrenperRoom = i.findElement(By.xpath("//select[@name='child_room']"));
		WebElement ChildrenperRoom = adactin.getSearch().getChildrenperRoom();
//		String allData8 = AdacatinHotel.allData(allData7, 9, 0);
//		Select f = new Select(ChildrenperRoom);
//		f.selectByValue("1");
//		selectvalue(ChildrenperRoom, "1");
//		selectvalue(ChildrenperRoom, allData8);
		String allData8 = AdacatinHotel.allData(sheet, 9, 0);
		selectvalue(ChildrenperRoom, allData8);

		Thread.sleep(1000);
		//WebElement submit2 = i.findElement(By.xpath("//input[@type='submit']"));
		WebElement submit2 = adactin.getSearch().getSubmit2();
		// .click();
		click(submit2);
		Thread.sleep(3000);

		//WebElement radio = i.findElement(By.xpath("//input[@name='radiobutton_0']"));
		WebElement radio = adactin.getSelect().getRadio();
		// .click();
		click(radio);
		Thread.sleep(3000);
		//WebElement submit1 = i.findElement(By.xpath("//input[@type=\"submit\"]"));
		WebElement submit1 = adactin.getSelect().getSubmit1();
		// .click();
		click(submit1);
		Thread.sleep(5000);
	}

	@Then("user Verification Inputs")
	public void user_verification_inputs() throws InterruptedException, IOException {
		//WebElement firstName = i.findElement(By.xpath("//input[@name='first_name']"));
		WebElement firstName = adactin.getBook().getFirstName();
		// String allData = AdacatinHotel.allData("AdacatinHotel", 10, 0);
		// .sendKeys("Harish");
		// sendKeys(firstName, "Harish");
		// sendKeys(firstName, allData);
		String sheet = ConfigurationHelper.getInstance().getSheet();
		String allData = AdacatinHotel.allData(sheet, 10, 0);
		sendKeys(firstName, allData);

		//WebElement lastName = i.findElement(By.xpath("//input[@name='last_name']"));
		WebElement lastName = adactin.getBook().getLastName();
		// String allData2 = AdacatinHotel.allData("AdacatinHotel", 11, 0);
		// .sendKeys("R");
		// sendKeys(lastName, "R");
		// sendKeys(lastName, allData2);
		String allData2 = AdacatinHotel.allData(sheet, 11, 0);
		sendKeys(lastName, allData2);

		//WebElement address = i.findElement(By.xpath("//textarea[@name='address']"));
		WebElement address = adactin.getBook().getAddress();
		// String allData3 = AdacatinHotel.allData("AdacatinHotel", 12, 0);
		// .sendKeys("chennai");
		// sendKeys(address, "chennai");
		// sendKeys(address, allData3);
		String allData3 = AdacatinHotel.allData(sheet, 12, 0);
		sendKeys(address, allData3);

		//WebElement text = i.findElement(By.xpath("(//input[@type='text'])[13]"));
		WebElement text = adactin.getBook().getText();
		// String allData4 = AdacatinHotel.allData("AdacatinHotel", 13, 0);
		// .sendKeys("9876667777422345");
		// sendKeys(text, "9876667777422345");
		// sendKeys(text, allData4);
		String allData4 = AdacatinHotel.allData(sheet, 13, 0);
		sendKeys(text, allData4);
		Thread.sleep(2000);

		//WebElement CardType = i.findElement(By.xpath("//select[@class='select_combobox']"));
		WebElement CardType = adactin.getBook().getCardType();
//		String allData5 = AdacatinHotel.allData("AdacatinHotel", 14, 0);
//		Select o = new Select(CardType);
//		o.selectByVisibleText("VISA");
//		selecttext(CardType, "VISA");
//		selecttext(CardType, allData5);
		String allData5 = AdacatinHotel.allData(sheet, 14, 0);
		selecttext(CardType, allData5);

		Thread.sleep(2000);
		//WebElement date = i.findElement(By.xpath("//select[@name='cc_exp_month']"));
		WebElement date = adactin.getBook().getDate();
//		String allData6 = AdacatinHotel.allData("AdacatinHotel", 15, 0);
//		Select v = new Select(date);
//		v.selectByVisibleText("October");
		// selecttext(date, "October");
		// selecttext(date, allData6);
		String allData6 = AdacatinHotel.allData(sheet, 15, 0);
		selecttext(date, allData6);

		Thread.sleep(2000);

		//WebElement year = i.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
		WebElement year = adactin.getBook().getYear();
//		String allData7 = AdacatinHotel.allData("AdacatinHotel", 16, 0);
//		Select b = new Select(year);
//		b.selectByValue("2022");
//		selectvalue(year,"2022" );
//		selectvalue(year, allData7);
		String allData7 = AdacatinHotel.allData(sheet, 16, 0);
		selectvalue(year, allData7);
		Thread.sleep(2000);

		//WebElement cvv = i.findElement(By.xpath("//input[@name='cc_cvv']"));
		WebElement cvv = adactin.getBook().getCvv();
		// String allData8 = AdacatinHotel.allData("AdacatinHotel", 17, 0);
		// .sendKeys("311");
		// sendKeys(cvv, "311");
		// sendKeys(cvv, allData8);
		String allData8 = AdacatinHotel.allData(sheet, 17, 0);
		sendKeys(cvv, allData8);
		Thread.sleep(4000);
		//WebElement button = i.findElement(By.xpath("//input[@type='button']"));
		WebElement button = adactin.getBook().getButton();
		// .click();
		click(button);
		Thread.sleep(8000);
		//WebElement button2 = i.findElement(By.xpath("(//input[@type='button'])[2]"));
		WebElement button2 = adactin.getConformation().getButton2();
		// .click();
		click(button2);
		Thread.sleep(6000);
		//WebElement checkBox = i.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		WebElement checkBox = adactin.getConformation().getCheckBox();
		// .click();
		click(checkBox);
	}

	@Then("user Take The Screenshot")
	public void user_take_the_screenshot() throws InterruptedException, IOException {
		Thread.sleep(4000);
//		TakesScreenshot t = (TakesScreenshot) i;
//		File s1 = t.getScreenshotAs(OutputType.FILE);
//		File s2 = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot\\adactinhotel.png");
//		FileUtils.copyFile(s1, s2);
		screenshot("adactin");
		Thread.sleep(4000);

		//WebElement cancel = i.findElement(By.xpath("//input[@name='cancelall']"));
		WebElement cancel = adactin.getConformation().getCancel();
		// .click();
		click(cancel);
		Thread.sleep(4000);
		// i.switchTo().alert().accept();
		alert();
		Thread.sleep(4000);
//		
		screenshot("adactin1");
		Thread.sleep(4000);
	}

	@Then("user Log Out")
	public void user_log_out() {
		//WebElement logOut = i.findElement(By.xpath("//input[@id='logout']"));
		WebElement logOut = adactin.getConformation().getLogOut();
		// .click();
		
		click(logOut);

	}

}
