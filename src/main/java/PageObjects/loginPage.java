package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	
	By name = By.name("uid");
	By password = By.name("password");
	By login = By.name("btnLogin");
	By title = By.xpath("//td[contains(text(),'Manger Id : mngr291141')]");
	
	
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement loginTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getUserName()
	{
	return driver.findElement(name);

	}

	public WebElement  getpassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement login()
	{
	return driver.findElement(login);
	
	}
	
	public String getTitle()
	{
		return driver.getTitle();
		
	}
}
