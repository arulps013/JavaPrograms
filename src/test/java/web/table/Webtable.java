package web.table;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tis.sit.BaseClass;
import tis.sit.LoginPOJO;

public class Webtable extends BaseClass {
	@BeforeClass
	private void launch() {
		browserLaunch();
		url("https://www.mathsisfun.com/timestable.html");
	}
	
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println("start time is"+ d);
	}
	
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println("end time is"+ d);
		
	}
	@Test
	private void tc1() {
		
	}
	
		
}
