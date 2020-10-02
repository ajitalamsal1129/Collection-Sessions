import java.util.HashMap;
import java.util.Map.Entry;

import ListConcept.Employee;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "selenium");
		hm.put(2, "qtp");
		hm.put(3, "testcomplete");
		hm.put(4, "rft");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(5));//gives null error, not exception
		
		for(Entry m : hm.entrySet()) {//stored in m
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		
		
		   System.out.println(hm);
		   hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();//importing from listconcept employee class
		Employee e1=new Employee("Naveen",27,"QA");
		Employee e2=new Employee("Tom",26,"Dev");
        Employee e3=new Employee("Harry",25,"BA");
        
        emp.put(1, e1);
        emp.put(2, e2);
        emp.put(3, e3);

        //traverse the hashmap
		for(Entry<Integer,Employee> m : emp.entrySet()) {//stored in m
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println("Employee"+ key + "Info:");
			System.out.println(e.name+ " " +e.age +" " +e.dept);

			

			
		}

        
		

		
		



			
		}
	}



		
		

		

		

	


