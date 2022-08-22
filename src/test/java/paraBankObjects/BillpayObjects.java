package paraBankObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillpayObjects 
{
	WebDriver driver;
	public BillpayObjects(WebDriver driver)
	{
		
		this.driver=driver;
	}
	     By billpay_service=By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a");
	     By Payee_name=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input");
	     By Address=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[2]/td[2]/input");
	     By city=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[3]/td[2]/input");
	     By state=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input");
	     By zipcode=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[5]/td[2]/input");
	     By phn=By.xpath("//*[@id=\"c7d11289-4cc7-4b2e-b737-e6d0a407e05a\"]");
	     By Ac=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[8]/td[2]/input");
	     By Verify_Ac=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[9]/td[2]/input");
	     By Ammount=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[11]/td[2]/input");
	     By sendpayment=By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input");
	     
	     public void click_billpay()
	     {
	    	 driver.findElement(billpay_service).click();
	     }
	     public void enterDetails()
	     {
	    	 driver.findElement(Payee_name).sendKeys("Ramu");
	    	 driver.findElement(Address).sendKeys("DLF");
	    	 driver.findElement(city).sendKeys("chennai");
	    	 driver.findElement(state).sendKeys("Tamil nadu");
	    	 driver.findElement(zipcode).sendKeys("600011");
	    	 driver.findElement(phn).sendKeys("7070707070");
	    	 driver.findElement(Ac).sendKeys("18091");
	    	 driver.findElement(Verify_Ac).sendKeys("18091");
	    	 driver.findElement(Ammount).sendKeys("100");
	    	 
	     }
	     public void clickSendPayment()
	     {
	    	 driver.findElement(sendpayment).click();
	     }
	     
			
}
