package Stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Stack.Stack;

class T_stack {

	@Test
	void test() {
			Stack obj = new Stack();
			obj.push(1);
			obj.push(0);
			obj.push(3);
			obj.push(7);
			
			obj.display();
			
			assertEquals (7 , obj.top());
			assertNotEquals (3 , obj.top());
			assertSame (7 ,obj.top());
			assertTrue (9 > obj.top());
			assertFalse(3 > obj.top());
			assertNotNull (obj.top());
			assertNotSame(2 , obj.top());
	}

	@Test
	void test_1() {
			Stack obj = new Stack();
			obj.push(1);
			obj.push(0);
			obj.push(3);
			obj.push(7);

			obj.display();	
			
			assertEquals (7 , obj.pop());
			assertEquals (3 , obj.pop());
			assertEquals (0 , obj.pop());
			assertEquals (1 , obj.pop());
	}		
			
	
	@Test
	void test_6 () {
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		
		obj.display();
		
		assertNotEquals (2 , obj.pop());
		assertNotEquals (3 , obj.pop());
		assertNotEquals (3 , obj.pop());
		assertNotEquals (1 , obj.pop());
		assertNotEquals (6 , obj.pop());
		assertNotEquals (4 , obj.pop()); 
	}

	@Test
	void test_2 () {
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		
		obj.display();
		
		assertTrue (7 > obj.pop());
		assertTrue (6 > obj.pop());
		assertTrue (5 > obj.pop());
		assertTrue (4 > obj.pop());
		assertTrue (3 > obj.pop());
		assertTrue (2 > obj.pop()); 
	}
	
	@Test
	void test_3 () {
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		
		obj.display();
		
		assertFalse (2 > obj.pop());
		assertFalse (3 > obj.pop());
		assertFalse (1 > obj.pop());
		assertFalse (5 < obj.pop());
		assertFalse (6 < obj.pop());
		assertFalse (7 < obj.pop()); 
	}
		
	@Test
	void test_4 () {
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(8);
		obj.push(7);
		
		obj.display();
		
		assertSame (7 , obj.pop());
		assertSame (8 , obj.pop());
		assertSame (6 , obj.pop());
		assertSame (5 , obj.pop());
		
	}	
	
	@Test
	void test_5 () {
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(8);
		obj.push(7);
		
		obj.display();
		
		assertNotNull(obj);
	}	
	
	@Test
	void test_7 () {
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(8);
		obj.push(7);
		
		obj.display();
		
		assertNotSame(2 , obj.pop());
		assertNotSame(3 , obj.pop());
		assertNotSame(1 , obj.pop());
		assertNotSame(12 , obj.pop());
		assertNotSame(42 , obj.pop());
	}	
	
	@Test
	void test_8 () {
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(8);
		obj.push(7);
		
		obj.display();
		
		assertEquals (7 , obj.pop());
		assertNotEquals (1 , obj.pop());
		assertSame(6 , obj.pop());
		assertTrue(2 < obj.pop());
		assertFalse(1 > obj.pop());
		assertNotNull(obj);
	}	

	@Test
	void test_9 () {
		Stack obj = new Stack();
		obj.push(9);
		obj.push(6);
		obj.push(3);
		
		obj.display();
		
		int a = 3 ; 
		for (int i = 1; i<4;i++ ) {
			assertEquals (a*i , obj.pop());
		}
	}
	
	@Test
	void test_10 () {
		Stack obj = new Stack();	
		obj.push(3);
		obj.push(5);
		obj.push(4);
		int a = obj.pop();
		assertEquals (5 , obj.top());
		a = obj.pop();
		assertNotEquals (5 , obj.top());
		assertSame (a-2 , obj.top());	
	}	

	@Test
	void test_11 () {
		Stack obj = new Stack();	
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(8);
		obj.push(7);

		obj.display();
		
		assertEquals (8 , obj.getSize());
		
	}
	
	@Test
	void test_12 () {
		Stack obj = new Stack();	
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(8);
		obj.push(7);

		obj.display();
		
		assertNotEquals (6 , obj.getSize());
		int a = obj.pop();
		a = obj.pop();
		a = obj.pop();
		assertNotEquals (6 , obj.getSize());		
	}

}
