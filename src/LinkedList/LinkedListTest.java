package LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void test() {
		LinkedList list = new LinkedList();
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(7);
		list.pushFront(1);
		list.pushFront(4);		
		
		list.display();
		
		assertEquals(4,list.head.key);
		list.popFront();
		assertEquals(1, list.head.key);
		assertEquals(7, list.head.next.key);
	}	
		
	@Test
	void test_1() {
		LinkedList list = new LinkedList();
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(7);
		list.pushBack(1);
		list.pushBack(4);		
		
		list.display();
		
		int [] resultArr = {2,3,7,1,4};
		for(int i=0;i<5;i++) {
			assertEquals (resultArr[i],list.head.key );
			list.head = list.head.next;
		}
	}	
	
	@Test
	void test_2() {
		LinkedList list = new LinkedList();
		list.pushFront(2);
		list.pushFront(5);
		list.pushBack(1);
		list.pushBack(4);		
		list.pushFront(6);
		
		list.display();
		
		assertNotEquals (5 , list.head.key);
		list.popFront();
		list.head = list.head.next;
		assertEquals (2,list.head.key);
	}	
	
	@Test
	void test_3() {
		LinkedList list = new LinkedList();
		list.pushFront(2);
		list.pushFront(5);
		list.pushBack(1);
		list.pushBack(4);		
		list.pushFront(6);
		
		list.display();
		
		list.pop(0);
		list.display();		
		int [] resultArr = {5,2,1,4};

		for(int i=0;i<4;i++) {
			assertEquals(resultArr[i],list.head.key);
			list.popFront();
		}
	}		
	
	@Test
	void test_4() {
		LinkedList list = new LinkedList();	
		list.pushFront(12);
		list.pushFront(15);
		list.pushBack(11);
		list.pushBack(24);		
		list.pushFront(16);
		
		list.display();
		
		assertTrue (list.head.key > list.head.next.key);
		list.head = list.head.next;
		assertTrue (list.head.key > list.head.next.key);
		list.head = list.head.next.next;
		assertTrue (list.head.key < list.head.next.key);				
	}	
	
	@Test
	void test_5() {
		LinkedList list = new LinkedList();	
		list.pushFront(12);
		list.pushFront(15);
		list.pushBack(11);
		list.pushBack(24);		
		list.pushFront(16);
		
		list.display();
		
		assertFalse (list.head.key < list.head.next.key);
		list.popFront();
		assertFalse (list.head.key < list.head.next.key);
		list.popBack();
		list.popFront();
		assertFalse (list.head.key < list.head.next.key);				
	}	
	
	@Test
	void test_6() {
		LinkedList list = new LinkedList();	
		list.pushFront(12);
		list.pushFront(15);
		list.pushBack(11);
		list.pushBack(24);		
		list.pushFront(16);

		list.display();
		
		assertNotSame (list.head.key , list.head.next.key);
	}	
	
	@Test
	void test_7() {
		LinkedList list = new LinkedList();	
		list.pushFront(15);
		list.pushFront(15);
		list.pushBack(11);
		list.pushBack(24);		
		list.pushFront(16);

		list.display();
		
		assertNotSame (list.head.key , list.head.next.key);
		assertSame (list.head.next.key , list.head.next.next.key);
	}	

	@Test
	void test_8() {
		LinkedList list = new LinkedList();	
		list.pushFront(15);
		list.pushFront(11);
		list.pushBack(11);	
		
		list.display();
		
		list.pop(1);
		assertEquals(list.head.key, list.head.next.key);
		list.pushBack(7);
		list.display();
		list.pushFront(14);
		assertNotNull (list);
		int [] arr = {14,11,11,7};
		assertEquals (4,list.size);
		
		for(int i =0 ; i<4;i++) {
			assertEquals(arr[i] , list.head.key);
			list.popFront();
		}
	}	

	@Test
	void test_9() {
		LinkedList list = new LinkedList();	
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(6);
		list.pushBack(7);
		
		list.display();

		list.pop(list.size/2);
		int [] arr = {1,2,3,5,6,7};
		for(int i =0; i<list.size; i++) {
			assertEquals(arr [i], list.head.key);
			assertSame (arr[i] , list.head.key);
			list.popFront();		
		}
		
	}	
}
