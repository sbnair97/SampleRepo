package inheritance;

public class HierarchicalChild1 extends HierarchicalParent
{
	
	public void displayChild1()
	{
		System.out.println("This is child 1");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HierarchicalChild1 obj = new HierarchicalChild1();
		obj.displayChild1();
		obj.display();

	}

}
