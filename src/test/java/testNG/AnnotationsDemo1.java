package testNG;

import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	@Test
	public void zasgdsg() {
		System.out.println("method z");
	}

	@Test(enabled = false)
	public void abzasdfsdg() {
		System.out.println("method a");
	}

	@Test
	public void abwery() {
		System.out.println("method b");
	}

}
