//��ͨ������
abstract public class Traffic {
	protected String name;//��ͨ��ʽ������
	protected double time1;//����վ������Ŀ�ʼʱ�䣨���ӣ�
	protected double time2;//�ӳ�վ�������Ŀ�ĵص�ʱ�䣨���ӣ�
	protected double getTicketTime;//ȡƱʱ��
	protected double securityCheckTime;//����ʱ��
	protected double waitingTime;//��ʱ��
	protected double speed;//����
	protected double price;// Ԫ/ÿ����
	protected double allTime;//��ʱ��
	protected double allPrice;//�ܻ���
	
	abstract protected void calculation(double distance);
	//���㽻ͨ��ʽ���ĵ�ʱ��ͽ�Ǯ
	
	public void Result(double distance) {
		calculation(distance);
		System.out.println("��ͨ��ʽ��"+name+"��ʱ�䣺"+allTime+"�ܻ��ѣ�"+allPrice);
	}
}
