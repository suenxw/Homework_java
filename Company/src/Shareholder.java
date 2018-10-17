import java.util.Set;
import java.util.Date;

//�ɶ���
public class Shareholder extends Employee{

	private double shares;  //ռ�йɷ�

	/**
	 * ��ʼ��Ա��������Ϣ
	 * �����ùɶ��ɷ�
	 */
	public Shareholder(String name,double wages,Date birthday,double shares){
		super(name,wages,birthday);
		this.shares = shares;
		this.type = 3;
	}

	public boolean checkShares(double shares, Set<Employee> employeeSet){
		double allshares = 0;
		for(Employee employee : employeeSet){
			if(employee.getType()==3){
				Shareholder shareholder = (Shareholder)employee;
				allshares = allshares + shareholder.getShares();
			}
		}
		if((allshares+shares)>1){
			return false;
		}else{
			return true;
		}
	}

	public double getShares(){
		return shares;
	}

}