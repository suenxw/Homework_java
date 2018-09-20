public class Player{

	public int number;  //生成的随机数（0~9）

	public boolean guess(){
		number = (int)(Math.random()*10);
		return true;
	}//生成一个随机整数并赋给number，赋值成功返回true，否则返回false

}