import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*��������*/
public class master{

	public static List<Song> listSong;  //����list�����б�
	
	/*��ʼ��listSong*/
	public master(){
		listSong = new ArrayList<>();
	}

	/**
	  * ���Ÿ�����ÿ����һ�β���һ�׸�
	  * ѯ��������ѡ�����ֲ���ģʽ�����û����룩
	  * ���������ѡ��˳�򲥷ţ���˳�򲥷�list�е�һ�׸�
	  * ���������ѡ����ѡ���ţ��򲥷�һ����ѡ�ĸ��������û����룩
	*/
	public boolean play(){
		if(listSong.size()==0){
			System.out.println("�޿ɲ��ŵĸ�������ѡ���û�ģʽ�������");
			return false;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ҫ˳�򲥷Ż�����ѡ���ţ�˳������1����ѡ����2����");
		String message = sc.next();
		if("1".equals(message)){
			playerOneSong(0);
		}else if("2".equals(message)){
			System.out.println("��ѡ��Ҫ���ŵĸ�����ţ���ѡ���1~"+listSong.size());
			if(sc.hasNextInt()){
				int number = sc.nextInt();
				if(number>=1&&number<=listSong.size()){
					playerOneSong(number-1);
				}else{
					System.out.println("���ų���Χ��");
					return false;
				}
			}else{
				System.out.println("�������,��������ѡ");
				return false;
			}
		}else{
			System.out.println("���������������ѡ");
			return false;
		}
		return true;
	}

	public void playerOneSong(int number){
		Song song = listSong.get(number);
		System.out.println("����"+song.singer+"  �ӳ���"+song.songName+"��  ��ʱ��"+song.time+"s");
		listSong.remove(number);
	}

}