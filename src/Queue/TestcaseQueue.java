package Queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestcaseQueue {

	@SuppressWarnings("null")
	@Test
	void test() {
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		
		q1.display();

		assertEquals (1 , q1.dequeue());
		assertEquals (2 , q1.dequeue());
		assertEquals (3 , q1.dequeue());
		assertEquals (4 , q1.dequeue());
		assertEquals (5 , q1.dequeue());
		assertEquals (6 , q1.dequeue()); 
	}
	
	@Test
	void test_6 () {
		Queue q1 = new Queue();
		assertEquals (-1 , q1.dequeue());
	}	
	
	@Test
	void test_1 () {
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		
		q1.display();
		
		assertNotEquals (2 , q1.dequeue());
		assertNotEquals (3 , q1.dequeue());
		assertNotEquals (4 , q1.dequeue());
		assertNotEquals (1 , q1.dequeue());
		assertNotEquals (6 , q1.dequeue());
		assertNotEquals (4 , q1.dequeue()); 
	}

	@Test
	void test_2 () {
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		
		q1.display();
		
		assertTrue (2 > q1.dequeue());
		assertTrue (3 > q1.dequeue());
		assertTrue (4 > q1.dequeue());
		assertTrue (5 > q1.dequeue());
		assertTrue (6 > q1.dequeue());
		assertTrue (7 > q1.dequeue()); 
	}
	
	@Test
	void test_3 () {
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		
		q1.display();
		
		assertFalse (2 < q1.dequeue());
		assertFalse (3 < q1.dequeue());
		assertFalse (4 < q1.dequeue());
		assertFalse (5 < q1.dequeue());
		assertFalse (6 < q1.dequeue());
		assertFalse (7 < q1.dequeue()); 
	}
	
	@Test
	void test_4 () {
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(8);
		q1.enqueue(7);
		
		q1.display();
		
		assertSame (1 , q1.dequeue());
		assertSame (2 , q1.dequeue());
		assertSame (3 , q1.dequeue());
		assertSame (4 , q1.dequeue());
		
	}	
	
	@Test
	void test_5 () {
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(8);
		q1.enqueue(7);
		
		q1.display();
		
		assertNotNull(q1);
	}	
	
	@Test
	void test_7 () {
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(8);
		q1.enqueue(7);
		
		q1.display();
		
		assertNotSame(2 , q1.dequeue());
		assertNotSame(3 , q1.dequeue());
		assertNotSame(1 , q1.dequeue());
		assertNotSame(12 , q1.dequeue());
		assertNotSame(42 , q1.dequeue());
	}	
	
	@Test
	void test_8 () {
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(8);
		q1.enqueue(7);
		
		q1.display();
		
		assertEquals (1 , q1.dequeue());
		assertNotEquals (1 , q1.dequeue());
		assertSame(3 , q1.dequeue());
		assertTrue(2 < q1.dequeue());
		assertFalse(1 > q1.dequeue());
		assertNotNull(q1);
	}	
}

