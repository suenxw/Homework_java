import java.util.Scanner;

public class SongDrive{

	public master master;

	public Player player;

	public SongDrive(){
		master = new master();
		player = new Player();
	}

	public static void main(String[] args){
		SongDrive songDrive = new SongDrive();
		while(true){
			System.out.println("������Ҫѡ���ģʽ��1.������ģʽ��2.�û�ģʽ��");
			Scanner sc = new Scanner(System.in);
			String message = sc.next();
			if("1".equals(message)){
				songDrive.master.play();
			}else if("2".equals(message)){
				songDrive.player.addSong();
			}else{
				System.out.println("ѡ�����");
			}
		}
	}

}