package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefination {
	private WebDriver driver;
	public LoginPage lp;
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.get("http://localhost:100/");
	    driver.manage().window().maximize();
	    lp=new LoginPage(driver);
	}
	@When("user enters valid user-id and password")
	public void user_enters_valid_user_id_and_password() {
		lp.setuserid("admin");
		lp.setpassword("admin");
	    //driver.findElement(By.name("user_name")).sendKeys("admin");
	    //driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	@When("click on login button")
	public void click_on_login_button() {
		//driver.findElement(By.name("Login")).click();
		lp.clicklogin();
	}
	@Then("user should be navigated to Home Page")
	public void user_should_be_navigated_to_home_page() {
	   driver.findElement(By.linkText("Home")).isDisplayed();
	}
	
	@When("user enters invalid user-id and password")
	public void user_enters_invalid_user_id_and_password() {
		lp.setuserid("admin123");
		lp.setpassword("admin123");
	    //driver.findElement(By.name("user_name")).sendKeys("admin");
	    //driver.findElement(By.name("user_password")).sendKeys("admin");
		lp.clicklogin();
	}
	@Then("user should get error message")
	public void user_should_get_error_message() {
		lp.verify_error_msg();
		
	    //driver.findElement(By.linkText("Logout")).isDisplayed();
	}
	
	@Then("logout link should be appear on home page")
	public void logout_link_should_be_appear_on_home_page() {
	    driver.findElement(By.linkText("Logout")).isDisplayed();
	}
	@And("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		driver.findElement(By.linkText("Logout")).click();
	}
	@Then("user tear down")
	public void user_tear_down() {
		driver.close();
	}
	@When("user user enters invalid userid as {string} and invalid password as {string}")
	public void user_user_enters_invalid_userid_as_and_invalid_password_as(String userid, String pwd) {
//		driver.findElement(By.name("user_name")).clear();
//		driver.findElement(By.name("user_name")).sendKeys(userid);
//		driver.findElement(By.name("user_password")).clear();
//		driver.findElement(By.name("user_password")).sendKeys(pwd);
		lp.setuserid(userid);
		lp.setpassword(pwd);
	}
	



}
