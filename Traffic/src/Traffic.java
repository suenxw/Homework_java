//交通抽象类
abstract public class Traffic {
	protected String name;//交通方式的名称
	protected double time1;//到车站或机场的开始时间（分钟）
	protected double time2;//从车站或机场到目的地的时间（分钟）
	protected double getTicketTime;//取票时间
	protected double securityCheckTime;//安检时间
	protected double waitingTime;//候车时间
	protected double speed;//车速
	protected double price;// 元/每公里
	protected double allTime;//总时间
	protected double allPrice;//总花费
	
	abstract protected void calculation(double distance);
	//计算交通方式消耗的时间和金钱
	
	public void Result(double distance) {
		calculation(distance);
		System.out.println("交通方式："+name+"总时间："+allTime+"总花费："+allPrice);
	}
}
