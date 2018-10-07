//创建HashSet数组，赋值1到1000000，并随机生成1000个数，在HashSet中查找，统计其所用时间
import java.util.HashSet;
import java.util.Random;

public class hashSet {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		HashSet<Integer> list =new HashSet<Integer>(2000000);
		for(int count =1;count<=1000000;count++) {
			list.add(count);
		}
		for(int i=0;i<1000;i++) {
			Random random = new Random();
			System.out.println(random.nextInt(1000000));
			boolean b =list.contains(random.nextInt(1000000));
			long endTime = System.currentTimeMillis();
	        long time = endTime - startTime;
			System.out.println("time:" + time);	
		}	
	}
}
