import java.util.Scanner;

/**
 * ��Ϸ��������
 */
public class guessgame{

	public Player player1;  
	public Player player2;
	public Player player3;
	public int money;  //ӮǮ��

	public guessgame(){
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();
		money = 0;
	}//��ʼ��3��player�������ӮǮ��

	//@SuppressWarnings("resource")
	public void startGame(){
		player1.guess();
		player2.guess();
		player3.guess();

		while(true){
			System.out.println("���һ��0~9֮���������");
			//@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int playerNumber = scanner.nextInt();
			if(playerNumber<0||playerNumber>9){
				System.out.println("�밴�չ������룡");
				continue;
			}
			if(playerNumber!=player1.number
				&&playerNumber!=player2.number&&playerNumber!=player3.number){
				money = money - 1; //�´���һ��Ǯ
				System.out.println("�´��ˣ���Ϸ����");
			}else{
				money = money + 1;//�¶�Ӯһ��Ǯ
				System.out.println("��ϲ��Ӯ��һ��Ǯ");
				break;
			}
		}

		if(money>0){
			System.out.println("��ϲ��Ӯ��"+money+"Ԫ");
		}else if(money==0){
			System.out.println("ûӮҲû��");
		}else{
			System.out.println("�Բ���������"+money+"Ԫ");
		}
	}

}
