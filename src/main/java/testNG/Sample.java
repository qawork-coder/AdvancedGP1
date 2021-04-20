package testNG;

import org.testng.annotations.Test;

public class Sample {

	@Test(dependsOnMethods = "b")
	public void a()
	{
		System.out.println("A method");
	}
	
	@Test
	public void b()
	{
		System.out.println("B method");
	}
}
