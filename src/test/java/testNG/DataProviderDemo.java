package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	@Test(dataProvider = "mytestdata")
	public void f(String un, String pwd) {
		System.out.println(un);
		System.out.println(pwd);
		System.out.println("************************");
	}

	@Test(dataProvider = "newdata")
	public void d(String abc) {
		System.out.println(abc);
		System.out.println("//////////////////////////////");
	}

	@DataProvider
	public Object[][] mytestdata() {
		return new Object[][] { new Object[] { "Sandeep@gmail.com", "sdf365yth3576a" },
				new Object[] { "Vivek@gmail.com", "436rusdf365yth3576a" },
				new Object[] { "sreeni@gmail.com", "436r7rthghsdf365yth3576a" }, };
	}

	@DataProvider
	public Object[][] newdata() {
		return new Object[][] { 
			new Object[] { "Sandeep@gmail.com" }, 
			new Object[] { "Vivek@gmail.com" },
			new Object[] { "sreeni@gmail.com" } };
	}
}
