class Bank
{
	void Interest()
	{
		
		System.out.println("Welcome to Bank");
	}
	}
class Boi extends Bank

{
	void Interest()
	{ 
		super.Interest();
		System.out.println("Welcome to Boi");
	}
}
class Axis extends Bank
{
	void Interest()
	{
		
		System.out.println("Welcome to Axis");
	}
	
}
 class Bankname {

	public static void main(String [] args) {
		Boi b=new Boi();
		b.Interest();
		Axis a=new Axis();
		a.Interest();
		
	}

}
