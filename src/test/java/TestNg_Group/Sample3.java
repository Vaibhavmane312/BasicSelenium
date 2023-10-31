package TestNg_Group;

import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void demo5() {
		System.out.println("Hi demo5");
	}
	
	@Test(groups="smoke")
	public void demo6() {
		System.out.println("Hi demo6");
	}

}
