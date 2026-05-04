package polymorphism;

public class PolyChild extends PolyParent
{
	public void display()
	{
		super.display();
		System.out.println("Child Class");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PolyChild obj = new PolyChild();
		obj.display();
	}

}
