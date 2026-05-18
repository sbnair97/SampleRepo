package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set d = new HashSet ();
		d.add("Sunday");
		d.add(1);
		d.add(3.005);
		System.out.println(d);
		
		//addAll - used to add the elements of one set to another set
		Set s = new HashSet ();
		s.add("Wednesday");
		s.add("Thursday");
		s.add(3);
		s.add(5.003);
		
		d.addAll(s);
		System.out.println(d);
		System.out.println(s);
		System.out.println(d.contains(3));
		
		//containsAll - to check whether all the elements of one set is contained in another set
		System.out.println(d.containsAll(s));
		System.out.println(s.containsAll(d));
		
		System.out.println(d.isEmpty());
		
		s.remove(5.003);
		System.out.println(s);
		
		//removeAll - used to remove all the elements of one set from another set.
		d.removeAll(s);
		System.out.println(d);
		
		System.out.println(s.size());
		
		//clear() - to delete all the elements from a set but the object remains
		s.clear();
		System.out.println(s);

	}

}
