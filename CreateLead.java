package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		// Selenium code to open the web browser automatically
				//
		       WebDriverManager.chromedriver().setup();
		       //
		       ChromeDriver driver = new ChromeDriver();
		       //load the url
		      driver.get("http://leaftaps.com/opentaps/control/main");
		       //driver.get("http://www.google.com");
		       
		       //maximize the browser window
		       driver.manage().window().maximize();
		       
		       //Identify the WebElement
		      // WebElement eleUserName=driver.findElement(By.id("username"));
		       //Enter the username
		      //eleUserName.sendKeys("DemoSalesManager");
		       driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		       driver.findElement(By.id("password")).sendKeys("crmsfa");
		       driver.findElement(By.className("decorativeSubmit")).click();
		       driver.findElement(By.linkText("CRM/SFA")).click();
		       driver.findElement(By.linkText("Leads")).click();
		       driver.findElement(By.linkText("Create Lead")).click();
		       
		       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujatha");
		       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		       driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suja");
		       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		       driver.findElement(By.name("description")).sendKeys("Create Lead form");
		       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Sujatha.s@gmail.com");
		  
		      //Thread.sleep(5000);
		       //WebElement ele = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		       //Create province object
		     //Select province = new Select(ele);
		       //select state/province as Newyork using visible text
		    // province.selectByVisibleText("Canada");
		       //Thread.sleep(2000);
		       //to click on create lead button
		       driver.findElement(By.name("submitButton")).click();
		       
		     // String firstName = driver.findElement(By.id("createLeadForm_firstName")).getText();
		      		      // System.out.println(firstName);
		       
		       System.out.println("Title of the resulting page:" +driver.getTitle());
		       
	}

}
