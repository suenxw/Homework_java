package homework1;

public class nursery{
	public static void main (String[] args )
	{
		String name="bottles";
		for(int count=99;count>0;count--) {
			System.out.println(count + " " + name + " of beer on the wall," + count + " " + name + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			if(count-1==1)
			{
				name="bottle";
			}
			if(count-1>0)
			{
				System.out.println((count - 1) + " " + name + " of beer on the wall.");
			}
			else
			{
				System.out.println("no bottle of beer on the wall");
			}
			System.out.println("---------------------ÈË¹¤·Ö¸î·û-------------------");
		}
	}
}