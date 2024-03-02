package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.PageActions;

public class LeadPage extends PageActions {

	public LeadPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy (linkText = "New Lead")
	WebElement newlead;
	
	@FindBy (name = "lastname")
	WebElement lastname;
	
	@FindBy (name = "company")
	WebElement company;
	
	@FindBy(xpath="//input[ @fdprocessedid='xnr0b']")
	WebElement savebutton;
}

