package LinkedList;
import java.util.LinkedList; // Linked list class from util package;
public class collectionsLinkedLists {

	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<>(); // it'll create an object to the Doubly Linked list
		
		list.add(100);// it'll add the elements to the end of the list
		list.add(500);
		list.add(300);
		list.add(2,400);// it'll insert the element at the specified position
		
		System.out.println(list);
		list.set(2, 500); // it'll replace the element at specified position with new element
		
		System.out.println(list);
		list.remove(2); // it'll take index as argument and delete the node at that index
		
		System.out.println(list);
		list.sort(null); // it'll sort the list in the ascending order/natural order
		
		System.out.println(list);
		System.out.println(list.get(2));  // it'll give the element at specified index
		
		System.out.println(list.getFirst()); // first element of the list
		
		System.out.println(list.getLast()); // last element of the list
		
		System.out.println(list.size()); // size of the list
		
		
	}

}
