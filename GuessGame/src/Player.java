public class Player{

	public int number;  //���ɵ��������0~9��

	public boolean guess(){
		number = (int)(Math.random()*10);
		return true;
	}//����һ���������������number����ֵ�ɹ�����true�����򷵻�false

}