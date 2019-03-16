package TriangleTesting;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.parameterized.*;

import static org.junit.Assert.*;

import java.util.*;

import Triangle.Triangle;

@RunWith(Parameterized.class)
public class test {
	public int check;
	public test(int check)
	{
		this.check=check;
	}
	@Parameters
	public static List<Object[]> getValue()
	{
		return Arrays.asList(new Object [][]{
        {50},{20},{60},{80},{25},{30},{26},{27},{28},{1},{6},{8},{7}}
       );
	}
	
	@Test
	public void coins()
	{
		Triangle gl = new Triangle();
		assertTrue(true == gl.isCoinTakenOut(check));
	}
}


