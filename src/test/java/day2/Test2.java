package day2;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Parameters({"s1"})
	@Test
	public void palindrome(String s1) {
		StringBuilder sb=new StringBuilder(s1);
		String s2=sb.reverse().toString();
		
		Assert.assertTrue(s1.equals(s2));
	}

}
