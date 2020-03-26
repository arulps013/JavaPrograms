package tis.sit;

import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Sample1 extends BaseClass {

	@Parameters({ "browser" })
	@Test
	public void tc1(String s1) {
		if (s1.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUL\\eclipse-workspace\\TestNG_Samp\\Driver\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().window().maximize();
		} else if (s1.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARUL\\eclipse-workspace\\TestNG_Samp\\Driver\\geckodriver.exe");
			d = new FirefoxDriver();
			d.manage().window().maximize();
		} else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\ARUL\\eclipse-workspace\\TestNG_Samp\\Driver\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
			d.manage().window().maximize();
		}
	}

	@Test
	public void tc2() {
		LoginPOJO l = new LoginPOJO();
		url("https://www.facebook.com/");
		String title = d.getTitle();
		Assert.assertTrue(title.contains("Facebook"), "In Facebook page");
		JavascriptExecutor j=(JavascriptExecutor)d;
		WebElement txtEmail = l.getTxtemail();
		j.executeScript("arguments[0].setAttribute('value','amurugan455@gmail.com')", txtEmail);
	//	txtEmail.sendKeys("amurugan455@gmail.com");
		WebElement txtPass = l.getTxtpass();
		j.executeScript("arguments[0].setAttribute('value','Arul-Ammu95')", txtPass);
		//txtPass.sendKeys("Arul-Ammu95");
		

	}

	@Test
	public void tc3() {
		LoginPOJO l = new LoginPOJO();
		btnClick(l.getBtnLogin());
	}

}
