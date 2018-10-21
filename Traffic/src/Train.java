//»ð³µÀà
public class Train extends Traffic {

	protected void calculation(double distance) {
		name="»ð³µ";
		time1=10;
		time2=60;
		getTicketTime=5;
		securityCheckTime=1;
		waitingTime=5;
		speed=200;
		price=0.45;
		allTime=time1+time2+getTicketTime+securityCheckTime+waitingTime+(distance/speed)*60;
		allPrice=distance*price;
		
	}

}
