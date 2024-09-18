package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsDemo3 {
	@Test
	public void f() {
		System.out.println("@Test f");
	}

	@Test
	public void d() {
		System.out.println("@Test d");
	}
	@Test
	public void z() {
		System.out.println("@Test z");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

}
