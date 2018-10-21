//控制类
import java.util.*;
public class TrafficDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("请输入出发地：");
			String start = sc.next();
			System.out.println("请输入目的地：");
			String end = sc.next();
			System.out.println("请输入距离：");
			if(sc.hasNextDouble()) {
				double distance = sc.nextInt();
				System.out.println(start+"到"+end+"各个交通工具所计算结果");
				Car car = new Car();
				car.Result(distance);
				Train train = new Train();
				train.Result(distance);
				Plane plane=new Plane();
				plane.Result(distance);
			}
		}
	}

}
