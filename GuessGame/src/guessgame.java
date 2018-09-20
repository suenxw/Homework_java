import java.util.Scanner;

/**
 * 游戏运行主类
 */
public class guessgame{

	public Player player1;  
	public Player player2;
	public Player player3;
	public int money;  //赢钱数

	public guessgame(){
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();
		money = 0;
	}//初始化3个player类变量和赢钱数

	//@SuppressWarnings("resource")
	public void startGame(){
		player1.guess();
		player2.guess();
		player3.guess();

		while(true){
			System.out.println("请猜一个0~9之间的整数：");
			//@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int playerNumber = scanner.nextInt();
			if(playerNumber<0||playerNumber>9){
				System.out.println("请按照规则输入！");
				continue;
			}
			if(playerNumber!=player1.number
				&&playerNumber!=player2.number&&playerNumber!=player3.number){
				money = money - 1; //猜错输一块钱
				System.out.println("猜错了，游戏继续");
			}else{
				money = money + 1;//猜对赢一块钱
				System.out.println("恭喜你赢了一块钱");
				break;
			}
		}

		if(money>0){
			System.out.println("恭喜您赢了"+money+"元");
		}else if(money==0){
			System.out.println("没赢也没输");
		}else{
			System.out.println("对不起，您输了"+money+"元");
		}
	}

}
