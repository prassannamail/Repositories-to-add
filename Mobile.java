package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
           System.out.println("Make a Call");
	}
	
	public void sendSms() {
		System.out.println("Send a SMS");

	}
	
	public void takeSnap() {
		System.out.println("Take a Snap");
	}

	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendSms();
		myMobile.takeSnap();
		
	}
}
