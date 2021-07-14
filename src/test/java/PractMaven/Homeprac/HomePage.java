package PractMaven.Homeprac;

import java.io.IOException;

//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.loginPage;

public class HomePage extends base{
	
	@Test(dataProvider = "getData")
	public void initialize(String username, String password) throws IOException
	
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		//driver.get("http://www.demo.guru99.com/V4/");
	
	loginPage lp = new loginPage(driver);
	/*lp.getUserName().sendKeys("mngr291141");
	lp.getpassword().sendKeys("zEzevus");
	*/
	/*lp.getUserName().sendKeys(prop.getProperty("username"));
	lp.getpassword().sendKeys(prop.getProperty("password"));*/
	
	lp.getUserName().sendKeys(username);
	lp.getpassword().sendKeys(password);
	
System.out.println(lp.getTitle());
lp.login().click();
//Assert.assertEquals(lp.loginTitle().getText(),"Manger Id : mngr291141");
	
	
	}
	
	@DataProvider
	public Object[][] getData()
	
	{
		Object[][] data = new Object[4][2];
		
		data[0][0] = "mngr291141";
		data[0][1] = "zEzevus";
		
		data[1][0] = "rwete";
		data[1][1] = "zEzevus";
		
		data[2][0] = "mngr291141";
		data[2][1] = "43ttger";
		
		data [3][0] = "geuiue";
		data[3][1] = "14e23";
		
		return data;
		
	}
	
	
	
	
	
	
	}
	









