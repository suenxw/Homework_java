import java.util.Date;

//��Ա��
public class Employee implements Comparable {

	protected String name;  //Ա������
	protected double wages;  //Ա������
	protected Date birthday;  //Ա������
    protected byte type;  //Ա�����ͣ�1��ͨԱ����2����3�ɶ�

    //��ʼ��Ա��������Ϣ
	public Employee(String name,double wages,Date birthday){
		this.name = name;
		this.wages = wages;
		this.birthday = birthday;
		type = 1;
	}

	//������
	public double getWages(){
		String message = name+"����Ӧ�����ʣ�"+wages+",ʵ�����ʣ�"+wages;
		System.out.println(message);
		return wages;
	}

	public int hashCode(){
		return name.hashCode();
	}

	public boolean equals(Object o){
		Employee employee = (Employee)o;
		return name.equals(employee.getName());
	}

	public int compareTo(Object o) {
        Employee employee = (Employee)o;
		Byte byte1 = new Byte(type);
		Byte byte2 = new Byte(employee.getType());
        return byte1.compareTo(byte2);
    }

	public String getName(){
		return name;
	}

	public byte getType(){
		return type;
	}

}