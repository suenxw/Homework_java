import java.util.Scanner;

public class Car {
	public String brand;
	public int tank;
	public int oilConsumption;
	
	public Car() {
		brand = "����";
		tank = 10;
		oilConsumption =10;
	}
	
	public void buildCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�ĳ���Ʒ��");
		brand = sc.next();
		System.out.println("��������Ҫ�ĳ��������С");
		tank = sc.nextInt();
		System.out.println("��������Ҫ�ĳ����ͺ�");
		oilConsumption = sc.nextInt();
	}
	
	public boolean gas() {
		System.out.println("���Ѽ���");
		return true;
	}
	
	public boolean run() {
		System.out.println("���ѿ���");
		return true;
	}
	
	public void look() {
		System.out.println("����һ��"+brand+"�Ƶĳ�");
		System.out.println("��ĳ�������Ϊ "+tank+" L");
		System.out.println("��ĳ����ͺ�Ϊ "+oilConsumption+" L/km");
	}
	

}
