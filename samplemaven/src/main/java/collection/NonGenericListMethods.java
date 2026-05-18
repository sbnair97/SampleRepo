package collection;
import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				List L = new ArrayList();
				
				//add() method - To add elements into the list
				L.add("Sachin");
				L.add(28);
				L.add(250.00);
				L.add(28);
				System.out.println(L);
				
				//get() method - Used to to get an element at the specified index
				System.out.println(L.get(2));
				
				//set() method - Used to set a new value by replacing the existing
				L.set(1, "Aswin");
				System.out.println(L);
				
				//indexOf() method - to find the first occurrence of an element
				System.out.println(L.indexOf(250.00));
				
				//lastIndexOf() method - to find the last occurrence of an element
				System.out.println(L.lastIndexOf(28));
				
				//remove() method - to remove an element
				L.remove("Sachin");
				System.out.println(L);
				L.remove(0);
				System.out.println(L);
				
				//contains() method - to check whether a given element is present or not in the list
				System.out.println(L.contains("Sachin"));
				System.out.println(L.contains(250.00));
				
				//isEmpty() method - to check whether the given list is empty or not
				System.out.println(L.isEmpty());
				
				//size() method - used to find the number of elements in the list.
				System.out.println(L.size());

	}

}
