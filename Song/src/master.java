import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*主持人类*/
public class master{

	public static List<Song> listSong;  //定义list歌曲列表
	
	/*初始化listSong*/
	public master(){
		listSong = new ArrayList<>();
	}

	/**
	  * 播放歌曲，每调用一次播放一首歌
	  * 询问主持人选择哪种播放模式（由用户输入）
	  * 如果主持人选择顺序播放，则顺序播放list中的一首歌
	  * 如果主持人选择挑选播放，则播放一首挑选的歌曲（由用户输入）
	*/
	public boolean play(){
		if(listSong.size()==0){
			System.out.println("无可播放的歌曲，需选择用户模式进行添加");
			return false;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("您是要顺序播放还是挑选播放（顺序输入1，挑选输入2）：");
		String message = sc.next();
		if("1".equals(message)){
			playerOneSong(0);
		}else if("2".equals(message)){
			System.out.println("请选择要播放的歌曲编号，可选编号1~"+listSong.size());
			if(sc.hasNextInt()){
				int number = sc.nextInt();
				if(number>=1&&number<=listSong.size()){
					playerOneSong(number-1);
				}else{
					System.out.println("播放超范围！");
					return false;
				}
			}else{
				System.out.println("输入错误,请重新挑选");
				return false;
			}
		}else{
			System.out.println("输入错误，请重新挑选");
			return false;
		}
		return true;
	}

	public void playerOneSong(int number){
		Song song = listSong.get(number);
		System.out.println("播放"+song.singer+"  延长的"+song.songName+"，  耗时："+song.time+"s");
		listSong.remove(number);
	}

}