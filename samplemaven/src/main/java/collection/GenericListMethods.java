package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String>();
		
		//add() method - To add elements into the list
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Orange");
		System.out.println(fruits);
		
		//get() method - Used to to get an element at the specified index
		System.out.println(fruits.get(2));
		
		//set() method - Used to set a new value by replacing the existing
		fruits.set(1, "Pineapple");
		System.out.println(fruits);
		
		//indexOf() method - to find the first occurrence of an element
		System.out.println(fruits.indexOf("Pineapple"));
		
		//lastIndexOf() method - to find the last occurrence of an element
		System.out.println(fruits.lastIndexOf("Orange"));
		
		//remove() method - to remove an element
		fruits.remove("Orange");
		System.out.println(fruits);
		fruits.remove(0);
		System.out.println(fruits);
		
		//contains() method - to check whether a given element is present or not in the list
		System.out.println(fruits.contains("Grapes"));
		System.out.println(fruits.contains("Apple"));
		
		//isEmpty() method - to check whether the given list is empty or not
		System.out.println(fruits.isEmpty());
		
		//size() method - used to find the number of elements in the list.
		System.out.println(fruits.size());
	}

}
