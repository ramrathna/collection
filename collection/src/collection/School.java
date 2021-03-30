package collection;
import java.util.*;

class Schoolfees{
	int id;
	String name;
	Status status;
	
	enum Status{
		FEE_PAID,FEE_NOT_PAID,FEE_PENDING
	}

	public Schoolfees(int id, String name, Status status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
}

public class School {
	public static void main(String[]args) {
		ArrayList <Schoolfees> a1 = new ArrayList <Schoolfees>();
		Schoolfees s1= new Schoolfees(103,"Naveen Prasad",Schoolfees.Status.FEE_NOT_PAID);
		Schoolfees s2= new Schoolfees(101,"Hariharan",Schoolfees.Status.FEE_PAID);
		Schoolfees s3= new Schoolfees(102,"Ramanathan",Schoolfees.Status.FEE_PENDING);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
	
		Collections.sort(a1);
		
		for(Schoolfees s:a1) {
			System.out.println("ID: "+s.id+"  "+"Name: "+s.name+"  "+"Status: "+s.status);			
			
		}
		
	}

}
