package inheritance;

public class HierarchicalChild2 extends HierarchicalParent
{
	
	public void displayChild2()
	{
		System.out.println("This is child 2");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HierarchicalChild2 obj = new HierarchicalChild2();
		obj.displayChild2();
		obj.display();

	}

}
