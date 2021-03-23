package string;
import java.util.*;
public class map {
	public static void main(String[]args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Tamilnadu");
		map.put(2, "Kerala");
		map.put(3, "AndraPradesh");
		map.put(4, "Karnataka");
		map.put(5, "Telugana");
		System.out.println(map);
		
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println("Key:" +m.getKey() + " " +"Value:" +m.getValue());
		}
		System.out.println("If it is absent, it will add the value");
		map.putIfAbsent(6,"Orissa");
        System.out.println(map);
		
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println("Key:" +m.getKey() + " " +"Value:" +m.getValue());
		}
		LinkedHashMap<Integer,String> hm= new LinkedHashMap<Integer,String>();
		hm.put(7, "Maharastra");
		hm.put(8,"Rajasthan");
		System.out.println("To add one map into another map");
		map.putAll(hm);
	    System.out.println(map);
	    map.remove(hm);
	    System.out.println(map);
	   /* map.remove(4,"Karnataka");
	    System.out.println(map);
	    map.replace(2,"Mysore");
	    System.out.println(map);
	    map.put(null, null);
	    System.out.println(map);*/
	    
	    
	    
	    
	    
		
		
	}

}
