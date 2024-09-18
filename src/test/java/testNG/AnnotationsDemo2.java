package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsDemo2 {
	@Test
	public void f() {
		System.out.println("@Test f");
	}

	@Test
	public void a() {
		System.out.println("@Test a");
	}

	@BeforeMethod //Every method before this will be execute (pre-condition)
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod//Every method after this will be execute (post-condition)
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

}
