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
		assertEquals (false , arr.binarySearch(13, 2, 6));
		assertEquals (true , arr.binarySearch(5,6,9));
		assertEquals (false , arr.binarySearch(5, 1, 5));
		assertNotEquals (true , arr.binarySearch(5, 2, 6));
	}	
	
	@Test
	void test_2() {
		Array arr = new Array();
		arr.insert(12, 0);
		arr.insert(2, 1);
		arr.insert(6, 2);
		arr.insert(19, 3);
		arr.insert(21, 4);
		
		arr.display();
		assertSame (true , arr.binarySearch(6, 0, 4));
		arr.delete(2);
		assertNotSame (true , arr.binarySearch(6, 0, 4));
		
	}
	
	@Test
	void test_3() {
		Array arr = new Array();
		arr.insert(12, 0);
		arr.insert(2, 1);
		arr.insert(6, 2);
		arr.insert(19, 3);
		arr.insert(21, 4);
	
	
		arr.bubbleSort();
		arr.display();	
		
		int [] expected_arr = {2,6,12,19,21};
		for (int i=0;i<5;i++) {
			assertEquals (expected_arr[i] , arr.array[i]);
		}
	}
	@Test
	void test_4() {
		Array arr = new Array();
		arr.insert(12, 0);
		arr.insert(2, 1);
		arr.insert(6, 2);
		arr.insert(19, 3);
		arr.insert(21, 4);
		
		arr.display();
		
		int [] temp = {2,1,3,5,4};
		for (int i = 0;i<5;i++) {
		assertTrue (temp[i] < arr.array[i]);
		}
		arr.delete(2);
		arr.delete(5);
		for (int i=0;i<3;i++) {
		assertFalse (temp[i] > arr.array[i]);
		}		
	} 
	
	@Test
	void test_5() {
		Array arr = new Array();
		arr.insert(12, 0);
		arr.insert(2, 1);
		arr.insert(5, 2);
		arr.insert(19, 3);
		arr.insert(21, 4);
		
		arr.display();
		assertNotNull (arr);
		
		assertSame (arr.array[2] , arr.size);
	}	
}
