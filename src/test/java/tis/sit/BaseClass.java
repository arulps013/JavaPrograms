package tis.sit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver d;
	 public static void browserLaunch() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUL\\eclipse-workspace\\TestNG_Samp\\Driver\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.manage().window().maximize();
		 }
	 public static void url(String url) {
		d.get(url);
	}
	 
	 public static void fill(WebElement ele, String text) {
		ele.sendKeys(text);
	}
	 public static void btnClick(WebElement ele) {
		 ele.click();
	}
	 public static void webTable1(String text) {
		 List<WebElement> trows = d.findElements(By.tagName(text));
	}
	 
}
