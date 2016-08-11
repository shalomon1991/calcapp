package com.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	Calc calc = null;
	
	public void sertup() {
		calc = new Calc();
	}
	
	public void add() {
		int a = 12;
		int b = 13;
		int actual = (int) calc.add(a, b);
		int expected = 25;
		Assert.assertEquals(expected, actual);
	}
	
}
