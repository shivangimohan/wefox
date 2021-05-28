package com.wefox.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
	
	public WebDriver driver;
	
	By payOnArrivalButton = By.xpath("");
	By paymentNotDoneMessage = By.xpath("");
	By bookingStatusReservedMessage = By.xpath("");
	
	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getPayOnArrivalButton() {
		return driver.findElement(payOnArrivalButton);
	}
	
	public WebElement getPaymentNotDoneMessage() {
		return driver.findElement(paymentNotDoneMessage);
	}
	
	public WebElement getBookingStatusReservedMessage() {
		return driver.findElement(bookingStatusReservedMessage);
	}

}
