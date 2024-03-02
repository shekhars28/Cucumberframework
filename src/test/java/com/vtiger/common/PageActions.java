package com.vtiger.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	public WebDriver driver;
	public WebDriverWait wait;
	public PageActions(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
	}
	public void Inputtext(WebElement elm, String value) {
		try {
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.clear();
			elm.sendKeys(value);
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}}
	public void clickelm(WebElement elm) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elm));
			elm.click();
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}}
		public void elmexist(WebElement elm) {
			try {
				wait.until(ExpectedConditions.visibilityOf(elm));
				elm.isDisplayed();
				
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			
		
	}
	
	
}
