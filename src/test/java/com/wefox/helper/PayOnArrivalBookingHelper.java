package com.wefox.helper;

import org.openqa.selenium.WebDriver;
import com.wefox.pageObjects.PaymentPage;

public class PayOnArrivalBookingHelper extends BaseHelper{

	public static String getPaymentNotDoneMessage(WebDriver driver) {
		PaymentPage paymentPage = new PaymentPage(driver);
		return paymentPage.getPaymentNotDoneMessage().getText();
	}
	
	public static void selectPayOnArrival(WebDriver driver) {
		PaymentPage paymentPage = new PaymentPage(driver);
		paymentPage.getPayOnArrivalButton().click();
		driver.switchTo().alert().accept();
	}
	
	public static String getBookingStatusReservedMessage(WebDriver driver) {
		PaymentPage paymentPage = new PaymentPage(driver);
		return paymentPage.getBookingStatusReservedMessage().getText();
	}
}
