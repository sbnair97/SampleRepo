package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<String> days = new HashSet<String> ();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		System.out.println(days);
		
		//addAll - used to add the elements of one set to another set
		Set<String> days1 = new HashSet<String> ();
		days1.add("Wednesday");
		days1.add("Thursday");
		days1.add("Friday");
		days1.add("Saturday");
		
		days.addAll(days1);
		System.out.println(days);
		System.out.println(days1);
		System.out.println(days.contains("Friday"));
		
		//containsAll - to check whether all the elements of one set is contained in another set
		System.out.println(days.containsAll(days1));
		System.out.println(days1.containsAll(days));
		
		System.out.println(days.isEmpty());
		
		days1.remove("Saturday");
		System.out.println(days1);
		
		//removeAll - used to remove all the elements of one set from another set.
		days.removeAll(days1);
		System.out.println(days);
		
		System.out.println(days1.size());
		
		//clear() - to delete all the elements from a set but the object remains
		days1.clear();
		System.out.println(days1);
	}

}
