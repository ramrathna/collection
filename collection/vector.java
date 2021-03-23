package string;
import java.util.*;
public class vector {
	public static void main(String[]args) {
		Vector<String> vc=new Vector<String>();
		System.out.println("By using Add method");
		vc.add("Tamilnadu");
		vc.add("kerala");
		vc.add("Karnataka");
		vc.add("Andrapradesh");
		vc.add("Telugana");
		System.out.println(vc);
		System.out.println("");
		System.out.println("By using AddElement method");
		vc.addElement("Maharastra");
		vc.addElement("Orissa");
		System.out.println(vc);
		System.out.println("");
		System.out.println("By using ForEach method");
		for(String i:vc) {
			System.out.println(i);
		}
		System.out.println("");
		System.out.println("To know the size of vector");
		System.out.println("Size:"+vc.size());
		System.out.println("");
		System.out.println("To know the capacity of vector");
		System.out.println("Size:"+vc.capacity());
		System.out.println("");
		System.out.println("To know the First Element of vector");
		System.out.println("First Element:"+vc.firstElement());
		System.out.println("");
		System.out.println("To know the last Element of vector");
		System.out.println("Last Element:"+vc.lastElement());
		System.out.println("");
		System.out.println("By using contains method");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the state you want search in index");
		String sta=sc.nextLine();
		 if(vc.contains(sta))  
         {  
              System.out.println("It is present in the index of " +vc.indexOf(sta));  
         }  
         else  
         {  
            System.out.println("It is not present");  
         }  
		
		
		
		
				
	}
	
	
	
	
	
	
	

}
