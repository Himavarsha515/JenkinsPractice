package day2;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@Parameters({"n"})
	@Test
	public void test1(int n) {
		int a[]= {1,2,3,4,5};
		Arrays.sort(a);
		Assert.assertEquals(n,a[a.length-1]);
	}

}
