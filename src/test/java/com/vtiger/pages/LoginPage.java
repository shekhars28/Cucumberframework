package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.PageActions;


public class LoginPage extends PageActions {

	//private WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	WebElement tb_username;
	
	@FindBy(name="user_password")
	WebElement tb_password;
	
	@FindBy(name="Login")
	WebElement btn_login;
	
	@FindBy(xpath="//*[contains(text(),'You must specify a valid username and password.')]")
	WebElement txt_errormsg;
	public void login(String userid, String pwd)
	{
		//tb_username.sendKeys("userid");
		//Inputtext(tb_username, userid);
		//tb_password.sendKeys(pwd);
		//Inputtext(tb_password, pwd);
		//btn_login.click();
		//clickelm(btn_login);
	}
	public void setuserid(String userid) {
		Inputtext(tb_username, userid);
	}
	public void setpassword(String userid) {
		Inputtext(tb_password, userid);
	}
	public void clicklogin() {
		clickelm(btn_login);
	}
	public void verify_error_msg() {
		txt_errormsg.isDisplayed();
	}
	
}
