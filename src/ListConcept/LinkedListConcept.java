package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("rft");
		ll.add("rpa");
		
		//print
		System.out.println("content of linkedlist:" + ll);
		
		//addfirst
		ll.addFirst("Ajita");
		
		//addlast
		ll.addLast("Automation");
		
		System.out.println("content of linkedlist:" + ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "Tom");//change Tom from Ajita
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist:" + ll);
		
		ll.remove(2);
		System.out.println("content of linkedlist:" + ll);
		
		//how to print all values of linkedList
		//1.for loop
		System.out.println("using for loop" );
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));

			
		}
		
		//2.advence for-loop
		System.out.println("using advance for loop" );
		for(String str:ll) {
			System.out.println(str);

			
		}
		
		//3.iterator
		System.out.println("using itewrator" );
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

			
		}
		
		//while lpop
		System.out.println("using whiler loop" );
		
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;

			
		}

		
		

		
 
		

		

		
		

		

		

		

		

		
		




		
		
				
		

	}

}
