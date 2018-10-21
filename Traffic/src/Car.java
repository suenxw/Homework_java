//Æû³µÀà
public  class Car extends Traffic {

	protected void calculation(double distance) {
	name="Æû³µ";
	time1=10;
	time2=90;
	getTicketTime=5;
	securityCheckTime=1;
	waitingTime=5;
	speed=80;
	price=0.32;
	allTime=time1+time2+getTicketTime+securityCheckTime+waitingTime+(distance/speed)*60;
	allPrice=distance*price;
	}
	
}
