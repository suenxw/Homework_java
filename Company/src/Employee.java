import java.util.Date;

//雇员类
public class Employee implements Comparable {

	protected String name;  //员工名称
	protected double wages;  //员工工资
	protected Date birthday;  //员工生日
    protected byte type;  //员工类型：1普通员工，2经理，3股东

    //初始化员工基本信息
	public Employee(String name,double wages,Date birthday){
		this.name = name;
		this.wages = wages;
		this.birthday = birthday;
		type = 1;
	}

	//发工资
	public double getWages(){
		String message = name+"当月应发工资："+wages+",实发工资："+wages;
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