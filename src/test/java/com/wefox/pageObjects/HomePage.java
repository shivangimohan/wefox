package com.wefox.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By home = By.xpath("//a[@title='home']");
	By bookNowLink = By.xpath("//h2[text()='Featured Hotels']/parent::div/following-sibling::div//div[@class='price']");
	By bookNowButton = By.xpath("//button[contains(text(),'Book Now')]");
	By selectRoom = By.xpath("//label[contains(text(),'Select Room')]");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getHome() {
		return driver.findElement(home);
	}
	
	public WebElement getBookNowLink() {
		return driver.findElement(bookNowLink);
	}
	
	public WebElement getBookNowButton() {
		return driver.findElement(bookNowButton);
	}
	
	public WebElement getSelectRoom() {
		return driver.findElement(selectRoom);
	}

}
