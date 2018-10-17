import java.util.Set;
import java.util.Date;

//股东类
public class Shareholder extends Employee{

	private double shares;  //占有股份

	/**
	 * 初始化员工基本信息
	 * 并设置股东股份
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