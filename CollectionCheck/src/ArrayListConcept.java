import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dynamic array -- ArrayList
		//1. Can contain duplicate values or elements.
		//2. Maintains insertion order.
		//3. Synchonized.
		//4. Allows random access to fetch the elements because it stores the values on the basis of index.
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(40);
		ar.add("Prasant");
		ar.add(true);
		System.out.println(ar.size());
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		// non-generic vs generic in collection
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("prasant");
		
		//Employee class objects.
		Employee e1 = new Employee("prasant",34,"QA");
		Employee e2 = new Employee("Tom",35,"Dev");
		Employee e3 = new Employee("Piter",36,"PMO");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the list.
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		

	}

}
