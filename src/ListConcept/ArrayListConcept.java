package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
int a[]=new int[3];//static array. Size is fixed
		
		//dynamic array--ArrayList
		//1.can contains duplicate values/elements
		//2.maintains insertion order
		//3.Synchronized
		//4.allows random access to fetch the elements because it stores the values on the basis of indexes
		
		ArrayList ar=new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		

       System.out.println(ar.size());//size of arraylist
       
		ar.add(40);//3
		ar.add(50);//4
		ar.add(60);//5
		ar.add(12.33);
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));//to get the value from an index
		
		//to print all the values from arraylist
		//1.use loop
		//2.using iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non-generic vs generic
		ArrayList<Integer>ar1=new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String>ar2=new ArrayList<String>();
		ar2.add("Selenium");
		ar2.add("test");
		
		//ArrayList<E>ar3=new ArrayList<E>();
		System.out.println("########");

		
		
		//Employee class objects
		Employee e1=new Employee("Naveen",27,"QA");
		Employee e2=new Employee("Tom",26,"Dev");
        Employee e3=new Employee("Harry",25,"BA");

		//create arraylist
        ArrayList<Employee> ar4=new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);
        
        //iterator to troverse the values
        Iterator<Employee> it=ar4.iterator();
        while(it.hasNext()) {
        	Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
			System.out.println("########");
			
			//addall()
			ArrayList<String>ar5=new ArrayList<String>();
			ar5.add("test");
			ar5.add("selenium");
			ar5.add("QTP");
			
			ArrayList<String>ar6=new ArrayList<String>();
			ar6.add("dev");
			ar6.add("java");
			ar6.add("javascript");
			
			ar5.addAll(ar6);
			for(int i=0;i<ar5.size();i++) {
				System.out.println(ar5.get(i));

			}
			
			
			System.out.println("########");
			

				
				//removeall()
				ar5.removeAll(ar6);
				for(int i=0;i<ar5.size();i++) {
					System.out.println(ar5.get(i));

				}
				
				System.out.println("########");

					

				//retainAll()
					ArrayList<String>ar7=new ArrayList<String>();
					ar7.add("test");
					ar7.add("selenium");
					ar7.add("QTP");
					
					ArrayList<String>ar8=new ArrayList<String>();
					ar8.add("test");
					ar8.add("java");
					
					ar7.retainAll(ar8);
					for(int i=0;i<ar7.size();i++) {
						System.out.println(ar7.get(i));
					
					
					}
        }
	}
}


					
				
					
					
					
				
				
				

				
			
			



			

			




        	
        
        

        
        


		

		
		
		








		

	


