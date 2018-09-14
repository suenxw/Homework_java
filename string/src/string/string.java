package string;

public class string {
	public static void main (String[] args ) {
		 String c = "Hello";
		 String a = c;
		 System.out.println("c的地址： "+System.identityHashCode(c));
		 System.out.println("a的地址： "+System.identityHashCode(a));
		 
		 System.out.println("修改a的值后，再打印a和c的地址---------");
		 a="world";
		 System.out.println("c的地址： "+System.identityHashCode(c));
		 System.out.println("a的地址： "+System.identityHashCode(a));


	}

}
