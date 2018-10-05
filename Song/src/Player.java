import java.util.Scanner;

/*
 * 用户类，主要用于点歌
 */
public class Player{

	/*
	 * 由用户输入一首歌曲的信息
	 * 添加到主持人类的待播放列表中
	 */
	public boolean addSong(){
		System.out.println("请输入要添加的歌曲信息");
		Scanner sc = new Scanner(System.in);
		String songName = getUserInputString(sc,"歌名");
		String singer = getUserInputString(sc,"歌手");
		double time = getUserInputDouble(sc);
		
		Song song = new Song(songName,singer,time);
		master.listSong.add(song);
		return true;
	}

	/*获取用户输入的String信息*/
	public String getUserInputString(Scanner sc, String message){
		String returnValue;
		while(true){
			System.out.println("请输入歌曲的"+message+"：");
			returnValue = sc.next();
			if(returnValue==null||returnValue.equals("")){
				System.out.println(message+"不能为空，请重新输入");
			}else{
				break;
			}
		}
		return returnValue;
	}

	/**
	 * 获取用户输入的double信息
	 * @param sc接收用户的输入
	 * @reutrn double 用户输入的信息
	 */
	public double getUserInputDouble(Scanner sc){
		double returnValue;
		while(true){
			System.out.println("请输入歌曲的时长：");
			returnValue = sc.nextDouble();
			if(returnValue<=0){
				System.out.println("输入错误，请重新输入");
			}else{
				break;
			}
		}
		return returnValue;
	}

}