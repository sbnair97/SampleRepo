package inheritance;

public class MultilevelChild extends MultilevelParent
{
    public void displayChild()
    {
    	System.out.println("This is a method from Child class");
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MultilevelChild obj =  new MultilevelChild();
		obj.displayGrandParent();
		obj.displayParent();
		obj.displayChild();

	}

}
