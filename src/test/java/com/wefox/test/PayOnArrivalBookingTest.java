package com.wefox.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wefox.Base.Base;
import com.wefox.helper.PayOnArrivalBookingHelper;


public class PayOnArrivalBookingTest extends Base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void testPayOnArrivalBooking() {
		PayOnArrivalBookingHelper.login(driver, prop.getProperty("email"), prop.getProperty("password"));
		PayOnArrivalBookingHelper.navigateToHome(driver);
		PayOnArrivalBookingHelper.selectHotel(driver);
		Assert.assertEquals(PayOnArrivalBookingHelper.getPaymentNotDoneMessage(driver), "");
		PayOnArrivalBookingHelper.selectPayOnArrival(driver);
		Assert.assertEquals(PayOnArrivalBookingHelper.getBookingStatusReservedMessage(driver), "");
	}
	
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

}
