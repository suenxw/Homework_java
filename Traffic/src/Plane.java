//·É»úÀà
public class Plane extends Traffic {

	protected void calculation(double distance) {
		name="·É»ú";
		time1=25;
		time2=30;
		getTicketTime=10;
		securityCheckTime=10;
		waitingTime=20;
		speed=700;
		price=0.75;
		allTime=time1+time2+getTicketTime+securityCheckTime+waitingTime+(distance/speed)*60;
		allPrice=distance*price;
	}

}
