package PractMaven.Homeprac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException
	
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Arisha's AllInOne\\Documents\\Pooja\\Homeprac\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
	
	String browserName =prop.getProperty("browser");
	System.out.println(browserName);
	
	if (browserName.equals ("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arisha's AllInOne\\Documents\\Pooja\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;

	
	}
	
	

	
}
