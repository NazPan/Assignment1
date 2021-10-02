package ArrayF;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unittest {

	@Test
	void test() {
		Array arr = new Array();
		arr.insert(12, 0);
		arr.insert(2, 1);
		arr.insert(6, 2);
		arr.insert(19, 3);
		arr.insert(21, 4);
		
		arr.display();
		
		assertEquals (true ,arr.linearSearch(21));
		assertEquals (false , arr.linearSearch(11));
		
	}
	@Test
	void test_1() {
		Array arr = new Array();
		arr.insert(12, 0);
		arr.insert(2, 1);
		arr.insert(6, 2);
		arr.insert(19, 3);
		arr.insert(21, 4);
		arr.insert(10, 5);
		arr.insert(16, 6);
		arr.insert(5, 7);
		arr.insert(1, 8);
		arr.insert(11, 9);

		arr.display();
		
		assertEquals (true , arr.binarySearch(6, 0, 4));
		assertEquals (false , arr.binarySearch(5, 2, 21));
		assertEquals (true , arr.binarySearch(5,6,9));
		assertEquals (false , arr.binarySearch(5, 1, 5));
	}	
	
}
