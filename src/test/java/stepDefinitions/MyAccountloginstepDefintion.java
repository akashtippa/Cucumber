package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyAccountloginstepDefintion {

	public WebDriver driver=null;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    System.setProperty("webdriver.gecko.driver", "C://JavaFrame//Cucumber//Drivers//geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
	    driver.get(url);
	}

	@And("^click on my Account Menu$")
	public void click_on_my_Account_Menu() throws Throwable {
	    driver.findElement(By.linkText("My Account")).click();
	}

//	@And("^Enter registered username and passsword$")
//	public void enter_registered_username_and_passsword() throws Throwable {
//	    driver.findElement(By.id("username")).sendKeys("akashtippa@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("Akashtippa@123 ");
//	}
	
//	@When("^Enter registered username \"([^\"]*)\" and passsword \"([^\"]*)\"$")
//	public void enter_registered_username_and_passsword(String user, String pwd) throws Throwable {
//		driver.findElement(By.id("username")).sendKeys(user);
//	    driver.findElement(By.id("password")).sendKeys(pwd);
//	}
	//LOGIN WITH DATA TABLE METHOD
//	@When("^Enter registered username and password$")
//	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
//		List <List <String>> data=credentials.raw();
//		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
//	    driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
//	    
//	}
	//LOGIN WITH DATA TABLE METHOD WITH HEADER
	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
		List<Map<String,String>> data=credentials.asMaps(String.class, String.class);
		driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
	    driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
	}

	

	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
	}

	
	@Then("^user must successfully login and logout to the webpage$")
	public void user_must_successfully_login_to_the_webpage() throws Throwable {
		Thread.sleep(2000);
	   String capText = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
	   Assert.assertEquals(true,capText.contains("akashtippa"));
	   driver.findElement(By.linkText("Sign out")).click();
	   driver.quit();
	}
	@Then("^Verify login$")
	public void verify_login() throws Throwable {
	    
		String Error = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong")).getText();
		if(Error.contains("Error"))
		{
			Assert.assertTrue("Invlaid input - Error page",true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
