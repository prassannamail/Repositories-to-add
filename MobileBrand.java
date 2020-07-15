package week1.day1;

public class MobileBrand {
	
	String mobileBrand= "Sony";
	int mobileModel = 123;
	boolean isUsed=false;
	
	public void mobileNumber() {
	long mobileNumber = 1238989899L;
	System.out.println(mobileNumber);
	}
	
	public static void main (String[] args) {
		MobileBrand myMobile = new MobileBrand();
		System.out.println(myMobile.mobileBrand);
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.isUsed);
		myMobile.mobileNumber();
		
	}

}
