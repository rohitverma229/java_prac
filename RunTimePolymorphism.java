class Computer
{
	void meth()
	{
		System.out.println("coding is escaping from my mind");
	}
}
public class RunTimePolymorphism extends Computer
{
	void meth()
	{
		System.out.println("keep try to learn program ");
	}
	public static void main(String argc[])
	{
		Computer C = new RunTimePolymorphism();
		C.meth();
	}
}
