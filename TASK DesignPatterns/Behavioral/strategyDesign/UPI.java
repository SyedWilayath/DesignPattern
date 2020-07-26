public class UPI implements Payment {
	private String upiId;
	private String pin;

	public UPI(String upiId,String pin) {
		this.pin=pin;
		this.upiId=upiId;
	}
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" Paid with UPI ");
		
	}

}
