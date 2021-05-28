package com.wefox.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wefox.pageObjects.HomePage;
import com.wefox.pageObjects.LoginPage;


public class BaseHelper {
	
	public static void login(WebDriver driver, String email, String password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(email);
		loginPage.getPassword().sendKeys(password);
		loginPage.getLogin().click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("My Account"));
	}
	
	public static void navigateToHome(WebDriver driver) {
		HomePage homePage = new HomePage(driver);
		homePage.getHome().click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("PHPTRAVELS | Travel Technology Partner"));
	}
	
	public static void selectHotel(WebDriver driver) {
		HomePage homePage = new HomePage(driver);
		homePage.getBookNowLink().click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(homePage.getBookNowButton()));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", homePage.getSelectRoom());
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",homePage.getSelectRoom());
		homePage.getBookNowButton().click();
	}

}
