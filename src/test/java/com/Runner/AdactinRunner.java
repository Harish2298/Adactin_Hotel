package com.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClassAdactin.BaseClassAd;
import com.adacatinhotelproperty.ConfigurationHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/r.harish/eclipse-workspace/Adacatin_Hotel/src/test/java/com/feature/adactin.feature",
glue = "com.AdactinStepDef",monochrome=true, plugin= {"pretty",
		"html:Report/htmlReport.html",
		"json:Report/jsonreport.json",
		"junit:Report/junitReport.xml",
		//"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
		})
public class AdactinRunner extends BaseClassAd {
	public static WebDriver i = null;
@BeforeClass
	public static void setUp() throws IOException {
//		System.setProperty("webdriver.chrome.driver", "/Users/r.harish/eclipse-workspace/Selinum/chromedriver");
//		i = new ChromeDriver();
//		i.manage().window().maximize();
       String browser = ConfigurationHelper.getInstance().getBrowser();
       i=browserLaunch(browser);
	 
	// return i;
	}
@AfterClass
	public static void tearDown() {
		//i.close();
	   close();
	}

} 
