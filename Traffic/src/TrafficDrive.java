//������
import java.util.*;
public class TrafficDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("����������أ�");
			String start = sc.next();
			System.out.println("������Ŀ�ĵأ�");
			String end = sc.next();
			System.out.println("��������룺");
			if(sc.hasNextDouble()) {
				double distance = sc.nextInt();
				System.out.println(start+"��"+end+"������ͨ������������");
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
