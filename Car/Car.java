import java.util.Scanner;

public class Car {
	public String brand;//汽车名
	public int tank;//一个油箱用来储存汽油
	public int oilConsumption;//油耗
	
	public Car() {
		brand = "GTR";
		tank = 10;
		oilConsumption =10;
	}
	
	public void buildCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入汽车名");
		brand = sc.next();
		System.out.println("输入油箱大小");
		tank = sc.nextInt();
		System.out.println("输入车的油耗");
		oilConsumption = sc.nextInt();
	}
	
	public boolean gas() {
		System.out.println("油已加满");
		return true;
	}
	
	public boolean run() {
		System.out.println("车已开动");
		return true;
	}
	
	public void nature() {
		System.out.println("你有一辆"+brand+"牌的车");
		System.out.println("你的车的油箱为 "+tank+" L");
		System.out.println("你的车的油耗为 "+oilConsumption+" L/km");
	}
	

}
