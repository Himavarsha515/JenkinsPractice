package day2;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	@Parameters({"d","r"})
	@Test
	public void areaOfCircle(double d,int r) {
		Assert.assertEquals(d, Math.PI*r*r);
	}

}
