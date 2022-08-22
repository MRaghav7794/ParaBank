package paraBankObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaObjectPage 
{
	WebDriver driver;
	public ParaObjectPage(WebDriver driver)
	{
		
		this.driver=driver;

}
	By uname=By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
	By pwd=By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
	By login_btn=By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
	By Register=By.xpath("//a[text()='Register']");
	By firstname=By.xpath("//*[@id=\"customer.firstName\"]");
	By Lastname=By.xpath("//*[@id=\"customer.lastName\"]");
	By Address=By.xpath("//*[@id=\"customer.address.street\"]");
	By City=By.xpath("//*[@id=\"customer.address.city\"]");
	By state=By.xpath("//*[@id=\"customer.address.state\"]");
	By zipcode=By.xpath("//*[@id=\"customer.address.zipCode\"]");
	By phno=By.xpath("//*[@id=\"customer.phoneNumber\"]");
	By SSN=By.xpath("//*[@id=\"customer.ssn\"]");
	By username=By.xpath("//*[@id=\"customer.username\"]");
	By password=By.xpath("//*[@id=\"customer.password\"]");
	By confirm_password=By.xpath("//*[@id=\"repeatedPassword\"]");
	By reg_btn=By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
	
	public void register()
	{
		driver.findElement(Register).click();
	}
	public void deatails() throws InterruptedException
	{
		driver.findElement(firstname).sendKeys("Mahan");
		driver.findElement(Lastname).sendKeys("M");
		driver.findElement(Address).sendKeys("DLF, Ramapuram");
		driver.findElement(City).sendKeys("chennai");
		driver.findElement(state).sendKeys("Tamil Nadu");
		driver.findElement(zipcode).sendKeys("600011");
		driver.findElement(phno).sendKeys("9999990999");
		driver.findElement(SSN).sendKeys("123");
		driver.findElement(username).sendKeys("Mahan@123");
		driver.findElement(password).sendKeys("12345");
		driver.findElement(confirm_password).sendKeys("12345");
		Thread.sleep(1000);
		
		
	}
	public void clickRegBtn()
	{
		
		driver.findElement(reg_btn).click();
		
	}
	public void uname() throws InterruptedException
	{
		driver.findElement(uname).sendKeys("Mahan@123");
		Thread.sleep(1000);
		
	}
	public void pswd()
	{
		driver.findElement(pwd).sendKeys("12345");
	}
	public void login()
	{
		driver.findElement(login_btn).click();
	}

}
