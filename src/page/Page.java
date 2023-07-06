package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
	public Page(WebDriver driver)
	{
		this.driver=driver;

	}
	WebDriver driver;
	By myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	By register=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By fname = By.xpath("//*[@id=\"input-firstname\"]");
	By lname = By.xpath("//*[@id=\"input-lastname\"]");
	By id = By.xpath("//*[@id=\"input-email\"]");
	By tele = By.xpath("//*[@id=\"input-telephone\"]");
	By pass1 = By.xpath("//*[@id=\"input-password\"]");
	By pass2 = By.xpath("//*[@id=\"input-confirm\"]");
	By check = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By contin = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By contin1 = By.xpath("//*[@id=\"content\"]/div/div/a");
	public void click()
	{
		
		driver.findElement(myaccount).click();
	}
	public void click1()
	{
		
		driver.findElement(register).click();
	}
	public  void name(String firstname,String lastname)
	{
		driver.findElement(fname).sendKeys(firstname);
		driver.findElement(lname).sendKeys(lastname);
	}
	public  void email(String email)
	{
		driver.findElement(id).sendKeys(email);
	
	}
	public void telephone(String number)
	{
		
		driver.findElement(tele).sendKeys(number);
	}
	public  void password(String password1,String password2)
	{
		driver.findElement(pass1).sendKeys(password1);
		driver.findElement(pass2).sendKeys(password2);
	}
	public void checkbox()
	{
		
        	driver.findElement(check).click(); 
        

	}
	public void cont()
	{
		
        	driver.findElement(contin).click(); 
        

	}
	public void cont1()
	{
		
        	driver.findElement(contin1).click(); 
        

	}
	
	

}

