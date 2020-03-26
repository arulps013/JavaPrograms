package sam.mas;

import org.testng.annotations.Test;

public class A {
	@Test(retryAnalyzer=Failed.class)
	public void tc1() {
		System.out.println(3/0);
		}
	@Test
	public void tc2() {
		System.out.println("456");
	}
}
