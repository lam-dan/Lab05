/**
 * Lab 3
 * @author Daniel Lam, Chitra Srinivasan
 * CS 22C
 * Date: 5/09/22
 * Lab03Main.java is designed to act as the main program where the different sequence
 * of operations for Singly Linked List, Stack and Queue are performed on the Dollar and Pound objects, and the results
 * are printed to the console.
 */
public class Lab03Main {
	
	public static void main(String [] args){
		System.out.println("Welcome to ADT Testing by Daniel Lam and Chitra Srinivasan.");
		System.out.println();
		// Initializing Pound and Dollar in currencies array
		Currency[] currencies = new Currency[20];
		currencies[0] = new Dollar(57.12);
		currencies[1] = new Dollar(23.44);
		currencies[2] = new Dollar(87.43);
		currencies[3] = new Dollar(68.99);
		currencies[4] = new Dollar(111.22);
		currencies[5] = new Dollar(44.55);
		currencies[6] = new Dollar(77.77);
		currencies[7] = new Dollar(18.36);
		currencies[8] = new Dollar(543.21);
		currencies[9] = new Dollar(20.21);
		currencies[10] = new Dollar(345.67);
		currencies[11] = new Dollar(36.18);
		currencies[12] = new Dollar(48.48);
		currencies[13] = new Dollar(101.00);
		currencies[14] = new Dollar(11.00);
		currencies[15] = new Dollar(21.00);
		currencies[16] = new Dollar(51.00);
		currencies[17] = new Dollar(1.00);
		currencies[18] = new Dollar(251.00);
		currencies[19] = new Dollar(151.00);
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.prepend(currencies[0]);
		linkedList.prepend(currencies[1]);
		linkedList.prepend(currencies[2]);
		linkedList.prepend(currencies[3]);
		linkedList.prepend(currencies[4]);
		linkedList.prepend(currencies[5]);
		linkedList.prepend(currencies[6]);
		System.out.println("Printing list after adding first seven (7) objects from the array into the linked list in reverse order.");
		System.out.println(linkedList.printList());
		System.out.println();
		System.out.println();
		
		System.out.println("Searching for $87.43.");
		System.out.println("Found $87.43 at index "+ linkedList.findCurrency(new Dollar(87.43)));
		System.out.println("Searching for $44.56.");
		System.out.println("Found 44.56 at index " + linkedList.findCurrency(new Dollar(44.56)));
	
		System.out.println();
		System.out.println();
		
		System.out.println("Removing node containing $111.22");
		linkedList.removeCurrency(new Dollar(111.22));
		System.out.println("Removing node at index 2");
		linkedList.removeCurrency(2);
		System.out.println("Printing list after Remove the node containing $111.22 followed by the node at index 2.");
		System.out.println(linkedList.printList());
		System.out.println();
		System.out.println();
		
		System.out.println("Adding four (4) objects (#9 thru 12) such that their index in the linked list is calculated as (index in array % 5)");
		linkedList.addCurrency(currencies[8], 3); 
		linkedList.addCurrency(currencies[9], 4);
		linkedList.addCurrency(currencies[10], 0);
		linkedList.addCurrency(currencies[11], 1);
		System.out.println();
		System.out.println("Remove two (2) objects at indexes (countCurrency % 6) and (countCurrency / 7) in that order.");
		System.out.println();
		linkedList.removeCurrency(2);
		linkedList.removeCurrency(1);
		System.out.println("Printing list.");
		System.out.println(linkedList.printList());
		System.out.println();
		System.out.println();
		
		
		Stack stack = new Stack();
		stack.push(currencies[13]);
		stack.push(currencies[14]);
		stack.push(currencies[15]);
		stack.push(currencies[16]);
		stack.push(currencies[17]);
		stack.push(currencies[18]);
		stack.push(currencies[19]);
		System.out.println("Printing stack after pushing seven (7) objects starting from the array index 13 onwards to the stack.");
		System.out.println(stack.printStack());
		System.out.println();
		System.out.println();
		
		System.out.println("Printing result after peek the top of the stack");
		System.out.println(stack.peek().toString());
		System.out.println();
		
		System.out.println("Popping from the top of the stack.");
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Printing stack after performing three (3) pops in succession");
		System.out.println(stack.printStack());
		System.out.println();
		System.out.println();
		
		stack.push(currencies[0]);
		stack.push(currencies[1]);
		stack.push(currencies[2]);
		stack.push(currencies[3]);
		stack.push(currencies[4]);
		
		stack.pop();
		stack.pop();
		
		System.out.println("Printing stack after Push five (5) more objects from the start of the objects array to the stack and Pop twice in succession.");
		System.out.println(stack.printStack());
		System.out.println();
		System.out.println();
		
		Queue queue = new Queue();
		queue.enqueue(currencies[5]);
		queue.enqueue(currencies[7]);
		queue.enqueue(currencies[9]);
		queue.enqueue(currencies[11]);
		queue.enqueue(currencies[13]);
		queue.enqueue(currencies[15]);
		queue.enqueue(currencies[17]);
		System.out.println("Printing queue after Enqueue the seven (7) objects at odd indexes starting from index 5 in the array.");
		System.out.println(queue.printQueue());
		System.out.println();
		System.out.println();
		
		System.out.println("Printing queue after Peek the front and end of the queue");
		System.out.println(queue.peekFront().toString());
		System.out.println(queue.peekRear().toString());
		System.out.println();
		
		
		queue.dequeue();
		queue.dequeue();
		System.out.println("Printing queue after perform two (2) dequeues in succession");
		System.out.println(queue.printQueue());
		System.out.println();
		System.out.println();
		
		queue.enqueue(currencies[10]);
		queue.enqueue(currencies[11]);
		queue.enqueue(currencies[12]);
		queue.enqueue(currencies[13]);
		queue.enqueue(currencies[14]);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println("Printing queue after Enqueue five (5) more objects from the index 10 in the array and Dequeue three times in succession.");
		System.out.println(queue.printQueue());
		System.out.println();
		System.out.println();
		System.out.println("Testing Linked List Complete. Exiting Program.");
		
	}


}
