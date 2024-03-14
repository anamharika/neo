package projecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.excelutility;
import utility.loginpage;
import utility.propertiesfile;

public class objecttolog {
	@Test
	public void emp() throws Throwable {
		propertiesfile p = new propertiesfile();
		excelutility e = new excelutility();
		WebDriver driver = null;
		String url = p.readdata("url");
		String b = p.readdata("browser");
		String n = p.readdata("un");
		String pass = p.readdata("pwd");
		if(b.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			Reporter.log(b+"launched");
		}
		else if (b.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (b.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		else {
			Reporter.log(" invalied user name ");
		}
		driver.get(url);
		loginpage l = new loginpage(driver);
		Thread.sleep(3000);
	l.logintoapp(n, pass); 
		System.out.println(" the exam fee is =" +n1);
	/*	String name = e.readdatafromexcel("sheet1", 2, 6);
		String pass1 = e.readdatafromexcel("sheet1", 7, 6);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass1);
		driver.findElement(By.xpath("//*[@type='submit']")).click(); */
		
		
		
		
		
	}

}
