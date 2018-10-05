import java.util.Scanner;

/*
 * �û��࣬��Ҫ���ڵ��
 */
public class Player{

	/*
	 * ���û�����һ�׸�������Ϣ
	 * ��ӵ���������Ĵ������б���
	 */
	public boolean addSong(){
		System.out.println("������Ҫ��ӵĸ�����Ϣ");
		Scanner sc = new Scanner(System.in);
		String songName = getUserInputString(sc,"����");
		String singer = getUserInputString(sc,"����");
		double time = getUserInputDouble(sc);
		
		Song song = new Song(songName,singer,time);
		master.listSong.add(song);
		return true;
	}

	/*��ȡ�û������String��Ϣ*/
	public String getUserInputString(Scanner sc, String message){
		String returnValue;
		while(true){
			System.out.println("�����������"+message+"��");
			returnValue = sc.next();
			if(returnValue==null||returnValue.equals("")){
				System.out.println(message+"����Ϊ�գ�����������");
			}else{
				break;
			}
		}
		return returnValue;
	}

	/**
	 * ��ȡ�û������double��Ϣ
	 * @param sc�����û�������
	 * @reutrn double �û��������Ϣ
	 */
	public double getUserInputDouble(Scanner sc){
		double returnValue;
		while(true){
			System.out.println("�����������ʱ����");
			returnValue = sc.nextDouble();
			if(returnValue<=0){
				System.out.println("�����������������");
			}else{
				break;
			}
		}
		return returnValue;
	}

}