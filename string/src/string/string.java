package string;

public class string {
	public static void main (String[] args ) {
		 String c = "Hello";
		 String a = c;
		 System.out.println("c�ĵ�ַ�� "+System.identityHashCode(c));
		 System.out.println("a�ĵ�ַ�� "+System.identityHashCode(a));
		 
		 System.out.println("�޸�a��ֵ���ٴ�ӡa��c�ĵ�ַ---------");
		 a="world";
		 System.out.println("c�ĵ�ַ�� "+System.identityHashCode(c));
		 System.out.println("a�ĵ�ַ�� "+System.identityHashCode(a));


	}

}
