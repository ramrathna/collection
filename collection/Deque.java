package string;
import java.util.*;

public class Deque {
	public static void main(String[]args) {
		ArrayDeque<String> deq=new ArrayDeque<String>();
		deq.add("Tamilnadu");
		deq.add("Kerala");
		deq.add("karnataka");
		deq.add("AndraPradesh");
		deq.add("Telugana");
		System.out.println(deq);
		Iterator i=deq.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
