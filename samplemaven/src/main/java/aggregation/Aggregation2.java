package aggregation;

public class Aggregation2 
{
	String city,state;
	Aggregation1 ref;
	public Aggregation2(String city, String state,Aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void print()
	{
		System.out.println("Name    :"+ref.name);
		System.out.println("Rollno  :"+ref.rollno);
		System.out.println("Address :"+ref.address);
		System.out.println("City    :"+city);
		System.out.println("State   :"+state);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Aggregation1 obj = new Aggregation1("Sachin",58,"ABC Lane");
		Aggregation2 obj1 = new Aggregation2("Kottayam","Kerala",obj);
		obj1.print();
	}

}
