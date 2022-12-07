package com.AdaTestNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AdactinTestNG {
	public WebDriver i=null;
	
	@Test(priority = -1)
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "/Users/r.harish/eclipse-workspace/Selinum/chromedriver");
	    i = new ChromeDriver();
		i.manage().window().maximize();	
	}
	@Test(dependsOnMethods = "browserLaunch")
public void url() {
	i.get("http://adactinhotelapp.com/");	
	}
	
	@Test(dependsOnMethods = "url")
public void userDetails() throws InterruptedException {
 i.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	i.findElement(By.xpath("//input[@name='username']")).sendKeys("Harish11123");
	i.findElement(By.xpath("//input[@type='password']")).sendKeys("Harish@123");
	i.findElement(By.xpath("//input[@type='Submit']")).click();

	Thread.sleep(1000);
	WebElement Location = i.findElement(By.xpath("//select[@name='location']"));
	Select n = new Select(Location);
	n.selectByVisibleText("Sydney");
	Thread.sleep(1000);
	WebElement Hotels = i.findElement(By.xpath("//select[@name='hotels']"));
	Select h = new Select(Hotels);
	h.selectByValue("Hotel Sunshine");
	Thread.sleep(1000);

	WebElement RoomType = i.findElement(By.xpath("//select[@name='room_type']"));
	Select r = new Select(RoomType);
	r.selectByIndex(1);
	Thread.sleep(1000);
	WebElement numberofroom = i.findElement(By.xpath("//select[@name='room_nos']"));
	Select Y = new Select(numberofroom);
	Y.selectByValue("3");

	Thread.sleep(5000);
	WebElement CheckinDate = i.findElement(By.xpath("(//input[@type='text'])[2]"));
	CheckinDate.clear();
	CheckinDate.sendKeys("1/1/2022");
	
	Thread.sleep(5000);
	WebElement CheckoutDate = i.findElement(By.xpath("(//input[@type='text'])[3]"));
	CheckoutDate.clear();
	CheckoutDate.sendKeys("7/1/2022");
	
	Thread.sleep(5000);
	WebElement Adult = i.findElement(By.xpath("//select[@name='adult_room']"));
	Select G = new Select(Adult);
	G.selectByValue("2");
	Thread.sleep(1000);
	WebElement ChildrenperRoom = i.findElement(By.xpath("//select[@name='child_room']"));
	Select f = new Select(ChildrenperRoom);
	f.selectByValue("1");
	Thread.sleep(1000);
	i.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	i.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	Thread.sleep(3000);
	i.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(5000);	
}
	@Test(priority = 0, timeOut = 15000)
public void personalDetials() throws InterruptedException {
	i.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Harish");
	i.findElement(By.xpath("//input[@name='last_name']")).sendKeys("R");
	i.findElement(By.xpath("//textarea[@name='address']")).sendKeys("chennai");
	i.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("9876667777422345");
	Thread.sleep(2000);

	WebElement CardType = i.findElement(By.xpath("//select[@class='select_combobox']"));
	Select o = new Select(CardType);
	o.selectByVisibleText("VISA");
	Thread.sleep(2000);
	WebElement date = i.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select v = new Select(date);
	v.selectByVisibleText("October");

	Thread.sleep(2000);

	WebElement year = i.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
	Select b = new Select(year);
	b.selectByValue("2022");
	Thread.sleep(2000);

	i.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("311");
	Thread.sleep(4000);	
}
	@Test(dependsOnMethods ="personalDetials" )
public void buttons() throws InterruptedException {
    i.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	i.findElement(By.xpath("//input[@type='button']")).click();
	Thread.sleep(8000);
	i.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	Thread.sleep(6000);
	i.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
}
	@Test@Ignore
public void takesScreenshot() throws InterruptedException, IOException {
	Thread.sleep(4000);
	TakesScreenshot t = (TakesScreenshot) i;
	File s1 = t.getScreenshotAs(OutputType.FILE);
	File s2 = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot\\adactinhotel.png");
	FileUtils.copyFile(s1, s2);
	Thread.sleep(4000);

	
}
	@Test(priority = 1)
public void alert() throws InterruptedException {
		i.findElement(By.xpath("//input[@name='cancelall']")).click();
		Thread.sleep(4000);
	i.switchTo().alert().accept();
}
@Test(priority = 2)
public void logOut() throws InterruptedException, IOException {
	Thread.sleep(4000);
	TakesScreenshot t1 = (TakesScreenshot) i;
	File s12 = t1.getScreenshotAs(OutputType.FILE);
	File s21 = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot\\1adactinhotel.png");
	FileUtils.copyFile(s12, s21);
	Thread.sleep(4000);

	i.findElement(By.xpath("//input[@id='logout']")).click();
	Thread.sleep(4000);
}
	
	
	

}
