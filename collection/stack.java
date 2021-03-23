package string;
import java.util.*;

public class stack {
	public static void main(String[]args) {
		Stack<String> st= new Stack<String>();
		st.push("Tamilnadu");
		st.push("Kerala");
		st.push("Karnataka");
		st.push("AndraPradesh");
		st.push("Telugana");
        System.out.println("By using push method");
        System.out.println(st);
        System.out.println("");
        System.out.println("By using pop method");
        st.pop();
        System.out.println(st);
        System.out.println("");
        System.out.println("By using iterator method");
        Iterator i= st.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        System.out.println("");
        System.out.println("By using forloop method");
        for(String str:st) {
        	System.out.println(str);
        }
        System.out.println("");
        System.out.println("To check wheather the stack is empty or not");
        Boolean emp= st.empty();
        System.out.println(emp);
        System.out.println("");
		System.out.println("To know the size of vector");
		System.out.println("Size:"+st.size());
		System.out.println("");
		System.out.println("To know the capacity of vector");
		System.out.println("Size:"+st.capacity());
        System.out.println("");
		System.out.println("By using contains method");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the state you want search in index");
		String sta=sc.nextLine();
		 if(st.contains(sta))  
         {  
              System.out.println("It is present in the index of " +st.indexOf(sta));  
         }  
         else  
         {  
            System.out.println("It is not present");  
         } 
		 
		
        
		
	}

}
