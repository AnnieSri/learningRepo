import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMinInSortedRotatedArrayTest {

	@Test
	void test() {
		
		int[] a = new int[] {3,4,5,6,1,0,2,3}; 
		findMinInSortedRotatedArray fndMin = new findMinInSortedRotatedArray();
		int actual = fndMin.findMin(a);
		assertEquals(0, actual);
	}

}
