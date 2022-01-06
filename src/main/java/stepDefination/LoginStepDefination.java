package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("User is already on Login Page$")
	
	public void User_is_already_on_Login_Page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^title of the login page is Free CRM$")
	public void title_of_the_login_page_is_Free_CRM() {
		String title=driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals("Facebook", title);
		
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("utkarshtrehan17@gmail.com");;
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mastmagan");;
	   
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginbutton);
	  
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		
		String tittles=driver.getTitle();
		System.out.println(tittles);
		//Assert.assertEquals("Facebook – log in or sign up", tittles);
	    
	}


}
