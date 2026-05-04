package superkeyword;

public class SuperMethodChild extends SuperMethodParent
{
	public void display()
	{
		super.print();
		System.out.println("to the child class");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SuperMethodChild obj = new SuperMethodChild();
		obj.display();
	}

}
