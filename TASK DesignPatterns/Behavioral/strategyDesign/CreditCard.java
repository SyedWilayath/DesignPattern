public class CreditCard implements Payment{
	
	private String nameOfTheCardholder;
	private String cardNumber;
	private String cvvCode;
	private String dateOfExpiry;
	
	public CreditCard(String nameOfTheCardholder,String cardNumber,String cvvCode,String dateOfExpiry) {
		this.cardNumber=cardNumber;
		this.cvvCode=cvvCode;
		this.dateOfExpiry=dateOfExpiry;
		this.nameOfTheCardholder=nameOfTheCardholder;
	}
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount +" Paid with credit card");
	}

}
