package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead 
{

	public static void main(String[] args) throws InterruptedException
{		// TODO Auto-generated method stub
		
		// Selenium code to open the web browser automatically
				//
		       WebDriverManager.chromedriver().setup();
		       //
		       ChromeDriver driver = new ChromeDriver();
		       //load the url
		      driver.get("http://leaftaps.com/opentaps/control/login");
		       //driver.get("http://www.google.com");
		       
		       //maximize the browser window
		       driver.manage().window().maximize();
		       
		       //Identify the WebElement
		  //   WebElement eleUserName=driver.findElement(By.id("username"));
		       //Enter the username
		    // eleUserName.sendKeys("DemoSalesManager");
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
		  
		       //Create province object
		      Thread.sleep(2000);
		       Select province = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		       //select state/province as Newyork using visible text
		      province.selectByVisibleText("New York");
		       Thread.sleep(2000);
		       //to click on create lead button
		       driver.findElement(By.name("submitButton")).click();
		       
		       driver.findElement(By.linkText("Edit")).click();
		       driver.findElement(By.name("description")).clear();		       
		       Thread.sleep(3000);
		       driver.findElement(By.id("updateLeadForm_description")).sendKeys("Filling ImportantNote with Data");
		       
		       //Click on update button
		       driver.findElement(By.className("smallSubmit")).click();
		       
		      // String firstName = driver.findElement(By.id("createLeadForm_firstName")).getText();
		       //System.out.println(firstName);
		       System.out.println("Title of the resulting page:" +driver.getTitle());
		       	
		
	}

}
