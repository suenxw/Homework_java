import java.util.Date;

//������
public class Leader extends Employee{

	private double bonus;  //����

	/**
	 * ��ʼ��Ա��������Ϣ
	 * �����ý���̶�Ϊ5000
	 */
	public Leader(String name,double wages,Date birthday){
		super(name,wages,birthday);
		bonus = 5000;
		this.type = 2;
	}

//������
	public double getWages(){
		String message = name+"����Ӧ�����ʣ�"+wages+",ʵ�����ʣ�"+wages+",����"+bonus;
		System.out.println(message);
		return wages+bonus;
	}

}