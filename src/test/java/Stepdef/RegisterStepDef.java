package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import paraBankObjects.ParaObjectPage;

public class RegisterStepDef 
{
	
	WebDriver driver;

    ParaObjectPage ob;
	@Before
	public void initiateDriver()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://parabank.parasoft.com/parabank/login.htm");
	}
	@Given("click on register link")
	public void click_on_register_link()
	{
		ob=new ParaObjectPage(driver);
		ob.register();
	    throw new io.cucumber.java.PendingException();
	}

	@Given("give the deatils required")
	public void give_the_deatils_required() throws InterruptedException 
	{
		ob=new ParaObjectPage(driver);
	    ob.deatails();
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on register")
	public void click_on_register() 
	{
		ob=new ParaObjectPage(driver);
		ob.clickRegBtn();
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("customer should be registered")
	public void customer_should_be_registered() 
	{
		System.out.println("Customer should be created");
		
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Given("provide username")
	public void provide_username() throws InterruptedException
	{
		ob=new ParaObjectPage(driver);
		ob.uname();
		throw new io.cucumber.java.PendingException();
			
	}
	   
	

	@Then("Enter password")
	public void enter_password() 
	{
		ob.pswd();
		throw new io.cucumber.java.PendingException();
		
	}
	   

	@Then("click on login")
	public void click_on_login()
	{
		ob.login();
		throw new io.cucumber.java.PendingException();
	   
	}

	@Then("can able to login")
	public void can_able_to_login() 
	{
		System.out.println("Registered sucessfully");
		throw new io.cucumber.java.PendingException();
	    
	}
	@After
	public void close()
	{
		driver.close();
	}


}
