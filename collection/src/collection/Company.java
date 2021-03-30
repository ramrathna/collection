package collection;
import java.util.ArrayList;
import java.util.Collections;

class Employee {
  int id;
	String name;
	Status status;
	enum Status{
		CONFIRMED,PENDING,FAILED
	}		
public Employee(int id, String name, Status status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
}

public class Company {
	public static void main(String[] args) {
	    ArrayList  <Employee> sl = new ArrayList <Employee>();
		Employee a1 = new Employee(101,"Naveen",Employee.Status.FAILED);
		Employee a2 = new Employee(102,"Prasad",Employee.Status.CONFIRMED);
		Employee a3 = new Employee(103,"Ramrathna",Employee.Status.PENDING);
		Employee a4 = new Employee(104,"HariHaran",Employee.Status.FAILED);
		Employee a5 = new Employee(105,"Nivetha",Employee.Status.CONFIRMED);
		sl.add(a1);
		sl.add(a2);
		sl.add(a3);
		sl.add(a4);
		sl.add(a5);
		
		for(Employee e : sl) {
			System.out.println("Employee id: "+e.id+"  "+"Emloyee Name: " +e.name+"  "+"Status: " +e.status);
		}
		}
}
