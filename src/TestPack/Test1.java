package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Page;


public class Test1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException
	{ Page id= new Page(driver);
	
	
		id.click();
		id.click1();
		Thread.sleep(4000);
		id.name("Avinash", "Vijayan");
		id.email("avinashpvijayan@gmail.com");
		id.telephone("9645101580");
		Thread.sleep(4000);
		id.password("Avinash@97", "Avinash@97");
		Thread.sleep(4000);
		id.checkbox();
		Thread.sleep(4000);
		id.cont();
		Thread.sleep(4000);
		id.cont1();
	}
}
