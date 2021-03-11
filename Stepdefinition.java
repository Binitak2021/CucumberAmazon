package cucumberamazon;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	WebDriver driver;
	@Given("^The user has launched the browser$")
	public void the_user_has_launched_the_browser() throws Throwable {
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		driver=new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}

	@When("^The user navigates to the Amazon website$")
	public void the_user_navigates_to_the_Amazon_website() throws Throwable {
		driver.get("https://www.amazon.com");
	    	}

	@Then("^The user validates if the Amazon website is lauched$")
	public void the_user_validates_if_the_Amazon_website_is_lauched() throws Throwable
	{
	   String title=driver.getTitle();
	   System.out.println("the title of the website is:"+title);
//	   Assert.assertArrayEquals("title>Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", title);
	}



}
