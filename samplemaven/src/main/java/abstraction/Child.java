package abstraction;

public class Child extends Parent
{

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.addition();
		obj.subtraction();

	}

	@Override
	public void addition() 
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	@Override
	public void subtraction() 
	{
		int a = 20;
		int b = 10;
		int c = a - b;
		System.out.println(c);
	}

}
