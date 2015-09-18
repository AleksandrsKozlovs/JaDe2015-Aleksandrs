package m00;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

	int[] testArr = new int[]{1,3,4,5,6,8,11};
	int[] testArr2 = new int[]{1,4,6,7,8,9,12,15};
	
	@Test
	public void testFind1() {
		int testint = 3;
		int a = Search.find(testint, testArr);
		assertEquals(1, a);
	}
	
	@Test
	public void testFind2() {
		int testint = 6;
		int a = Search.find(testint, testArr);
		assertEquals(4, a);
	}
	
	@Test
	public void testFind3() {
		int testint = 0;
		int a = Search.find(testint, testArr);
		assertEquals(-1, a);
	}
	
	@Test
	public void testFind4() {
		int testint = 7;
		int a = Search.find(testint, testArr2);
		assertEquals(3, a);
	}
	
	@Test
	public void testFind5() {
		int testint = 9;
		int a = Search.find(testint, testArr2);
		assertEquals(5, a);
	}
	
	@Test
	public void testFind6() {
		int testint = 0;
		int a = Search.find(testint, testArr2);
		assertEquals(-1, a);
	}

}
