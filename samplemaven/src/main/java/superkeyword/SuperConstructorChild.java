package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
	public SuperConstructorChild()
	{
		super(8,5);
		System.out.println("Child constructor");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();
	}

}
