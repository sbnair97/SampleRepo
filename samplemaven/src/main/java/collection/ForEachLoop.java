package collection;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		for(int b:a)
		{
			System.out.println(b);
		}
		
		List<String> colors = new ArrayList <String>();
		colors.add("Orange");
		colors.add("Red");
		colors.add("Blue");
		
		for(String s : colors)
		{
			System.out.println(s);
		}
		List fruits = new ArrayList ();
		fruits.add("Orange");
		fruits.add("O");
		fruits.add(1);
		for(Object o:fruits)
		{
			System.out.println(o);
		}
	}

}
