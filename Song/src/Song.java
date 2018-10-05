/*
 * 歌曲类
 */
public class Song{

	public String songName;  //歌曲名称
	public String singer;  //歌手
	public double time;  //歌曲时长

	public Song(String songName, String singer, double time){
		this.songName = songName;
		this.singer = singer;
		this.time = time;
	}

}